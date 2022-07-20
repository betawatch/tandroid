package org.telegram.messenger.browser;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CustomTabsCopyReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.ShareBroadcastReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.customtabs.CustomTabsCallback;
import org.telegram.messenger.support.customtabs.CustomTabsClient;
import org.telegram.messenger.support.customtabs.CustomTabsIntent;
import org.telegram.messenger.support.customtabs.CustomTabsServiceConnection;
import org.telegram.messenger.support.customtabs.CustomTabsSession;
import org.telegram.messenger.support.customtabsclient.shared.CustomTabsHelper;
import org.telegram.messenger.support.customtabsclient.shared.ServiceConnection;
import org.telegram.messenger.support.customtabsclient.shared.ServiceConnectionCallback;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messages_getWebPagePreview;
import org.telegram.tgnet.TLRPC$TL_webPage;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.LaunchActivity;
/* loaded from: classes.dex */
public class Browser {
    private static WeakReference<Activity> currentCustomTabsActivity;
    private static CustomTabsClient customTabsClient;
    private static String customTabsPackageToBind;
    private static CustomTabsServiceConnection customTabsServiceConnection;
    private static CustomTabsSession customTabsSession;

    private static void setCurrentSession(CustomTabsSession customTabsSession2) {
        new WeakReference(customTabsSession2);
    }

    private static CustomTabsSession getSession() {
        CustomTabsClient customTabsClient2 = customTabsClient;
        if (customTabsClient2 == null) {
            customTabsSession = null;
        } else if (customTabsSession == null) {
            CustomTabsSession newSession = customTabsClient2.newSession(new NavigationCallback(null));
            customTabsSession = newSession;
            setCurrentSession(newSession);
        }
        return customTabsSession;
    }

    public static void bindCustomTabsService(Activity activity) {
        WeakReference<Activity> weakReference = currentCustomTabsActivity;
        Activity activity2 = weakReference == null ? null : weakReference.get();
        if (activity2 != null && activity2 != activity) {
            unbindCustomTabsService(activity2);
        }
        if (customTabsClient != null) {
            return;
        }
        currentCustomTabsActivity = new WeakReference<>(activity);
        try {
            if (TextUtils.isEmpty(customTabsPackageToBind)) {
                String packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity);
                customTabsPackageToBind = packageNameToUse;
                if (packageNameToUse == null) {
                    return;
                }
            }
            ServiceConnection serviceConnection = new ServiceConnection(new AnonymousClass1());
            customTabsServiceConnection = serviceConnection;
            if (CustomTabsClient.bindCustomTabsService(activity, customTabsPackageToBind, serviceConnection)) {
                return;
            }
            customTabsServiceConnection = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* renamed from: org.telegram.messenger.browser.Browser$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements ServiceConnectionCallback {
        AnonymousClass1() {
        }

        @Override // org.telegram.messenger.support.customtabsclient.shared.ServiceConnectionCallback
        public void onServiceConnected(CustomTabsClient customTabsClient) {
            CustomTabsClient unused = Browser.customTabsClient = customTabsClient;
            if (!SharedConfig.customTabs || Browser.customTabsClient == null) {
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
    }

    public static void unbindCustomTabsService(Activity activity) {
        if (customTabsServiceConnection == null) {
            return;
        }
        WeakReference<Activity> weakReference = currentCustomTabsActivity;
        if ((weakReference == null ? null : weakReference.get()) == activity) {
            currentCustomTabsActivity.clear();
        }
        try {
            activity.unbindService(customTabsServiceConnection);
        } catch (Exception unused) {
        }
        customTabsClient = null;
        customTabsSession = null;
    }

    /* loaded from: classes.dex */
    public static class NavigationCallback extends CustomTabsCallback {
        @Override // org.telegram.messenger.support.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
        }

        private NavigationCallback() {
        }

        /* synthetic */ NavigationCallback(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static void openUrl(Context context, String str) {
        if (str == null) {
            return;
        }
        openUrl(context, Uri.parse(str), true);
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
        sb.append("://)?(te\\.?legra\\.ph|graph\\.org).*");
        return str.matches(sb.toString());
    }

    public static boolean urlMustNotHaveConfirmation(String str) {
        return isTelegraphUrl(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??.*") || str.matches("^(https://)?telegram\\.org/(blog|tour)/?.*");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:54|(2:128|55)|(11:59|60|(5:63|(2:65|140)(1:141)|66|126|61)|118|68|(3:70|(4:73|(2:74|(1:1)(2:76|(3:135|78|134)(1:79)))|80|71)|132)(3:81|(4:84|(2:88|137)(1:138)|89|82)|136)|90|(3:92|(3:95|96|93)|139)|97|98|(2:103|104))|67|118|68|(0)(0)|90|(0)|97|98|(0)|103|104) */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void openUrl(Context context, Uri uri, boolean z, boolean z2) {
        String[] strArr;
        List<ResolveInfo> queryIntentActivities;
        Uri uri2 = uri;
        if (context == null || uri2 == null) {
            return;
        }
        int i = UserConfig.selectedAccount;
        boolean[] zArr = {false};
        boolean isInternalUri = isInternalUri(uri2, zArr);
        if (z2) {
            try {
                if (isTelegraphUrl(uri.getHost().toLowerCase(), true) || uri.toString().toLowerCase().contains("telegram.org/faq") || uri.toString().toLowerCase().contains("telegram.org/privacy")) {
                    AlertDialog[] alertDialogArr = {new AlertDialog(context, 3)};
                    TLRPC$TL_messages_getWebPagePreview tLRPC$TL_messages_getWebPagePreview = new TLRPC$TL_messages_getWebPagePreview();
                    tLRPC$TL_messages_getWebPagePreview.message = uri.toString();
                    AndroidUtilities.runOnUIThread(new Browser$$ExternalSyntheticLambda1(alertDialogArr, ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_messages_getWebPagePreview, new Browser$$ExternalSyntheticLambda3(alertDialogArr, i, uri, context, z))), 1000L);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        try {
            String str = "";
            String lowerCase = uri.getScheme() != null ? uri.getScheme().toLowerCase() : str;
            if ("http".equals(lowerCase) || "https".equals(lowerCase)) {
                try {
                    uri2 = uri.normalizeScheme();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (uri2.getHost() != null) {
                str = uri2.getHost().toLowerCase();
            }
            if (AccountInstance.getInstance(i).getMessagesController().autologinDomains.contains(str)) {
                String str2 = "autologin_token=" + URLEncoder.encode(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().autologinToken, "UTF-8");
                String uri3 = uri2.toString();
                int indexOf = uri3.indexOf("://");
                if (indexOf >= 0) {
                    uri3 = uri3.substring(indexOf + 3);
                }
                String encodedFragment = uri2.getEncodedFragment();
                if (encodedFragment != null) {
                    uri3 = uri3.substring(0, uri3.indexOf("#" + encodedFragment));
                }
                String str3 = uri3.indexOf(63) >= 0 ? uri3 + "&" + str2 : uri3 + "?" + str2;
                if (encodedFragment != null) {
                    str3 = str3 + "#" + encodedFragment;
                }
                uri2 = Uri.parse("https://" + str3);
            }
            if (z && SharedConfig.customTabs && !isInternalUri && !lowerCase.equals("tel")) {
                List<ResolveInfo> list = null;
                try {
                    queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 0);
                } catch (Exception unused2) {
                }
                if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                    strArr = new String[queryIntentActivities.size()];
                    for (int i2 = 0; i2 < queryIntentActivities.size(); i2++) {
                        try {
                            strArr[i2] = queryIntentActivities.get(i2).activityInfo.packageName;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("default browser name = " + strArr[i2]);
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri2), 0);
                    if (strArr == null) {
                        int i3 = 0;
                        while (i3 < list.size()) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= strArr.length) {
                                    break;
                                } else if (strArr[i4].equals(list.get(i3).activityInfo.packageName)) {
                                    list.remove(i3);
                                    i3--;
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            i3++;
                        }
                    } else {
                        int i5 = 0;
                        while (i5 < list.size()) {
                            if (list.get(i5).activityInfo.packageName.toLowerCase().contains("browser") || list.get(i5).activityInfo.packageName.toLowerCase().contains("chrome")) {
                                list.remove(i5);
                                i5--;
                            }
                            i5++;
                        }
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            FileLog.d("device has " + list.get(i6).activityInfo.packageName + " to open " + uri2.toString());
                        }
                    }
                    if (!zArr[0] || list == null || list.isEmpty()) {
                        Intent intent = new Intent(ApplicationLoader.applicationContext, ShareBroadcastReceiver.class);
                        intent.setAction("android.intent.action.SEND");
                        PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, CustomTabsCopyReceiver.class), 134217728);
                        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(getSession());
                        builder.addMenuItem(LocaleController.getString("CopyLink", 2131625274), broadcast);
                        builder.setToolbarColor(Theme.getColor("actionBarBrowser"));
                        builder.setShowTitle(true);
                        builder.setActionButton(BitmapFactory.decodeResource(context.getResources(), 2131165729), LocaleController.getString("ShareFile", 2131628336), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent, 0), true);
                        CustomTabsIntent build = builder.build();
                        build.setUseNewTask();
                        build.launchUrl(context, uri2);
                        return;
                    }
                }
                strArr = null;
                list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri2), 0);
                if (strArr == null) {
                }
                if (BuildVars.LOGS_ENABLED) {
                }
                if (!zArr[0]) {
                }
                Intent intent2 = new Intent(ApplicationLoader.applicationContext, ShareBroadcastReceiver.class);
                intent2.setAction("android.intent.action.SEND");
                PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, CustomTabsCopyReceiver.class), 134217728);
                CustomTabsIntent.Builder builder2 = new CustomTabsIntent.Builder(getSession());
                builder2.addMenuItem(LocaleController.getString("CopyLink", 2131625274), broadcast2);
                builder2.setToolbarColor(Theme.getColor("actionBarBrowser"));
                builder2.setShowTitle(true);
                builder2.setActionButton(BitmapFactory.decodeResource(context.getResources(), 2131165729), LocaleController.getString("ShareFile", 2131628336), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent2, 0), true);
                CustomTabsIntent build2 = builder2.build();
                build2.setUseNewTask();
                build2.launchUrl(context, uri2);
                return;
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        try {
            Intent intent3 = new Intent("android.intent.action.VIEW", uri2);
            if (isInternalUri) {
                intent3.setComponent(new ComponentName(context.getPackageName(), LaunchActivity.class.getName()));
            }
            intent3.putExtra("create_new_tab", true);
            intent3.putExtra("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent3);
        } catch (Exception e3) {
            FileLog.e(e3);
        }
    }

    public static /* synthetic */ void lambda$openUrl$1(AlertDialog[] alertDialogArr, int i, Uri uri, Context context, boolean z, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Browser$$ExternalSyntheticLambda2(alertDialogArr, tLObject, i, uri, context, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$openUrl$0(AlertDialog[] alertDialogArr, TLObject tLObject, int i, Uri uri, Context context, boolean z) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        boolean z2 = true;
        if (tLObject instanceof TLRPC$TL_messageMediaWebPage) {
            TLRPC$TL_messageMediaWebPage tLRPC$TL_messageMediaWebPage = (TLRPC$TL_messageMediaWebPage) tLObject;
            TLRPC$WebPage tLRPC$WebPage = tLRPC$TL_messageMediaWebPage.webpage;
            if ((tLRPC$WebPage instanceof TLRPC$TL_webPage) && tLRPC$WebPage.cached_page != null) {
                NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.openArticle, tLRPC$TL_messageMediaWebPage.webpage, uri.toString());
                if (!z2) {
                    return;
                }
                openUrl(context, uri, z, false);
                return;
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    public static /* synthetic */ void lambda$openUrl$3(AlertDialog[] alertDialogArr, int i) {
        if (alertDialogArr[0] == null) {
            return;
        }
        try {
            alertDialogArr[0].setOnCancelListener(new Browser$$ExternalSyntheticLambda0(i));
            alertDialogArr[0].show();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void lambda$openUrl$2(int i, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i, true);
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

    public static boolean isInternalUri(Uri uri, boolean[] zArr) {
        return isInternalUri(uri, false, zArr);
    }

    public static boolean isInternalUri(Uri uri, boolean z, boolean[] zArr) {
        String host = uri.getHost();
        String lowerCase = host != null ? host.toLowerCase() : "";
        if ("ton".equals(uri.getScheme())) {
            try {
                List<ResolveInfo> queryIntentActivities = ApplicationLoader.applicationContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
                if (queryIntentActivities != null) {
                    if (queryIntentActivities.size() > 1) {
                        return false;
                    }
                }
            } catch (Exception unused) {
            }
            return true;
        } else if ("tg".equals(uri.getScheme())) {
            return true;
        } else {
            if ("telegram.dog".equals(lowerCase)) {
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
            } else if ("telegram.me".equals(lowerCase) || "t.me".equals(lowerCase)) {
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
            } else if (z && (lowerCase.endsWith("telegram.org") || lowerCase.endsWith("telegra.ph") || lowerCase.endsWith("telesco.pe"))) {
                return true;
            }
            return false;
        }
    }
}
