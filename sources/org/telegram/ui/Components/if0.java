package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cc1;
import org.telegram.ui.ji1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class if0 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ if0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tg".equals(parse.getScheme())) {
            return false;
        }
        ((ji1) this.b).getClass();
        ((ji1) this.b).finishFragment(false);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setComponent(new ComponentName(ApplicationLoader.applicationContext.getPackageName(), LaunchActivity.class.getName()));
            intent.putExtra("com.android.browser.application_id", ApplicationLoader.applicationContext.getPackageName());
            ApplicationLoader.applicationContext.startActivity(intent);
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.a) {
            case 1:
                if (!a(str)) {
                    super.onLoadResource(webView, str);
                    break;
                }
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.et0 et0Var = (org.telegram.ui.et0) obj;
                View view = et0Var.r;
                if (!et0Var.x) {
                    et0Var.n.setVisibility(4);
                    et0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                super.onPageFinished(webView, str);
                ji1 ji1Var = (ji1) obj;
                nq nqVar = ji1Var.c;
                if (nqVar != null && nqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ji1Var.b.getContentView().setVisibility(0);
                    ji1Var.b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ji1Var.c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(ji1Var.c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(ji1Var.c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(ji1Var.b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(ji1Var.b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(ji1Var.b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new cc1(this, 5));
                    animatorSet.setDuration(150L);
                    animatorSet.start();
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (!((org.telegram.ui.et0) this.b).x || !uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    return null;
                }
                Utilities.externalNetworkQueue.postRunnable(new g(this, uri, webResourceRequest, 19));
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 0:
                if (!((org.telegram.ui.et0) this.b).x) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                ye.d.s(webView.getContext(), str);
                return true;
            default:
                return a(str) || super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
