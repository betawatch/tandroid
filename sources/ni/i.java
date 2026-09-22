package ni;

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
import org.telegram.ui.ActionBar.p;
import org.telegram.ui.Components.tq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cr0;
import org.telegram.ui.iu0;
import org.telegram.ui.pj1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class i extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
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
        ((pj1) this.b).getClass();
        ((pj1) this.b).finishFragment(false);
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
            case 2:
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
            case 1:
                super.onPageFinished(webView, str);
                iu0 iu0Var = (iu0) obj;
                View view = iu0Var.r;
                if (!iu0Var.x) {
                    iu0Var.n.setVisibility(4);
                    iu0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    break;
                }
                break;
            case 2:
                super.onPageFinished(webView, str);
                pj1 pj1Var = (pj1) obj;
                tq tqVar = pj1Var.c;
                if (tqVar != null && tqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    pj1Var.b.getContentView().setVisibility(0);
                    pj1Var.b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(pj1Var.c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(pj1Var.c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(pj1Var.c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(pj1Var.b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(pj1Var.b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(pj1Var.b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new cr0(this, 27));
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
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.b;
                    if (webView == kVar.o) {
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
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.b;
                    if (webView == kVar.o) {
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
            case 0:
                sslErrorHandler.cancel();
                k kVar = (k) this.b;
                if (webView == kVar.o) {
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
            case 0:
                k kVar = (k) this.b;
                if (webView != kVar.o) {
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
                Uri url = webResourceRequest.getUrl();
                if ("http".equalsIgnoreCase(url.getScheme()) || "https".equalsIgnoreCase(url.getScheme())) {
                    k kVar = (k) this.b;
                    kVar.getClass();
                    String path = url.getPath();
                    if (!"https".equalsIgnoreCase(url.getScheme()) || !kVar.c.equalsIgnoreCase(url.getHost()) || url.getUserInfo() != null || ((url.getPort() != -1 && url.getPort() != 443) || path == null || !path.startsWith(kVar.d))) {
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                }
                return null;
            case 1:
                String uri = webResourceRequest.getUrl().toString();
                if (!((iu0) this.b).x || !uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    return null;
                }
                Utilities.externalNetworkQueue.postRunnable(new p(this, uri, webResourceRequest, 25));
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 1:
                if (!((iu0) this.b).x) {
                    break;
                } else {
                    nf.f.s(webView.getContext(), str);
                    break;
                }
            case 2:
                if (a(str) || super.shouldOverrideUrlLoading(webView, str)) {
                }
                break;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 0:
                if (webResourceRequest.isForMainFrame()) {
                    k kVar = (k) this.b;
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        if (kVar.g.equals(url.toString())) {
                            return false;
                        }
                    } else {
                        kVar.getClass();
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
