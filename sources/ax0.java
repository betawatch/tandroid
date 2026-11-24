// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx0 b;

    public /* synthetic */ ax0(wx0 wx0Var, byte b) {
        this.a = b;
        this.b = wx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                mw0 webView = wx0Var.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            default:
                wx0Var.w();
                break;
        }
    }
}
