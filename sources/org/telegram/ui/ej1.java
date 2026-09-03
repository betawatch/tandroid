package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ej1 extends org.telegram.ui.ActionBar.p2 {
    public WebView a;
    public org.telegram.ui.ActionBar.w0 b;
    public org.telegram.ui.Components.tq c;
    public final String d;
    public final String e;
    public final String f;
    public final String h;
    public final MessageObject n;
    public final String r;
    public z5 s;

    public ej1(String str, String str2, String str3, String str4, MessageObject messageObject) {
        super(null);
        this.s = new z5(this, 15);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.n = messageObject;
        this.r = str4;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb.append("/");
        sb.append(str2);
        sb.append(TextUtils.isEmpty(str4) ? "" : yh.k("?game=", str4));
        this.h = sb.toString();
    }

    public static void V(String str, MessageObject messageObject, Activity activity, String str2, String str3) {
        String str4;
        String str5 = "";
        try {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString("" + messageObject.getId(), null);
            StringBuilder sb = new StringBuilder(string != null ? string : "");
            StringBuilder sb2 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                for (int i10 = 0; i10 < 20; i10++) {
                    sb.append(charArray[Utilities.random.nextInt(charArray.length)]);
                }
            }
            sb2.append((CharSequence) sb);
            int indexOf = str.indexOf(35);
            if (indexOf < 0) {
                str4 = str + "#" + ((Object) sb2);
            } else {
                String substring = str.substring(indexOf + 1);
                if (substring.indexOf(61) < 0 && substring.indexOf(63) < 0) {
                    str4 = substring.length() > 0 ? str + "?" + ((Object) sb2) : str + ((Object) sb2);
                }
                str4 = str + "&" + ((Object) sb2);
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(((Object) sb) + "_date", (int) (System.currentTimeMillis() / 1000));
            SerializedData serializedData = new SerializedData(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(serializedData);
            edit.putString(((Object) sb) + "_m", Utilities.bytesToHex(serializedData.toByteArray()));
            String str6 = ((Object) sb) + "_link";
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://");
            sb3.append(MessagesController.getInstance(messageObject.currentAccount).linkPrefix);
            sb3.append("/");
            sb3.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str5 = "?game=" + str2;
            }
            sb3.append(str5);
            edit.putString(str6, sb3.toString());
            edit.commit();
            af.g.o(activity, str4, false);
            serializedData.cleanup();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new cj1(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        this.b = n10.g(1, R.drawable.share, AndroidUtilities.dp(54.0f));
        n10.a(0, R.drawable.ic_ab_other).e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.actionBar.setTitle(this.f);
        this.actionBar.setSubtitle("@" + this.e);
        org.telegram.ui.Components.tq tqVar = new org.telegram.ui.Components.tq(context, 1);
        this.c = tqVar;
        this.b.addView(tqVar, k7.c6.c(-1.0f, -1));
        this.c.setAlpha(0.0f);
        this.c.setScaleX(0.1f);
        this.c.setScaleY(0.1f);
        this.c.setVisibility(4);
        AndroidUtilities.checkAndroidTheme(context, true);
        WebView webView = new WebView(context);
        this.a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.a.setLayerType(2, null);
        this.a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.a, true);
        this.a.addJavascriptInterface(new dj1(this), "TelegramWebviewProxy");
        this.a.setWebViewClient(new org.telegram.ui.Components.tf0(this, 1));
        frameLayout.addView(this.a, k7.c6.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.E7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.checkAndroidTheme(getParentActivity(), false);
        AndroidUtilities.cancelRunOnUIThread(this.s);
        this.a.setLayerType(0, null);
        this.s = null;
        try {
            ViewParent parent = this.a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.a);
            }
            this.a.stopLoading();
            this.a.loadUrl("about:blank");
            this.a.destroy();
            this.a = null;
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.cancelRunOnUIThread(this.s);
        this.s.run();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        WebView webView;
        if (!z4 || z10 || (webView = this.a) == null) {
            return;
        }
        webView.loadUrl(this.d);
    }
}
