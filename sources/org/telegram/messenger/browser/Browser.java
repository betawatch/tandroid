package org.telegram.messenger.browser;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CustomTabsCopyReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.ShareBroadcastReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.support.customtabs.CustomTabsCallback;
import org.telegram.messenger.support.customtabs.CustomTabsClient;
import org.telegram.messenger.support.customtabs.CustomTabsIntent;
import org.telegram.messenger.support.customtabs.CustomTabsServiceConnection;
import org.telegram.messenger.support.customtabs.CustomTabsSession;
import org.telegram.messenger.support.customtabsclient.shared.CustomTabsHelper;
import org.telegram.messenger.support.customtabsclient.shared.ServiceConnection;
import org.telegram.messenger.support.customtabsclient.shared.ServiceConnectionCallback;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.EmptyBaseFragment;
import org.telegram.ui.LaunchActivity;

/* loaded from: classes3.dex */
public abstract class Browser {
    private static WeakReference currentCustomTabsActivity;
    private static CustomTabsClient customTabsClient;
    private static WeakReference customTabsCurrentSession;
    private static String customTabsPackageToBind;
    private static CustomTabsServiceConnection customTabsServiceConnection;
    private static CustomTabsSession customTabsSession;
    private static Pattern domainPattern;

    private static void setCurrentSession(CustomTabsSession customTabsSession2) {
        customTabsCurrentSession = new WeakReference(customTabsSession2);
    }

    private static CustomTabsSession getSession() {
        CustomTabsClient customTabsClient2 = customTabsClient;
        if (customTabsClient2 == null) {
            customTabsSession = null;
        } else if (customTabsSession == null) {
            CustomTabsSession newSession = customTabsClient2.newSession(new NavigationCallback());
            customTabsSession = newSession;
            setCurrentSession(newSession);
        }
        return customTabsSession;
    }

    public static void bindCustomTabsService(Activity activity) {
        WeakReference weakReference = currentCustomTabsActivity;
        Activity activity2 = weakReference == null ? null : (Activity) weakReference.get();
        if (activity2 != null && activity2 != activity) {
            unbindCustomTabsService(activity2);
        }
        if (customTabsClient != null) {
            return;
        }
        currentCustomTabsActivity = new WeakReference(activity);
        try {
            if (TextUtils.isEmpty(customTabsPackageToBind)) {
                String packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity);
                customTabsPackageToBind = packageNameToUse;
                if (packageNameToUse == null) {
                    return;
                }
            }
            ServiceConnection serviceConnection = new ServiceConnection(new ServiceConnectionCallback() { // from class: org.telegram.messenger.browser.Browser.1
                @Override // org.telegram.messenger.support.customtabsclient.shared.ServiceConnectionCallback
                public void onServiceConnected(CustomTabsClient customTabsClient2) {
                    CustomTabsClient unused = Browser.customTabsClient = customTabsClient2;
                    if (!MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() || Browser.customTabsClient == null) {
                        return;
                    }
                    try {
                        Browser.customTabsClient.warmup(0L);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }

                @Override // org.telegram.messenger.support.customtabsclient.shared.ServiceConnectionCallback
                public void onServiceDisconnected() {
                    CustomTabsClient unused = Browser.customTabsClient = null;
                }
            });
            customTabsServiceConnection = serviceConnection;
            if (CustomTabsClient.bindCustomTabsService(activity, customTabsPackageToBind, serviceConnection)) {
                return;
            }
            customTabsServiceConnection = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void unbindCustomTabsService(Activity activity) {
        if (customTabsServiceConnection == null) {
            return;
        }
        WeakReference weakReference = currentCustomTabsActivity;
        if ((weakReference == null ? null : (Activity) weakReference.get()) == activity) {
            currentCustomTabsActivity.clear();
        }
        try {
            activity.unbindService(customTabsServiceConnection);
        } catch (Exception unused) {
        }
        customTabsClient = null;
        customTabsSession = null;
    }

    private static class NavigationCallback extends CustomTabsCallback {
        @Override // org.telegram.messenger.support.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
        }

        private NavigationCallback() {
        }
    }

    public static void openUrl(Context context, String str) {
        if (str == null) {
            return;
        }
        openUrl(context, Uri.parse(str), true);
    }

    public static void openUrlInSystemBrowser(Context context, String str) {
        if (str == null) {
            return;
        }
        openUrl(context, Uri.parse(str), false, true, false, null, null, false, false, false);
    }

    public static void openUrl(Context context, Uri uri) {
        openUrl(context, uri, true);
    }

    public static void openUrl(Context context, String str, boolean z) {
        if (context == null || str == null) {
            return;
        }
        openUrl(context, Uri.parse(str), z);
    }

    public static void openUrl(Context context, Uri uri, boolean z) {
        openUrl(context, uri, z, true);
    }

    public static void openUrl(Context context, String str, boolean z, boolean z2) {
        openUrl(context, Uri.parse(str), z, z2);
    }

    public static boolean isTelegraphUrl(String str, boolean z) {
        return isTelegraphUrl(str, z, false);
    }

    public static boolean isTelegraphUrl(String str, boolean z, boolean z2) {
        if (z) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^(https");
        sb.append(z2 ? "" : "?");
        sb.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb.toString());
    }

    public static String extractUsername(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            if (str.startsWith("@")) {
                return str.substring(1);
            }
            if (str.startsWith("t.me/")) {
                return str.substring(5);
            }
            if (str.startsWith("http://t.me/")) {
                return str.substring(12);
            }
            if (str.startsWith("https://t.me/")) {
                return str.substring(13);
            }
            Matcher matcher = LaunchActivity.PREFIX_T_ME_PATTERN.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static boolean urlMustNotHaveConfirmation(String str) {
        return isTelegraphUrl(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") || str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") || str.matches("^(https://)?fragment\\.com(/.*|$)");
    }

    public static class Progress {
        private Runnable onCancelListener;
        private Runnable onEndListener;
        private Runnable onInitListener;

        public Progress() {
        }

        public Progress(Runnable runnable, Runnable runnable2) {
            this.onInitListener = runnable;
            this.onEndListener = runnable2;
        }

        public void init() {
            Runnable runnable = this.onInitListener;
            if (runnable != null) {
                runnable.run();
                this.onInitListener = null;
            }
        }

        public void end() {
            end(false);
        }

        public void end(boolean z) {
            Runnable runnable = this.onEndListener;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void cancel() {
            cancel(false);
        }

        public void cancel(boolean z) {
            Runnable runnable = this.onCancelListener;
            if (runnable != null) {
                runnable.run();
            }
            end(z);
        }

        public Progress onCancel(Runnable runnable) {
            this.onCancelListener = runnable;
            return this;
        }

        public Progress onEnd(Runnable runnable) {
            this.onEndListener = runnable;
            return this;
        }
    }

    public static void openUrl(Context context, Uri uri, boolean z, boolean z2) {
        openUrl(context, uri, z, z2, false, null, null, false, true, false);
    }

    public static void openUrl(Context context, Uri uri, boolean z, boolean z2, Progress progress) {
        openUrl(context, uri, z, z2, false, progress, null, false, true, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:21|(10:124|125|126|26|27|(5:112|113|114|115|116)(1:29)|(3:(2:32|(1:34))|35|(2:50|(2:52|53)(7:54|55|56|57|58|59|61)))|62|(3:91|92|(2:(1:95)|107))|64)|25|26|27|(0)(0)|(0)|62|(0)|64) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0249, code lost:
    
        if (r9.getScheme() != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0253, code lost:
    
        if (r8.equals(r9.getScheme()) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025d, code lost:
    
        if ("http".equals(r9.getScheme()) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026a, code lost:
    
        if ("tonsite".equals(r9.getScheme()) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023d, code lost:
    
        if (isInstantViewOpen() != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x021f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0274, code lost:
    
        if (isTonsite(r9.toString()) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0276, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x027d, code lost:
    
        if (r9.getScheme() == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027f, code lost:
    
        r9.getScheme().equalsIgnoreCase("intent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0286, code lost:
    
        if (r13 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0288, code lost:
    
        r0 = org.telegram.ui.LaunchActivity.instance;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x028a, code lost:
    
        if (r0 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x028c, code lost:
    
        openAsInternalIntent(r0, r9.toString(), r20, r25, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0298, code lost:
    
        if (r2 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a2, code lost:
    
        if (openInExternalApp(r16, r9.toString(), r23) != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02a8, code lost:
    
        if (r9.getScheme() == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02b2, code lost:
    
        if (r9.getScheme().equalsIgnoreCase("intent") == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02b4, code lost:
    
        r0 = android.content.Intent.parseUri(r9.toString(), 1).getStringExtra("browser_fallback_url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02c7, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c9, code lost:
    
        r9 = android.net.Uri.parse(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02cd, code lost:
    
        openInTelegramBrowser(r16, r9.toString(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02d5, code lost:
    
        openInExternalBrowser(r16, r9.toString(), r23, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0237, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r3).isWebBrowserOpenInApp(r9.toString()) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0243, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void openUrl(final Context context, final Uri uri, boolean z, boolean z2, boolean z3, Progress progress, String str, boolean z4, boolean z5, boolean z6) {
        final boolean z7;
        boolean z8;
        final Progress progress2;
        String str2;
        boolean z9;
        Uri uri2;
        String lowerCase;
        String hostAuthority;
        char c;
        if (context == null || uri == null) {
            return;
        }
        final int i = UserConfig.selectedAccount;
        boolean[] zArr = {false};
        boolean isInternalUri = isInternalUri(uri, zArr);
        String browserPackageName = getBrowserPackageName(str);
        if (browserPackageName != null) {
            z8 = false;
            z7 = false;
        } else {
            z7 = z;
            z8 = z2;
        }
        if (z8) {
            try {
                String hostAuthority2 = AndroidUtilities.getHostAuthority(uri);
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                    if (!isTelegraphUrl(hostAuthority2, true)) {
                        if ("telegram.org".equalsIgnoreCase(hostAuthority2)) {
                            if (!uri.toString().toLowerCase().contains("telegram.org/faq")) {
                                if (!uri.toString().toLowerCase().contains("telegram.org/privacy")) {
                                    if (uri.toString().toLowerCase().contains("telegram.org/blog")) {
                                    }
                                }
                            }
                        }
                    }
                    final AlertDialog[] alertDialogArr = {new AlertDialog(context, 3)};
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = uri.toString();
                    progress2 = progress;
                    try {
                        final int sendRequest = ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(getwebpagepreview, new RequestDelegate() { // from class: org.telegram.messenger.browser.Browser$$ExternalSyntheticLambda0
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.browser.Browser$$ExternalSyntheticLambda3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Browser.$r8$lambda$r0CCM-iFnrGCwmVQpGqtZgRrTxo(Browser.Progress.this, r2, tLObject, r4, r5, r6, r7);
                                    }
                                });
                            }
                        });
                        if (progress2 != null) {
                            progress2.init();
                            return;
                        }
                        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.browser.Browser$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Browser.$r8$lambda$7LZ2gk4KysH4NPPJAO6oZpWQocA(alertDialogArr, sendRequest);
                            }
                        };
                        str2 = "https";
                        z9 = false;
                        try {
                            AndroidUtilities.runOnUIThread(runnable, 1000L);
                            return;
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                    }
                }
            } catch (Exception unused3) {
            }
        }
        progress2 = progress;
        str2 = "https";
        z9 = false;
        try {
            lowerCase = uri.getScheme() != null ? uri.getScheme().toLowerCase() : "";
        } catch (Exception e) {
            e = e;
            uri2 = uri;
        }
        if (lowerCase != null && lowerCase.contains(".")) {
            return;
        }
        if ("http".equals(lowerCase) || str2.equals(lowerCase)) {
            try {
                uri2 = uri.normalizeScheme();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            hostAuthority = AndroidUtilities.getHostAuthority(uri2.toString().toLowerCase());
            if (AccountInstance.getInstance(i).getMessagesController().autologinDomains.contains(hostAuthority)) {
                c = 0;
            } else {
                try {
                    c = 0;
                } catch (Exception e3) {
                    e = e3;
                }
                try {
                    uri2 = uri2.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().autologinToken, "UTF-8")).build();
                } catch (Exception e4) {
                    e = e4;
                    z9 = false;
                    FileLog.e(e);
                    if (z5) {
                    }
                }
            }
            if (z7) {
                if (uri2 == null) {
                    if (!MessagesController.getInstance(i).isWebBrowserOpenInApp(uri2.toString())) {
                    }
                }
                if (!isInstantViewOpen() && MessagesController.getInstance(i).isWebBrowserUseCustomTabs() && !isInternalUri && !lowerCase.equals("tel") && !isTonsite(uri2.toString()) && (zArr[c] || !openInExternalApp(context, uri2.toString(), false) || !hasAppToOpen(context, uri2.toString()))) {
                    if (MessagesController.getInstance(i).authDomains.contains(hostAuthority)) {
                        Intent intent = new Intent("android.intent.action.VIEW", uri2);
                        intent.addFlags(TLObject.FLAG_28);
                        ApplicationLoader.applicationContext.startActivity(intent);
                        return;
                    }
                    Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                    intent2.setAction("android.intent.action.SEND");
                    PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(getSession());
                    builder.addMenuItem(LocaleController.getString(R.string.CopyLink), broadcast);
                    builder.setToolbarColor(Theme.getColor(Theme.key_actionBarBrowser));
                    builder.setShowTitle(true);
                    z9 = false;
                    builder.setActionButton(BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout), LocaleController.getString(R.string.ShareFile), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent2, 33554432), true);
                    CustomTabsIntent build = builder.build();
                    build.setUseNewTask();
                    build.launchUrl(context, uri2);
                    return;
                }
            }
            z9 = false;
            if (z5) {
                try {
                    if (BubbleActivity.instance == null) {
                        if (uri2 != null) {
                        }
                    }
                } catch (Exception e5) {
                    FileLog.e(e5);
                    return;
                }
            }
        }
        uri2 = uri;
        hostAuthority = AndroidUtilities.getHostAuthority(uri2.toString().toLowerCase());
        if (AccountInstance.getInstance(i).getMessagesController().autologinDomains.contains(hostAuthority)) {
        }
        if (z7) {
        }
        z9 = false;
        if (z5) {
        }
    }

    public static /* synthetic */ void $r8$lambda$r0CCM-iFnrGCwmVQpGqtZgRrTxo(Progress progress, AlertDialog[] alertDialogArr, TLObject tLObject, int i, Uri uri, Context context, boolean z) {
        if (progress != null) {
            progress.end();
        } else {
            try {
                alertDialogArr[0].dismiss();
            } catch (Throwable unused) {
            }
            alertDialogArr[0] = null;
        }
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(i).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(i).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                if ((webPage instanceof TLRPC.TL_webPage) && webPage.cached_page != null) {
                    NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.openArticle, tL_messageMediaWebPage.webpage, uri.toString());
                    return;
                }
            }
        }
        openUrl(context, uri, z, false);
    }

    public static /* synthetic */ void $r8$lambda$7LZ2gk4KysH4NPPJAO6oZpWQocA(AlertDialog[] alertDialogArr, final int i) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        try {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.messenger.browser.Browser$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i, true);
                }
            });
            alertDialogArr[0].show();
        } catch (Exception unused) {
        }
    }

    public static boolean openAsInternalIntent(Context context, String str) {
        return openAsInternalIntent(context, str, false, false, null);
    }

    public static boolean openAsInternalIntent(Context context, String str, boolean z, boolean z2, Progress progress) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (AndroidUtilities.findActivity(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) AndroidUtilities.findActivity(context);
        } else {
            launchActivity = LaunchActivity.instance;
            if (launchActivity == null) {
                return false;
            }
        }
        if (launchActivity == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setComponent(new ComponentName(context.getPackageName(), LaunchActivity.class.getName()));
        intent.putExtra("create_new_tab", true);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("force_not_internal_apps", z);
        intent.putExtra("force_request", z2);
        launchActivity.onNewIntent(intent, progress);
        return true;
    }

    public static boolean isInstantViewOpen() {
        EmptyBaseFragment sheetFragment;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null || !(safeLastFragment.getParentLayout() instanceof ActionBarLayout) || (sheetFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment()) == null || sheetFragment.getArticleViewer() == null) {
            return (safeLastFragment == null || safeLastFragment.getArticleViewer() == null) ? false : true;
        }
        return true;
    }

    public static boolean openInTelegramBrowser(Context context, String str, Progress progress) {
        BottomSheetTabs bottomSheetTabs;
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null && (bottomSheetTabs = launchActivity.getBottomSheetTabs()) != null && bottomSheetTabs.tryReopenTab(str) != null) {
            return true;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null && safeLastFragment.getArticleViewer() != null) {
            safeLastFragment.getArticleViewer().open(str, progress);
            return true;
        }
        if (safeLastFragment != null && (safeLastFragment.getParentLayout() instanceof ActionBarLayout)) {
            safeLastFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment();
        }
        if (safeLastFragment == null) {
            return false;
        }
        safeLastFragment.createArticleViewer(false).open(str, progress);
        return true;
    }

    public static boolean openInExternalBrowser(Context context, String str, boolean z) {
        return openInExternalBrowser(context, str, z, null);
    }

    public static boolean openInExternalBrowser(Context context, String str, boolean z, String str2) {
        Intent intent;
        if (str == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            boolean z2 = parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent");
            if (z2 && !z) {
                return false;
            }
            if (z2) {
                intent = Intent.parseUri(parse.toString(), 1);
            } else {
                intent = new Intent("android.intent.action.VIEW", parse);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.setPackage(str2);
            }
            intent.putExtra("create_new_tab", true);
            intent.putExtra("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean isTonsite(String str) {
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite");
    }

    public static boolean isTonsitePunycode(String str) {
        boolean matches;
        if (domainPattern == null) {
            domainPattern = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            matches = domainPattern.matcher(hostAuthority).matches();
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null || !parse.getScheme().equalsIgnoreCase("tonsite")) {
                return false;
            }
            matches = domainPattern.matcher(parse.getScheme()).matches();
        }
        return !matches;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[Catch: Exception -> 0x0020, ActivityNotFoundException -> 0x0023, TryCatch #2 {ActivityNotFoundException -> 0x0023, Exception -> 0x0020, blocks: (B:6:0x0004, B:8:0x000a, B:11:0x0013, B:14:0x002a, B:16:0x0030, B:17:0x003d, B:20:0x004e, B:22:0x005f, B:24:0x0065, B:32:0x007c, B:34:0x008e, B:36:0x0094, B:37:0x00b2, B:41:0x00ab, B:44:0x0085, B:46:0x004a, B:47:0x0039, B:48:0x0026), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085 A[Catch: Exception -> 0x0020, ActivityNotFoundException -> 0x0023, TryCatch #2 {ActivityNotFoundException -> 0x0023, Exception -> 0x0020, blocks: (B:6:0x0004, B:8:0x000a, B:11:0x0013, B:14:0x002a, B:16:0x0030, B:17:0x003d, B:20:0x004e, B:22:0x005f, B:24:0x0065, B:32:0x007c, B:34:0x008e, B:36:0x0094, B:37:0x00b2, B:41:0x00ab, B:44:0x0085, B:46:0x004a, B:47:0x0039, B:48:0x0026), top: B:5:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean openInExternalApp(Context context, String str, boolean z) {
        boolean z2;
        Intent intent;
        if (str == null) {
            return false;
        }
        try {
            if (!isTonsite(str) && !isInternalUrl(str, null)) {
                Uri parse = Uri.parse(str);
                String replace = replace(parse, parse.getScheme() == null ? "https" : parse.getScheme(), null, parse.getHost() != null ? parse.getHost().toLowerCase() : parse.getHost(), TextUtils.isEmpty(parse.getPath()) ? "/" : parse.getPath());
                Uri parse2 = Uri.parse(replace);
                if (!replace.startsWith("intent://") && (parse2.getScheme() == null || !parse2.getScheme().equalsIgnoreCase("intent"))) {
                    z2 = false;
                    if (!z2 && !z) {
                        return false;
                    }
                    if (!z2) {
                        intent = Intent.parseUri(parse2.toString(), 1);
                    } else {
                        intent = new Intent("android.intent.action.VIEW", parse2);
                    }
                    if (z2 && Build.VERSION.SDK_INT >= 30) {
                        intent.addCategory("android.intent.category.BROWSABLE");
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.addFlags(TLObject.FLAG_28);
                        intent.addFlags(1024);
                    } else if (!z2 && !hasAppToOpen(context, replace)) {
                        return false;
                    }
                    context.startActivity(intent);
                    return true;
                }
                z2 = true;
                if (!z2) {
                }
                if (!z2) {
                }
                if (z2) {
                }
                if (!z2) {
                    return false;
                }
                context.startActivity(intent);
                return true;
            }
            return false;
        } catch (ActivityNotFoundException e) {
            FileLog.e((Throwable) e, false);
            return false;
        } catch (Exception e2) {
            FileLog.e(e2);
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(2:6|7)|(11:11|12|(5:16|(2:18|19)(1:21)|20|13|14)|22|23|24|25|(3:27|(4:30|(2:31|(1:1)(2:33|(3:36|37|38)(1:35)))|39|28)|41)(3:57|(4:60|(2:62|63)(1:65)|64|58)|66)|42|(3:44|(3:47|48|45)|49)|(1:55)(1:54))|71|23|24|25|(0)(0)|42|(0)|(2:52|55)(1:56)) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean hasAppToOpen(Context context, String str) {
        String[] strArr;
        List<ResolveInfo> queryIntentActivities;
        if (str == null) {
            return false;
        }
        List<ResolveInfo> list = null;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 0);
        } catch (Exception unused) {
        }
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            strArr = new String[queryIntentActivities.size()];
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                try {
                    strArr[i] = queryIntentActivities.get(i).activityInfo.packageName;
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("default browser name = " + strArr[i]);
                    }
                } catch (Exception unused2) {
                }
            }
            list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
            if (strArr == null) {
                int i2 = 0;
                while (i2 < list.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= strArr.length) {
                            break;
                        }
                        if (strArr[i3].equals(list.get(i2).activityInfo.packageName)) {
                            list.remove(i2);
                            i2--;
                            break;
                        }
                        i3++;
                    }
                    i2++;
                }
            } else {
                int i4 = 0;
                while (i4 < list.size()) {
                    if (isBrowserPackageName(list.get(i4).activityInfo.packageName.toLowerCase())) {
                        list.remove(i4);
                        i4--;
                    }
                    i4++;
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                for (int i5 = 0; i5 < list.size(); i5++) {
                    FileLog.d("device has " + list.get(i5).activityInfo.packageName + " to open " + str);
                }
            }
            return (list == null || list.isEmpty()) ? false : true;
        }
        strArr = null;
        list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        if (strArr == null) {
        }
        if (BuildVars.LOGS_ENABLED) {
        }
        if (list == null) {
            return false;
        }
    }

    public static boolean isInternalUrl(String str, boolean[] zArr) {
        return isInternalUri(Uri.parse(str), false, zArr);
    }

    public static boolean isInternalUrl(String str, boolean z, boolean[] zArr) {
        return isInternalUri(Uri.parse(str), z, zArr);
    }

    public static boolean isPassportUrl(String str) {
        String lowerCase;
        if (str == null) {
            return false;
        }
        try {
            lowerCase = str.toLowerCase();
        } catch (Throwable unused) {
        }
        if (lowerCase.startsWith("tg:passport") || lowerCase.startsWith("tg://passport") || lowerCase.startsWith("tg:secureid")) {
            return true;
        }
        if (lowerCase.contains("resolve")) {
            if (lowerCase.contains("domain=telegrampassport")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTMe(String str) {
        try {
            return TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix);
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean isInternalUri(Uri uri, boolean[] zArr) {
        return isInternalUri(uri, false, zArr);
    }

    public static boolean isInternalUri(Uri uri, boolean z, boolean[] zArr) {
        String str;
        String str2;
        String hostAuthority = AndroidUtilities.getHostAuthority(uri);
        String str3 = "";
        String lowerCase = hostAuthority != null ? hostAuthority.toLowerCase() : "";
        if (MessagesController.getInstance(UserConfig.selectedAccount).authDomains.contains(lowerCase)) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return false;
        }
        Matcher matcher = LaunchActivity.PREFIX_T_ME_PATTERN.matcher(lowerCase);
        if (matcher.find()) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://t.me/");
            sb.append(matcher.group(1));
            if (TextUtils.isEmpty(uri.getPath())) {
                str = "";
            } else {
                str = "/" + uri.getPath();
            }
            sb.append(str);
            if (TextUtils.isEmpty(uri.getQuery())) {
                str2 = "";
            } else {
                str2 = "?" + uri.getQuery();
            }
            sb.append(str2);
            uri = Uri.parse(sb.toString());
            String host = uri.getHost();
            if (host != null) {
                str3 = host.toLowerCase();
            }
        } else {
            str3 = lowerCase;
        }
        if ("ton".equals(uri.getScheme())) {
            try {
                List<ResolveInfo> queryIntentActivities = ApplicationLoader.applicationContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
                if (queryIntentActivities != null) {
                    if (queryIntentActivities.size() >= 1) {
                        return false;
                    }
                }
            } catch (Exception unused) {
            }
            return true;
        }
        if ("tg".equals(uri.getScheme())) {
            return true;
        }
        if ("telegram.dog".equals(str3)) {
            String path = uri.getPath();
            if (path != null && path.length() > 1) {
                if (z) {
                    return true;
                }
                String lowerCase2 = path.substring(1).toLowerCase();
                if (!lowerCase2.startsWith("blog") && !lowerCase2.equals("iv") && !lowerCase2.startsWith("faq") && !lowerCase2.equals("apps") && !lowerCase2.startsWith("s/")) {
                    return true;
                }
                if (zArr != null) {
                    zArr[0] = true;
                }
                return false;
            }
        } else if ("telegram.me".equals(str3) || "t.me".equals(str3)) {
            String path2 = uri.getPath();
            if (path2 != null && path2.length() > 1) {
                if (z) {
                    return true;
                }
                String lowerCase3 = path2.substring(1).toLowerCase();
                if (!lowerCase3.equals("iv") && !lowerCase3.startsWith("s/")) {
                    return true;
                }
                if (zArr != null) {
                    zArr[0] = true;
                }
            }
        } else {
            if ("telegram.org".equals(str3) && uri.getPath() != null && uri.getPath().startsWith("/blog/")) {
                return true;
            }
            if (z && (str3.endsWith("telegram.org") || str3.endsWith("telegra.ph") || str3.endsWith("telesco.pe"))) {
                return true;
            }
        }
        return false;
    }

    public static String getBrowserPackageName(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static boolean isBrowserPackageName(String str) {
        if (str != null) {
            return str.contains("browser") || str.contains("chrome") || str.contains("firefox") || "com.microsoft.emmx".equals(str) || "com.opera.mini.native".equals(str) || "com.duckduckgo.mobile.android".equals(str) || "com.UCMobile.intl".equals(str);
        }
        return false;
    }

    public static boolean isPunycodeAllowed(String str) {
        if (str == null) {
            return true;
        }
        String[] split = str.split("\\.");
        if (split.length <= 0) {
            return true;
        }
        return split[split.length - 1].startsWith("xn--");
    }

    public static String IDN_toUnicode(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!isPunycodeAllowed(str)) {
            return str;
        }
        try {
            return IDN.toUnicode(str, 1);
        } catch (Exception e2) {
            FileLog.e(e2);
            return str;
        }
    }

    public static String replaceHostname(Uri uri, String str, String str2) {
        return replace(uri, str2, null, str, null);
    }

    public static String replace(Uri uri, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = uri.getScheme();
        }
        if (str != null) {
            sb.append(str);
            sb.append("://");
        }
        if (str2 == null) {
            if (uri.getUserInfo() != null) {
                sb.append(uri.getUserInfo());
                sb.append("@");
            }
        } else if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
            sb.append("@");
        }
        if (str3 == null) {
            if (uri.getHost() != null) {
                sb.append(uri.getHost());
            }
        } else {
            sb.append(str3);
        }
        if (uri.getPort() != -1) {
            sb.append(":");
            sb.append(uri.getPort());
        }
        if (str4 != null) {
            sb.append(str4);
        } else if (uri.getPath() != null) {
            sb.append(uri.getPath());
        }
        if (uri.getQuery() != null) {
            sb.append("?");
            sb.append(uri.getQuery());
        }
        if (uri.getFragment() != null) {
            sb.append("#");
            sb.append(uri.getFragment());
        }
        return sb.toString();
    }
}
