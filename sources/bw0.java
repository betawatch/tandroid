// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
