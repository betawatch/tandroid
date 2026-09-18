package ei;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ n2(k3 k3Var, int i10) {
        this.a = i10;
        this.b = k3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.web.z0 webView = this.b.x.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            default:
                this.b.r();
                break;
        }
    }
}
