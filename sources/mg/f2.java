package mg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.uh0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f2 extends qg.h {
    public final /* synthetic */ int K;
    public boolean L;
    public final /* synthetic */ ha M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(ha haVar, Context context, p6 p6Var, int i10) {
        super(context, p6Var);
        this.K = i10;
        this.M = haVar;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.K) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                i2 i2Var = (i2) this.M;
                i2Var.i2 = org.telegram.messenger.i0.L(64.0f) + getMeasuredHeight();
                i2Var.h2.G();
                boolean z11 = this.L;
                boolean z12 = i2Var.d;
                if (z11 != z12) {
                    this.L = z12;
                    if (z12) {
                        uk0 uk0Var = i2Var.k1;
                        ci.p pVar = new ci.p(i2Var.getContext(), 2, 0.6f);
                        pVar.a = 1;
                        pVar.p = org.telegram.messenger.i0.L(36.0f);
                        uk0Var.getLayoutManager().w0(pVar);
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                uh0 uh0Var = (uh0) this.M;
                uh0Var.d2 = org.telegram.messenger.i0.L(64.0f) + getMeasuredHeight();
                uh0Var.c2.G();
                boolean z13 = this.L;
                boolean z14 = uh0Var.d;
                if (z13 != z14) {
                    this.L = z14;
                    if (z14) {
                        uk0 uk0Var2 = uh0Var.k1;
                        ci.p pVar2 = new ci.p(uh0Var.getContext(), 2, 0.6f);
                        pVar2.a = 1;
                        pVar2.p = org.telegram.messenger.i0.L(36.0f);
                        uk0Var2.getLayoutManager().w0(pVar2);
                        break;
                    }
                }
                break;
        }
    }
}
