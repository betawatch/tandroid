// default package

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class jv0 extends WebViewClient {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ kv0 b;

    public jv0(kv0 kv0Var, WebView webView) {
        this.b = kv0Var;
        this.a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = Build.VERSION.SDK_INT;
        nv0 nv0Var = this.b.e;
        if (i >= 26) {
            StringBuilder sb = new StringBuilder("newWebView.onRenderProcessGone priority=");
            sb.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb.append(" didCrash=");
            sb.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            nv0Var.b(sb.toString());
        } else {
            nv0Var.b("newWebView.onRenderProcessGone");
        }
        try {
            if (!hl.K1(nv0Var.getContext())) {
                return true;
            }
            Context context = nv0Var.getContext();
            rv0 rv0Var = nv0Var.R;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, rv0Var == null ? null : rv0Var.e, context);
            id idVar = alertDialog$Builder.a;
            idVar.S = ob6.M0(2131752069, null);
            idVar.U = hl.N2(ob6.M0(2131752070, null), -1, 0, new fv0(this, (byte) 1), null);
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            idVar.setOnDismissListener(new o1(this, (byte) 8));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            cc4.g(e, true);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        rv0 rv0Var = this.b.e.R;
        if (rv0Var != null) {
            Uri parse = Uri.parse(str);
            boolean z = rv0.R0;
            rv0Var.E(parse, null, !rv0Var.p0, false, false);
            this.a.destroy();
        }
        return true;
    }
}
