package ai;

import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ q(e0 e0Var, int i3) {
        this.a = i3;
        this.b = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        e0 e0Var = this.b;
        switch (i3) {
            case 0:
                e0Var.dismiss();
                break;
            case 1:
                int value = e0Var.V1.getValue();
                int e10 = (int) e0Var.e2.e();
                if (value >= e10) {
                    e0Var.g1(value);
                    break;
                } else {
                    org.telegram.messenger.g0.F3(e0Var.T1);
                    org.telegram.messenger.camera.q.s(bd.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new fc(e0Var.c, e0Var.J0), R.raw.info, 36);
                    break;
                }
            default:
                e0Var.V1.setValueAnimated((int) e0Var.e2.e());
                break;
        }
    }
}
