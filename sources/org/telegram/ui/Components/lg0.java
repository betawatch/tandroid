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
import java.io.ByteArrayInputStream;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ki1;
import org.telegram.ui.ve1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class lg0 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lg0(Object obj, int i10) {
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
        ((ki1) this.b).getClass();
        ((ki1) this.b).finishFragment(false);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setComponent(new ComponentName(ApplicationLoader.applicationContext.getPackageName(), LaunchActivity.class.getName()));
            intent.putExtra("com.android.browser.application_id", ApplicationLoader.applicationContext.getPackageName());
            ApplicationLoader.applicationContext.startActivity(intent);
            return true;
        } catch (Exception e) {
            FileLog.e(e);
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
                org.telegram.ui.rt0 rt0Var = (org.telegram.ui.rt0) obj;
                View view = rt0Var.r;
                if (!rt0Var.x) {
                    rt0Var.n.setVisibility(4);
                    rt0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    break;
                }
                break;
            case 1:
                super.onPageFinished(webView, str);
                ki1 ki1Var = (ki1) obj;
                cr crVar = ki1Var.c;
                if (crVar != null && crVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ki1Var.b.getContentView().setVisibility(0);
                    ki1Var.b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ki1Var.c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(ki1Var.c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(ki1Var.c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(ki1Var.b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(ki1Var.b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(ki1Var.b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new ve1(this, 11));
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
                    qi.i iVar = (qi.i) this.b;
                    if (webView == iVar.o) {
                        iVar.f();
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
                    qi.i iVar = (qi.i) this.b;
                    if (webView == iVar.o) {
                        iVar.f();
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
                qi.i iVar = (qi.i) this.b;
                if (webView == iVar.o) {
                    iVar.f();
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
                qi.i iVar = (qi.i) this.b;
                if (webView != iVar.o) {
                    return true;
                }
                iVar.f();
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
                if (!((org.telegram.ui.rt0) this.b).x || !uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    return null;
                }
                Utilities.externalNetworkQueue.postRunnable(new lg(this, uri, webResourceRequest, 16));
                return null;
            case 1:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 2:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    qi.i iVar = (qi.i) this.b;
                    iVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !iVar.c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(iVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 0:
                if (!((org.telegram.ui.rt0) this.b).x) {
                    break;
                } else {
                    pf.d.r(webView.getContext(), str);
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
                    qi.i iVar = (qi.i) this.b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (iVar.g.equals(url.toString())) {
                            return false;
                        }
                    } else {
                        iVar.getClass();
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
