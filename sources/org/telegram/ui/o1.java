package org.telegram.ui;

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
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o1 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((uc1) this.b).finishFragment(false);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(org.telegram.messenger.t0.b.getPackageName(), LaunchActivity.class.getName()));
                    intent.putExtra("com.android.browser.application_id", org.telegram.messenger.t0.b.getPackageName());
                    org.telegram.messenger.t0.b.startActivity(intent);
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.a) {
            case 3:
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
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 1:
                super.onPageFinished(webView, str);
                org.telegram.ui.Components.ut utVar = (org.telegram.ui.Components.ut) obj;
                ImageView imageView = utVar.u1;
                if (!utVar.v1) {
                    utVar.p1.setVisibility(4);
                    utVar.o1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    break;
                }
                break;
            case 2:
                super.onPageFinished(webView, str);
                tp0 tp0Var = (tp0) obj;
                View view = tp0Var.r;
                if (!tp0Var.y) {
                    tp0Var.n.setVisibility(4);
                    tp0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    break;
                }
                break;
            case 3:
                super.onPageFinished(webView, str);
                uc1 uc1Var = (uc1) obj;
                org.telegram.ui.Components.aq aqVar = uc1Var.c;
                if (aqVar != null && aqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    uc1Var.b.getContentView().setVisibility(0);
                    uc1Var.b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(uc1Var.c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(uc1Var.c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(uc1Var.c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(uc1Var.b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(uc1Var.b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(uc1Var.b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new i81(this, 12));
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
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.j jVar = (ui.j) this.b;
                    if (webView == jVar.o) {
                        jVar.h();
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
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.j jVar = (ui.j) this.b;
                    if (webView == jVar.o) {
                        jVar.h();
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
            case 4:
                sslErrorHandler.cancel();
                ui.j jVar = (ui.j) this.b;
                if (webView == jVar.o) {
                    jVar.h();
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
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                try {
                    LaunchActivity launchActivity = LaunchActivity.K1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ((r1) obj).getContext(), null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = org.telegram.messenger.bd.M0(2131752104, null);
                        s1Var.U = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752105, null), new xp0(this, 8));
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        alertDialog$Builder.p();
                    }
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            case 1:
                org.telegram.ui.Components.ut utVar = (org.telegram.ui.Components.ut) obj;
                try {
                    if (org.telegram.messenger.g0.M1(utVar.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, utVar.getContext(), utVar.J0);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                        s1Var2.S = org.telegram.messenger.bd.M0(2131752104, null);
                        s1Var2.U = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752105, null), new org.telegram.ui.Components.gp(this, 9));
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        alertDialog$Builder2.p();
                    }
                    return true;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return false;
                }
            case 2:
            case 3:
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            case 4:
                ui.j jVar = (ui.j) obj;
                if (webView == jVar.o) {
                    jVar.h();
                }
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 2:
                String uri = webResourceRequest.getUrl().toString();
                if (!((tp0) this.b).y || !uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    return null;
                }
                Utilities.j.c(new org.telegram.ui.Components.e7(this, uri, webResourceRequest, 19));
                return null;
            case 3:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 4:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    ui.j jVar = (ui.j) this.b;
                    jVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !jVar.c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(jVar.d))) {
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
                r1 r1Var = (r1) this.b;
                if (r1Var.s) {
                    sf.c.t(r1Var.y.M, str);
                    break;
                }
                break;
            case 1:
                if (!((org.telegram.ui.Components.ut) this.b).v1) {
                    break;
                } else {
                    sf.c.t(webView.getContext(), str);
                    break;
                }
            case 2:
                if (!((tp0) this.b).y) {
                    break;
                } else {
                    sf.c.t(webView.getContext(), str);
                    break;
                }
            case 3:
                if (a(str) || super.shouldOverrideUrlLoading(webView, str)) {
                }
                break;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 4:
                if (webResourceRequest.isForMainFrame()) {
                    ui.j jVar = (ui.j) this.b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (jVar.g.equals(url.toString())) {
                            return false;
                        }
                    } else {
                        jVar.getClass();
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
