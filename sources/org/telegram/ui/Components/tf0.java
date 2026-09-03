package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ej1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tf0 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tf0(Object obj, int i10) {
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
        ((ej1) this.b).getClass();
        ((ej1) this.b).finishFragment(false);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setComponent(new ComponentName(ApplicationLoader.applicationContext.getPackageName(), LaunchActivity.class.getName()));
            intent.putExtra("com.android.browser.application_id", ApplicationLoader.applicationContext.getPackageName());
            ApplicationLoader.applicationContext.startActivity(intent);
            return true;
        } catch (Exception e6) {
            FileLog.e(e6);
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
    public void onPageFinished(WebView webView, String str) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                super.onPageFinished(webView, str);
                org.telegram.ui.ut0 ut0Var = (org.telegram.ui.ut0) obj;
                View view = ut0Var.r;
                if (!ut0Var.x) {
                    ut0Var.n.setVisibility(4);
                    ut0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    break;
                }
                break;
            case 1:
                super.onPageFinished(webView, str);
                ej1 ej1Var = (ej1) obj;
                tq tqVar = ej1Var.c;
                if (tqVar != null && tqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ej1Var.b.getContentView().setVisibility(0);
                    ej1Var.b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ej1Var.c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(ej1Var.c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(ej1Var.c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(ej1Var.b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(ej1Var.b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(ej1Var.b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new org.telegram.ui.ss0(this, 26));
                    animatorSet.setDuration(150L);
                    animatorSet.start();
                    break;
                }
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    sf.k kVar = (sf.k) this.b;
                    if (webView == kVar.m) {
                        kVar.f();
                        break;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    sf.k kVar = (sf.k) this.b;
                    if (webView == kVar.m) {
                        kVar.f();
                        break;
                    }
                }
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 2:
                sslErrorHandler.cancel();
                sf.k kVar = (sf.k) this.b;
                if (webView == kVar.m) {
                    kVar.f();
                    break;
                }
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.a) {
            case 2:
                sf.k kVar = (sf.k) this.b;
                if (webView != kVar.m) {
                    return true;
                }
                kVar.f();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                if (!((org.telegram.ui.ut0) this.b).x || !uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    return null;
                }
                Utilities.externalNetworkQueue.postRunnable(new jp(this, uri, webResourceRequest, 12));
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 0:
                if (!((org.telegram.ui.ut0) this.b).x) {
                    break;
                } else {
                    af.g.s(webView.getContext(), str);
                    break;
                }
            case 1:
                if (a(str) || super.shouldOverrideUrlLoading(webView, str)) {
                }
                break;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    sf.k kVar = (sf.k) this.b;
                    Uri url = webResourceRequest.getUrl();
                    kVar.getClass();
                    if (url == null || !"https".equals(url.getScheme()) || !kVar.b.equals(url.getHost()) || url.getPort() != -1 || !"/".equals(url.getPath()) || url.getQueryParameterNames().size() != 1 || !url.getQueryParameterNames().contains("bridge")) {
                        return true;
                    }
                }
                return false;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
