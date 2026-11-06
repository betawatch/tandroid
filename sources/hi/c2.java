package hi;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ c2(a3 a3Var, int i7) {
        this.a = i7;
        this.b = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.web.u0 webView = this.b.D.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            default:
                this.b.w();
                break;
        }
    }
}
