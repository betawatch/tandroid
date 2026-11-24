// default package

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class iw0 extends WebViewClient {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ jw0 b;

    public iw0(jw0 jw0Var, WebView webView) {
        this.b = jw0Var;
        this.a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = Build.VERSION.SDK_INT;
        mw0 mw0Var = this.b.e;
        if (i >= 26) {
            StringBuilder sb = new StringBuilder("newWebView.onRenderProcessGone priority=");
            sb.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb.append(" didCrash=");
            sb.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            mw0Var.b(sb.toString());
        } else {
            mw0Var.b("newWebView.onRenderProcessGone");
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
            heVar.U = gm.N2(jb6.M0(2131752042, null), -1, 0, new yt0(this, (byte) 2), null);
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            heVar.setOnDismissListener(new n1(this, (byte) 8));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            fc4.g(e, true);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        qw0 qw0Var = this.b.e.R;
        if (qw0Var != null) {
            Uri parse = Uri.parse(str);
            boolean z = qw0.R0;
            qw0Var.E(parse, null, !qw0Var.p0, false, false);
            this.a.destroy();
        }
        return true;
    }
}
