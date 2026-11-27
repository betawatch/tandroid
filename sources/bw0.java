// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xw0 b;

    public /* synthetic */ bw0(xw0 xw0Var, byte b) {
        this.a = b;
        this.b = xw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        xw0 xw0Var = this.b;
        switch (b) {
            case 0:
                nv0 webView = xw0Var.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            default:
                xw0Var.w();
                break;
        }
    }
}
