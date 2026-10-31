package ji;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jg;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mr0;
import org.telegram.ui.ns0;
import org.telegram.ui.r1;
import org.telegram.ui.rr0;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class i extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if ("tg".equals(parse.getScheme())) {
                ((we1) this.b).finishFragment(false);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(w0.b.getPackageName(), LaunchActivity.class.getName()));
                    intent.putExtra("com.android.browser.application_id", w0.b.getPackageName());
                    w0.b.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    f8.g(e, true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.a) {
            case 4:
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
            case 2:
                super.onPageFinished(webView, str);
                hu huVar = (hu) obj;
                ImageView imageView = huVar.t1;
                if (!huVar.u1) {
                    huVar.o1.setVisibility(4);
                    huVar.n1.setVisibility(4);
                    imageView.setEnabled(true);
                    imageView.setAlpha(1.0f);
                    break;
                }
                break;
            case 3:
                super.onPageFinished(webView, str);
                mr0 mr0Var = (mr0) obj;
                View view = mr0Var.r;
                if (!mr0Var.y) {
                    mr0Var.n.setVisibility(4);
                    mr0Var.h.setVisibility(4);
                    view.setEnabled(true);
                    view.setAlpha(1.0f);
                    break;
                }
                break;
            case 4:
                super.onPageFinished(webView, str);
                we1 we1Var = (we1) obj;
                iq iqVar = we1Var.c;
                if (iqVar != null && iqVar.getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    we1Var.b.getContentView().setVisibility(0);
                    we1Var.b.setEnabled(true);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(we1Var.c, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(we1Var.c, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(we1Var.c, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(we1Var.b.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(we1Var.b.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(we1Var.b.getContentView(), "alpha", 0.0f, 1.0f));
                    animatorSet.addListener(new ns0(this, 23));
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
                        kVar.h();
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
                        kVar.h();
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
                    kVar.h();
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
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                k kVar = (k) obj;
                if (webView == kVar.o) {
                    kVar.h();
                }
                return true;
            case 1:
                try {
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity == null || !launchActivity.isFinishing()) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ((r1) obj).getContext(), null);
                        x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = cd.L0(2131752104, null);
                        x1Var.T = i0.T2(cd.L0(2131752105, null), new rr0(this, 8));
                        alertDialog$Builder.k(cd.L0(2131747847, null), null);
                        alertDialog$Builder.p();
                    }
                    return true;
                } catch (Exception e) {
                    f8.g(e, true);
                    return false;
                }
            case 2:
                hu huVar = (hu) obj;
                try {
                    if (i0.M1(huVar.getContext())) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, huVar.getContext(), huVar.I0);
                        x1 x1Var2 = alertDialog$Builder2.a;
                        x1Var2.R = cd.L0(2131752104, null);
                        x1Var2.T = i0.T2(cd.L0(2131752105, null), new ho(this, 11));
                        alertDialog$Builder2.k(cd.L0(2131747847, null), null);
                        alertDialog$Builder2.p();
                    }
                    return true;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return false;
                }
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
            case 3:
                String uri = webResourceRequest.getUrl().toString();
                if (!((mr0) this.b).y || !uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                    return null;
                }
                Utilities.j.c(new jg(this, uri, webResourceRequest, 15));
                return null;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 1:
                r1 r1Var = (r1) this.b;
                if (r1Var.s) {
                    gf.f.r(r1Var.y.L, str);
                    break;
                }
                break;
            case 2:
                if (!((hu) this.b).u1) {
                    break;
                } else {
                    gf.f.r(webView.getContext(), str);
                    break;
                }
            case 3:
                if (!((mr0) this.b).y) {
                    break;
                } else {
                    gf.f.r(webView.getContext(), str);
                    break;
                }
            case 4:
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
