// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class aw0 extends WebViewClient {
    public boolean a = true;
    public final zv0 b = new zv0(this, 0);
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ mw0 e;

    public aw0(mw0 mw0Var, boolean z, Context context) {
        this.e = mw0Var;
        this.c = z;
        this.d = context;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        m11 m11Var;
        boolean z2 = this.c;
        mw0 mw0Var = this.e;
        if (!z2 && ((m11Var = mw0Var.e) == null || !TextUtils.equals(m11Var.c, str))) {
            m11 m11Var2 = new m11();
            mw0Var.e = m11Var2;
            m11Var2.a = Utilities.c.nextLong();
            mw0Var.e.b = System.currentTimeMillis();
            mw0Var.e.c = qw0.r(mw0Var.getUrl());
            mw0Var.e.d = ivc.a(mw0Var);
            crd.c(mw0Var.e);
        }
        mw0Var.b("doUpdateVisitedHistory " + str + " " + z);
        qw0 qw0Var = mw0Var.R;
        if (qw0Var != null) {
            qw0Var.G(!mw0Var.canGoBack(), !mw0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        qw0 qw0Var;
        mw0 mw0Var = this.e;
        mw0Var.b("onPageCommitVisible " + str);
        boolean z = this.c;
        if (z && !nwc.a("DOCUMENT_START_SCRIPT") && (qw0Var = mw0Var.R) != null) {
            boolean z2 = qw0.R0;
            if (qw0Var.o()) {
                mw0Var.c("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (z) {
            mw0Var.O = true;
            String v2 = gm.v2(null, R.raw.webview_app_ext);
            boolean z3 = e21.a;
            mw0Var.c(v2.replace("$DEBUG$", "true"));
        } else {
            mw0Var.O = true;
            String v22 = gm.v2(null, R.raw.webview_ext);
            boolean z4 = e21.a;
            mw0Var.c(v22.replace("$DEBUG$", "true"));
            mw0Var.c(gm.v2(null, R.raw.webview_share));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        qw0 qw0Var;
        mw0 mw0Var = this.e;
        mw0Var.b = true;
        mw0Var.b("onPageFinished");
        boolean z = this.c;
        if (z && !nwc.a("DOCUMENT_START_SCRIPT") && (qw0Var = mw0Var.R) != null) {
            boolean z2 = qw0.R0;
            if (qw0Var.o()) {
                mw0Var.c("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        qw0 qw0Var2 = mw0Var.R;
        if (qw0Var2 != null) {
            qw0Var2.S(str, true);
        } else {
            mw0Var.b("onPageFinished: no container");
        }
        if (z) {
            mw0Var.O = true;
            String v2 = gm.v2(null, R.raw.webview_app_ext);
            boolean z3 = e21.a;
            mw0Var.c(v2.replace("$DEBUG$", "true"));
        } else {
            mw0Var.O = true;
            String v22 = gm.v2(null, R.raw.webview_ext);
            boolean z4 = e21.a;
            mw0Var.c(v22.replace("$DEBUG$", "true"));
            mw0Var.c(gm.v2(null, R.raw.webview_share));
        }
        mw0Var.e();
        qw0 qw0Var3 = mw0Var.R;
        if (qw0Var3 != null) {
            if (!mw0Var.F) {
                mw0Var.getUrl();
            }
            qw0Var3.G(!mw0Var.canGoBack(), !mw0Var.canGoForward());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r0.Q0 == null) goto L11;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2;
        qw0 qw0Var;
        boolean z = this.c;
        mw0 mw0Var = this.e;
        if (z && (qw0Var = mw0Var.R) != null) {
            qw0Var.t0++;
        }
        qw0 qw0Var2 = mw0Var.R;
        if (qw0Var2 != null) {
            boolean z2 = qw0.R0;
        }
        mw0Var.getSettings().setMediaPlaybackRequiresUserGesture(true);
        my0 my0Var = mw0Var.G;
        if (my0Var != null) {
            my0Var.dismiss();
            mw0Var.G = null;
        }
        mw0Var.e = null;
        mw0Var.r = null;
        mw0Var.s = false;
        mw0Var.w = false;
        mw0Var.N = false;
        mw0Var.b("onPageStarted " + str);
        if (mw0Var.R != null && mw0Var.h && ((str2 = mw0Var.n) == null || !TextUtils.equals(str2, str))) {
            gm.d3(this.b, 40L);
        }
        qw0 qw0Var3 = mw0Var.R;
        if (qw0Var3 != null) {
            qw0Var3.G(!mw0Var.canGoBack(), !mw0Var.canGoForward());
        }
        super.onPageStarted(webView, str, bitmap);
        mw0Var.O = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str = "onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription());
        mw0 mw0Var = this.e;
        mw0Var.b(str);
        if (mw0Var.R != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
            gm.r(this.b);
            mw0Var.r = null;
            mw0Var.s = false;
            mw0Var.w = false;
            mw0Var.N = false;
            mw0Var.K = false;
            mw0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? mw0Var.getUrl() : webResourceRequest.getUrl().toString();
            qw0 qw0Var = mw0Var.R;
            mw0Var.L = null;
            qw0Var.F();
            qw0 qw0Var2 = mw0Var.R;
            mw0Var.P = null;
            qw0Var2.getClass();
            qw0 qw0Var3 = mw0Var.R;
            mw0Var.h = true;
            webResourceError.getErrorCode();
            qw0Var3.B(true, webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null);
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        StringBuilder sb = new StringBuilder("onReceivedHttpError: statusCode=");
        sb.append(webResourceResponse == null ? null : Integer.valueOf(webResourceResponse.getStatusCode()));
        sb.append(" request=");
        sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb2 = sb.toString();
        mw0 mw0Var = this.e;
        mw0Var.b(sb2);
        if (mw0Var.R != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                gm.r(this.b);
                mw0Var.r = null;
                mw0Var.s = false;
                mw0Var.w = false;
                mw0Var.N = false;
                mw0Var.K = false;
                mw0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? mw0Var.getUrl() : webResourceRequest.getUrl().toString();
                qw0 qw0Var = mw0Var.R;
                mw0Var.L = null;
                qw0Var.F();
                qw0 qw0Var2 = mw0Var.R;
                mw0Var.P = null;
                qw0Var2.getClass();
                qw0 qw0Var3 = mw0Var.R;
                mw0Var.h = true;
                webResourceResponse.getStatusCode();
                qw0Var3.B(true, webResourceResponse.getReasonPhrase());
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        StringBuilder sb = new StringBuilder("onReceivedSslError: error=");
        sb.append(sslError);
        sb.append(" url=");
        sb.append(sslError == null ? null : sslError.getUrl());
        this.e.b(sb.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = Build.VERSION.SDK_INT;
        mw0 mw0Var = this.e;
        if (i >= 26) {
            StringBuilder sb = new StringBuilder("onRenderProcessGone priority=");
            sb.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb.append(" didCrash=");
            sb.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            mw0Var.b(sb.toString());
        } else {
            mw0Var.b("onRenderProcessGone");
        }
        try {
            if (!gm.K1(mw0Var.getContext())) {
                return true;
            }
            Context context = mw0Var.getContext();
            qw0 qw0Var = mw0Var.R;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qw0Var == null ? null : qw0Var.e, context);
            he heVar = alertDialog$Builder.a;
            heVar.S = jb6.M0(2131752041, null);
            heVar.U = gm.N2(jb6.M0(2131752042, null), -1, 0, new zv0(this, (byte) 2), null);
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            heVar.setOnDismissListener(new n1(this, (byte) 7));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            fc4.g(e, true);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        HttpURLConnection httpURLConnection;
        StringBuilder sb = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection2 = null;
        sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb2 = sb.toString();
        mw0 mw0Var = this.e;
        mw0Var.b(sb2);
        if (webResourceRequest != null && qw0.n(webResourceRequest.getUrl())) {
            mw0Var.b("proxying ton");
            this.a = false;
            return qw0.K(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.c && mw0Var.f != null && this.a) {
            byte b = 1;
            try {
                httpURLConnection = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
            } catch (Exception e) {
                e = e;
            }
            try {
                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                if (webResourceRequest.getRequestHeaders() != null) {
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.connect();
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                    String key = entry2.getKey();
                    if (key != null) {
                        hashMap.put(key, TextUtils.join(", ", entry2.getValue()));
                        if (!mw0Var.F && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it = entry2.getValue().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (next != null && !"unsafe-none".equals(next.toLowerCase()) && !"same-site".equals(next.toLowerCase())) {
                                    mw0Var.b("<!> dangerous header CORS policy: " + key + ": " + next + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    mw0Var.F = true;
                                    gm.c3(new zv0(this, b));
                                    break;
                                }
                            }
                        }
                    }
                }
                String contentType = httpURLConnection.getContentType();
                String contentEncoding = httpURLConnection.getContentEncoding();
                if (contentType.indexOf("; ") >= 0) {
                    String[] split = contentType.split("; ");
                    if (!TextUtils.isEmpty(split[0])) {
                        contentType = split[0];
                    }
                    for (int i = 1; i < split.length; i++) {
                        if (split[i].startsWith("charset=")) {
                            contentEncoding = split[i].substring(8);
                        }
                    }
                }
                this.a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e2) {
                e = e2;
                httpURLConnection2 = httpURLConnection;
                fc4.g(e, true);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        uv0 uv0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            mw0 mw0Var = this.e;
            if (startsWith) {
                if (mw0Var.f != null) {
                    uv0 uv0Var2 = mw0Var.R.c;
                    if (uv0Var2 != null) {
                        uv0Var2.j();
                    } else {
                        Runnable runnable = mw0Var.V;
                        if (runnable != null) {
                            runnable.run();
                            mw0Var.V = null;
                        }
                    }
                }
                l11.u(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z = this.c;
            if (!z) {
                if (l11.n(context, str, true)) {
                    mw0Var.b("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!mw0Var.b && !mw0Var.canGoBack()) {
                        uv0 uv0Var3 = mw0Var.R.c;
                        if (uv0Var3 != null) {
                            uv0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = mw0Var.V;
                        if (runnable2 != null) {
                            runnable2.run();
                            mw0Var.V = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            mw0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    mw0Var.b("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    l11.r(mw0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (mw0Var.R == null || !l11.g(parse, false, null)) {
                if (parse != null) {
                    parse.toString();
                }
                mw0Var.b("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
            if (z || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                if (oc7.r1(mw0Var.R.N).J3 != null && oc7.r1(mw0Var.R.N).J3.contains(parse.getScheme())) {
                    qw0 qw0Var = mw0Var.R;
                    if (mw0Var.f != null) {
                        uv0 uv0Var4 = qw0Var.c;
                        if (uv0Var4 != null) {
                            uv0Var4.j();
                        } else {
                            Runnable runnable3 = mw0Var.V;
                            if (runnable3 != null) {
                                runnable3.run();
                                mw0Var.V = null;
                            }
                        }
                        qw0 qw0Var2 = mw0Var.f.R;
                        if (qw0Var2 != null && (uv0Var = qw0Var2.c) != null) {
                            uv0Var.b();
                        }
                    }
                    qw0Var.E(parse, null, !qw0Var.p0, false, false);
                }
                mw0Var.b("shouldOverrideUrlLoading(" + str + ") = true");
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.e.b("onReceivedError: " + i + " " + str + " url=" + str2);
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        mw0 mw0Var = this.e;
        mw0Var.b("shouldInterceptRequest " + str);
        boolean z = qw0.R0;
        if (str != null && qw0.n(Uri.parse(str))) {
            mw0Var.b("proxying ton");
            return qw0.K("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
