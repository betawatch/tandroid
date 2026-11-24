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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class jw0 extends WebChromeClient {
    public he a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ mw0 e;

    public jw0(mw0 mw0Var, Context context, boolean z, long j) {
        this.e = mw0Var;
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
        uv0 uv0Var;
        mw0 mw0Var = this.e;
        mw0Var.b("onCloseWindow " + webView);
        qw0 qw0Var = mw0Var.R;
        if (qw0Var == null || (uv0Var = qw0Var.c) == null) {
            Runnable runnable = mw0Var.V;
            if (runnable != null) {
                runnable.run();
                mw0Var.V = null;
            }
        } else {
            uv0Var.z();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        d S;
        String str = "onCreateWindow isDialog=" + z + " isUserGesture=" + z2 + " resultMsg=" + message;
        mw0 mw0Var = this.e;
        mw0Var.b(str);
        String url = mw0Var.getUrl();
        if (!oc7.r1(z8c.t0).O2()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new iw0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (mw0Var.R == null || (S = LaunchActivity.S()) == null) {
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
                    mVar.f.setOpener(mw0Var);
                }
                i++;
            }
        }
        mw0 mw0Var2 = null;
        createArticleViewer.L(null, null, null, null);
        m mVar2 = createArticleViewer.v0[0];
        if (mVar2 != null && mVar2.e()) {
            if (createArticleViewer.v0[0].getWebView() == null) {
                createArticleViewer.v0[0].f.a();
            }
            mw0Var2 = createArticleViewer.v0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            mw0Var2.E = url;
        }
        mw0Var.b("onCreateWindow: newWebView=" + mw0Var2);
        if (mw0Var2 == null) {
            createArticleViewer.l(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(mw0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        he heVar = this.a;
        mw0 mw0Var = this.e;
        if (heVar == null) {
            mw0Var.b("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        mw0Var.b("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        mw0 mw0Var = this.e;
        qw0 qw0Var = mw0Var.R;
        byte b = 0;
        if (qw0Var == null || qw0Var.a0 == null) {
            mw0Var.b("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        mw0Var.b("onGeolocationPermissionsShowPrompt " + str);
        boolean z = this.c;
        String r = z ? m9c.r(mw0Var.R.V) : gm.J0(mw0Var.getUrl(), false);
        qw0 qw0Var2 = mw0Var.R;
        he W = ik.W(qw0Var2.a0, qw0Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, jb6.a0(null, null, z ? 2131752856 : 2131742569, r), jb6.a0(null, null, z ? 2131752855 : 2131742568, r), new dw0(this, callback, str, b));
        this.a = W;
        W.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        qw0 qw0Var = this.e.R;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qw0Var == null ? null : qw0Var.e, this.b);
        String k = this.c ? pg3.k(z8c.t0, this.d) : jb6.a0(null, null, 2131742565, str);
        he heVar = alertDialog$Builder.a;
        heVar.S = k;
        heVar.U = str2;
        alertDialog$Builder.j(jb6.M0(2131747564, null), new fw0(zArr, jsResult, (byte) 2));
        heVar.setOnDismissListener(new gw0(zArr, jsResult, (byte) 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        byte b = 1;
        byte b2 = 0;
        boolean[] zArr = {false};
        qw0 qw0Var = this.e.R;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qw0Var == null ? null : qw0Var.e, this.b);
        String k = this.c ? pg3.k(z8c.t0, this.d) : jb6.a0(null, null, 2131742565, str);
        he heVar = alertDialog$Builder.a;
        heVar.S = k;
        heVar.U = str2;
        alertDialog$Builder.g(jb6.M0(2131752542, null), new fw0(zArr, jsResult, b2));
        alertDialog$Builder.j(jb6.M0(2131747564, null), new fw0(zArr, jsResult, b));
        heVar.setOnDismissListener(new gw0(zArr, jsResult, (byte) 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        qw0 qw0Var = this.e.R;
        ylb ylbVar = qw0Var == null ? null : qw0Var.e;
        byte b = 1;
        byte b2 = 0;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String k = this.c ? pg3.k(z8c.t0, this.d) : jb6.a0(null, null, 2131742565, str);
        he heVar = alertDialog$Builder.a;
        heVar.S = k;
        heVar.U = str2;
        qu3 qu3Var = new qu3(context, ylbVar);
        qu3Var.s0 = true;
        qu3Var.setTextSize(1, 18.0f);
        anb.X(qu3Var, cmb.i5, ylbVar);
        anb.l(qu3Var, 34, cmb.Ni, ylbVar);
        qu3Var.setFocusable(true);
        qu3Var.setInputType(147457);
        anb.F(qu3Var, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        qu3Var.setImeOptions(6);
        qu3Var.setBackgroundDrawable(null);
        qu3Var.setPadding(0, gm.L(6.0f), 0, gm.L(6.0f));
        qu3Var.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(qu3Var, qoe.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        heVar.a = gm.L(292.0f);
        alertDialog$Builder.g(jb6.M0(2131752542, null), new o(zArr, jsPromptResult, (byte) 26));
        alertDialog$Builder.j(jb6.M0(2131747564, null), new jf(zArr, (Object) jsPromptResult, (Object) qu3Var, (byte) 6));
        alertDialog$Builder.i(new dg(zArr, jsPromptResult, (byte) 8));
        heVar.P = new ew0(qu3Var, b2);
        qu3Var.setOnEditorActionListener(new hw0(zArr, jsPromptResult, qu3Var, alertDialog$Builder.o(), (byte) 0));
        gm.c3(new yt0(qu3Var, b));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        he heVar = this.a;
        if (heVar != null) {
            heVar.dismiss();
            this.a = null;
        }
        mw0 mw0Var = this.e;
        if (mw0Var.R == null) {
            mw0Var.b("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        mw0Var.b("onPermissionRequest " + permissionRequest);
        byte b = 0;
        boolean z = this.c;
        String r = z ? m9c.r(mw0Var.R.V) : gm.J0(mw0Var.getUrl(), false);
        String[] resources = permissionRequest.getResources();
        byte b2 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        qw0 qw0Var = mw0Var.R;
                        he W = ik.W(qw0Var.a0, qw0Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, jb6.a0(null, null, z ? 2131752861 : 2131742573, r), jb6.a0(null, null, z ? 2131752860 : 2131742572, r), new cw0(this, permissionRequest, resources, b));
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
        qw0 qw0Var2 = mw0Var.R;
        if (qw0Var2.a0 == null) {
            permissionRequest.deny();
            return;
        }
        if (qw0Var2.Q0 != null) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            qw0 qw0Var3 = mw0Var.R;
            he W2 = ik.W(qw0Var3.a0, qw0Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, jb6.a0(null, null, z ? 2131752859 : 2131742571, r), jb6.a0(null, null, z ? 2131752858 : 2131742570, r), new bw0(this, permissionRequest, str, b2));
            this.a = W2;
            W2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            qw0 qw0Var4 = mw0Var.R;
            he W3 = ik.W(qw0Var4.a0, qw0Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, jb6.a0(null, null, z ? 2131752854 : 2131742567, r), jb6.a0(null, null, z ? 2131752853 : 2131742566, r), new bw0(this, permissionRequest, str, b));
            this.a = W3;
            W3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        he heVar = this.a;
        mw0 mw0Var = this.e;
        if (heVar == null) {
            mw0Var.b("onPermissionRequestCanceled: no dialog");
            return;
        }
        mw0Var.b("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        mw0 mw0Var = this.e;
        qw0 qw0Var = mw0Var.R;
        if (qw0Var == null || qw0Var.x == null) {
            mw0Var.b("onProgressChanged " + i + "%: no container");
            return;
        }
        mw0Var.b("onProgressChanged " + i + "%");
        mw0Var.R.x.accept(Float.valueOf(((float) i) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        mw0 mw0Var = this.e;
        HashMap hashMap = mw0Var.Q;
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        mw0Var.b("onReceivedIcon favicon=".concat(str));
        if (bitmap != null && (!TextUtils.equals(mw0Var.getUrl(), mw0Var.M) || mw0Var.P == null || bitmap.getWidth() > mw0Var.P.getWidth())) {
            mw0Var.P = bitmap;
            mw0Var.M = mw0Var.getUrl();
            mw0Var.N = true;
            mw0Var.e();
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(mw0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(mw0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        mw0 mw0Var = this.e;
        mw0Var.b("onReceivedTitle title=" + str);
        if (!mw0Var.h) {
            mw0Var.K = true;
            mw0Var.L = str;
        }
        qw0 qw0Var = mw0Var.R;
        if (qw0Var != null) {
            qw0Var.F();
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
        mw0 mw0Var = this.e;
        Activity W = gm.W(mw0Var.getContext());
        if (W == null) {
            mw0Var.b("onShowFileChooser: no activity, false");
            return false;
        }
        qw0 qw0Var = mw0Var.R;
        if (qw0Var == null) {
            mw0Var.b("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = qw0Var.y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        mw0Var.R.y = valueCallback;
        boolean z = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        mw0Var.b("onShowFileChooser: true");
        return true;
    }
}
