// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class kv0 extends WebChromeClient {
    public id a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ nv0 e;

    public kv0(nv0 nv0Var, Context context, boolean z, long j) {
        this.e = nv0Var;
        this.b = context;
        this.c = z;
        this.d = j;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        uu0 uu0Var;
        nv0 nv0Var = this.e;
        nv0Var.b("onCloseWindow " + webView);
        rv0 rv0Var = nv0Var.R;
        if (rv0Var == null || (uu0Var = rv0Var.c) == null) {
            Runnable runnable = nv0Var.V;
            if (runnable != null) {
                runnable.run();
                nv0Var.V = null;
            }
        } else {
            uu0Var.z();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        e S;
        String str = "onCreateWindow isDialog=" + z + " isUserGesture=" + z2 + " resultMsg=" + message;
        nv0 nv0Var = this.e;
        nv0Var.b(str);
        String url = nv0Var.getUrl();
        if (!uc7.s1(yac.t0).S2()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new jv0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (nv0Var.R == null || (S = LaunchActivity.S()) == null) {
            return false;
        }
        if (S.getParentLayout() instanceof ActionBarLayout) {
            S = ((ActionBarLayout) S.getParentLayout()).getSheetFragment();
        }
        o createArticleViewer = S.createArticleViewer(true);
        if (createArticleViewer.v0 != null) {
            int i = 0;
            while (true) {
                m[] mVarArr = createArticleViewer.v0;
                if (i >= mVarArr.length) {
                    break;
                }
                m mVar = mVarArr[i];
                if (mVar != null) {
                    mVar.f.setOpener(nv0Var);
                }
                i++;
            }
        }
        nv0 nv0Var2 = null;
        createArticleViewer.L(null, null, null, null);
        m mVar2 = createArticleViewer.v0[0];
        if (mVar2 != null && mVar2.e()) {
            if (createArticleViewer.v0[0].getWebView() == null) {
                createArticleViewer.v0[0].f.a();
            }
            nv0Var2 = createArticleViewer.v0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            nv0Var2.E = url;
        }
        nv0Var.b("onCreateWindow: newWebView=" + nv0Var2);
        if (nv0Var2 == null) {
            createArticleViewer.l(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(nv0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        id idVar = this.a;
        nv0 nv0Var = this.e;
        if (idVar == null) {
            nv0Var.b("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        nv0Var.b("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        nv0 nv0Var = this.e;
        rv0 rv0Var = nv0Var.R;
        byte b = 0;
        if (rv0Var == null || rv0Var.a0 == null) {
            nv0Var.b("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        nv0Var.b("onGeolocationPermissionsShowPrompt " + str);
        boolean z = this.c;
        String r = z ? lbc.r(nv0Var.R.V) : hl.J0(nv0Var.getUrl(), false);
        rv0 rv0Var2 = nv0Var.R;
        id W = jj.W(rv0Var2.a0, rv0Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, ob6.a0(null, null, z ? 2131752884 : 2131742537, r), ob6.a0(null, null, z ? 2131752883 : 2131742536, r), new dv0(this, callback, str, b));
        this.a = W;
        W.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        rv0 rv0Var = this.e.R;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, rv0Var == null ? null : rv0Var.e, this.b);
        String k = this.c ? wf3.k(yac.t0, this.d) : ob6.a0(null, null, 2131742533, str);
        id idVar = alertDialog$Builder.a;
        idVar.S = k;
        idVar.U = str2;
        alertDialog$Builder.j(ob6.M0(2131747558, null), new gv0(zArr, jsResult, (byte) 2));
        idVar.setOnDismissListener(new hv0(zArr, jsResult, (byte) 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        byte b = 1;
        byte b2 = 0;
        boolean[] zArr = {false};
        rv0 rv0Var = this.e.R;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, rv0Var == null ? null : rv0Var.e, this.b);
        String k = this.c ? wf3.k(yac.t0, this.d) : ob6.a0(null, null, 2131742533, str);
        id idVar = alertDialog$Builder.a;
        idVar.S = k;
        idVar.U = str2;
        alertDialog$Builder.g(ob6.M0(2131752570, null), new gv0(zArr, jsResult, b2));
        alertDialog$Builder.j(ob6.M0(2131747558, null), new gv0(zArr, jsResult, b));
        idVar.setOnDismissListener(new hv0(zArr, jsResult, (byte) 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        rv0 rv0Var = this.e.R;
        vnb vnbVar = rv0Var == null ? null : rv0Var.e;
        byte b = 0;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String k = this.c ? wf3.k(yac.t0, this.d) : ob6.a0(null, null, 2131742533, str);
        id idVar = alertDialog$Builder.a;
        idVar.S = k;
        idVar.U = str2;
        xt3 xt3Var = new xt3(context, vnbVar);
        xt3Var.s0 = true;
        xt3Var.setTextSize(1, 18.0f);
        yob.X(xt3Var, aob.j5, vnbVar);
        yob.l(xt3Var, 34, aob.Oi, vnbVar);
        xt3Var.setFocusable(true);
        xt3Var.setInputType(147457);
        yob.F(xt3Var, aob.k6, aob.l6, aob.p7, vnbVar);
        xt3Var.setImeOptions(6);
        xt3Var.setBackgroundDrawable(null);
        xt3Var.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        xt3Var.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(xt3Var, tre.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        idVar.a = hl.L(292.0f);
        alertDialog$Builder.g(ob6.M0(2131752570, null), new o(zArr, jsPromptResult, (byte) 26));
        alertDialog$Builder.j(ob6.M0(2131747558, null), new ie(zArr, (Object) jsPromptResult, (Object) xt3Var, (byte) 6));
        alertDialog$Builder.i(new gf(zArr, jsPromptResult, (byte) 8));
        idVar.P = new ev0(xt3Var, b);
        xt3Var.setOnEditorActionListener(new iv0(zArr, jsPromptResult, xt3Var, alertDialog$Builder.o(), (byte) 0));
        hl.c3(new fv0(xt3Var, b));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        id idVar = this.a;
        if (idVar != null) {
            idVar.dismiss();
            this.a = null;
        }
        nv0 nv0Var = this.e;
        if (nv0Var.R == null) {
            nv0Var.b("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        nv0Var.b("onPermissionRequest " + permissionRequest);
        byte b = 0;
        boolean z = this.c;
        String r = z ? lbc.r(nv0Var.R.V) : hl.J0(nv0Var.getUrl(), false);
        String[] resources = permissionRequest.getResources();
        byte b2 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        rv0 rv0Var = nv0Var.R;
                        id W = jj.W(rv0Var.a0, rv0Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, ob6.a0(null, null, z ? 2131752889 : 2131742541, r), ob6.a0(null, null, z ? 2131752888 : 2131742540, r), new cv0(this, permissionRequest, resources, b));
                        this.a = W;
                        W.show();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        String str = resources[0];
        rv0 rv0Var2 = nv0Var.R;
        if (rv0Var2.a0 == null) {
            permissionRequest.deny();
            return;
        }
        if (rv0Var2.Q0 != null) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            rv0 rv0Var3 = nv0Var.R;
            id W2 = jj.W(rv0Var3.a0, rv0Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, ob6.a0(null, null, z ? 2131752887 : 2131742539, r), ob6.a0(null, null, z ? 2131752886 : 2131742538, r), new bv0(this, permissionRequest, str, b2));
            this.a = W2;
            W2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            rv0 rv0Var4 = nv0Var.R;
            id W3 = jj.W(rv0Var4.a0, rv0Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, ob6.a0(null, null, z ? 2131752882 : 2131742535, r), ob6.a0(null, null, z ? 2131752881 : 2131742534, r), new bv0(this, permissionRequest, str, b));
            this.a = W3;
            W3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        id idVar = this.a;
        nv0 nv0Var = this.e;
        if (idVar == null) {
            nv0Var.b("onPermissionRequestCanceled: no dialog");
            return;
        }
        nv0Var.b("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        nv0 nv0Var = this.e;
        rv0 rv0Var = nv0Var.R;
        if (rv0Var == null || rv0Var.x == null) {
            nv0Var.b("onProgressChanged " + i + "%: no container");
            return;
        }
        nv0Var.b("onProgressChanged " + i + "%");
        nv0Var.R.x.accept(Float.valueOf(((float) i) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        nv0 nv0Var = this.e;
        HashMap hashMap = nv0Var.Q;
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        nv0Var.b("onReceivedIcon favicon=".concat(str));
        if (bitmap != null && (!TextUtils.equals(nv0Var.getUrl(), nv0Var.M) || nv0Var.P == null || bitmap.getWidth() > nv0Var.P.getWidth())) {
            nv0Var.P = bitmap;
            nv0Var.M = nv0Var.getUrl();
            nv0Var.N = true;
            nv0Var.e();
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(nv0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(nv0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        nv0 nv0Var = this.e;
        nv0Var.b("onReceivedTitle title=" + str);
        if (!nv0Var.h) {
            nv0Var.K = true;
            nv0Var.L = str;
        }
        rv0 rv0Var = nv0Var.R;
        if (rv0Var != null) {
            rv0Var.F();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        this.e.b("onReceivedTouchIconUrl url=" + str + " precomposed=" + z);
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        nv0 nv0Var = this.e;
        Activity W = hl.W(nv0Var.getContext());
        if (W == null) {
            nv0Var.b("onShowFileChooser: no activity, false");
            return false;
        }
        rv0 rv0Var = nv0Var.R;
        if (rv0Var == null) {
            nv0Var.b("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = rv0Var.y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        nv0Var.R.y = valueCallback;
        boolean z = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        nv0Var.b("onShowFileChooser: true");
        return true;
    }
}
