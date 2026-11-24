// default package

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jwa implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cxa b;

    public /* synthetic */ jwa(cxa cxaVar, byte b) {
        this.a = b;
        this.b = cxaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d Q;
        d Q2;
        byte b = this.a;
        cxa cxaVar = this.b;
        switch (b) {
            case 0:
                if (cxaVar.e > 0 && (Q = LaunchActivity.Q()) != null) {
                    bh0 bh0Var = new bh0();
                    bh0Var.a = true;
                    Q.showAsSheet(new nxa(), bh0Var);
                    break;
                }
                break;
            default:
                if (cxaVar.e > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    bh0 bh0Var2 = new bh0();
                    bh0Var2.a = true;
                    Q2.showAsSheet(new nxa(), bh0Var2);
                    break;
                }
                break;
        }
    }
}
