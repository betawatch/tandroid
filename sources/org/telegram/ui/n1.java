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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n1 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((yc1) this.b).finishFragment(false);
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
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 1:
                super.onPageFinished(webView, str);
                org.telegram.ui.Components.vt vtVar = (org.telegram.ui.Components.vt) obj;
                ImageView imageView = vtVar.t1;
                if (!vtVar.u1) {
                    vtVar.o1.setVisibility(4);
                    vtVar.n1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    break;
                }
                break;
            case 2:
                super.onPageFinished(webView, str);
                bq0 bq0Var = (bq0) obj;
                View view = bq0Var.r;
                if (!bq0Var.y) {
                    bq0Var.n.setVisibility(4);
                    bq0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    break;
                }
                break;
            case 3:
                super.onPageFinished(webView, str);
                yc1 yc1Var = (yc1) obj;
                org.telegram.ui.Components.zp zpVar = yc1Var.c;
                if (zpVar != null && zpVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    yc1Var.b.getContentView().setVisibility(0);
                    yc1Var.b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(yc1Var.c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(yc1Var.c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(yc1Var.c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(yc1Var.b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(yc1Var.b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(yc1Var.b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new r81(this, 12));
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
                    ui.i iVar = (ui.i) this.b;
                    if (webView == iVar.o) {
                        iVar.h();
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
                    ui.i iVar = (ui.i) this.b;
                    if (webView == iVar.o) {
                        iVar.h();
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
                ui.i iVar = (ui.i) this.b;
                if (webView == iVar.o) {
                    iVar.h();
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
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                try {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ((q1) obj).getContext(), null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = org.telegram.messenger.hd.M0(2131752104, null);
                        u1Var.T = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new fq0(this, 8));
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                        alertDialog$Builder.p();
                    }
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            case 1:
                org.telegram.ui.Components.vt vtVar = (org.telegram.ui.Components.vt) obj;
                try {
                    if (org.telegram.messenger.g0.M1(vtVar.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, vtVar.getContext(), vtVar.I0);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        u1Var2.R = org.telegram.messenger.hd.M0(2131752104, null);
                        u1Var2.T = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752105, null), new org.telegram.ui.Components.gp(this, 9));
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747830, null), null);
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
                ui.i iVar = (ui.i) obj;
                if (webView == iVar.o) {
                    iVar.h();
                }
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 2:
                String uri = webResourceRequest.getUrl().toString();
                if (!((bq0) this.b).y || !uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    return null;
                }
                Utilities.j.c(new org.telegram.ui.Components.ng(this, uri, webResourceRequest, 15));
                return null;
            case 3:
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            case 4:
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    ui.i iVar = (ui.i) this.b;
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
                q1 q1Var = (q1) this.b;
                if (q1Var.s) {
                    vf.c.t(q1Var.y.L, str);
                    break;
                }
                break;
            case 1:
                if (!((org.telegram.ui.Components.vt) this.b).u1) {
                    break;
                } else {
                    vf.c.t(webView.getContext(), str);
                    break;
                }
            case 2:
                if (!((bq0) this.b).y) {
                    break;
                } else {
                    vf.c.t(webView.getContext(), str);
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
                    ui.i iVar = (ui.i) this.b;
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
