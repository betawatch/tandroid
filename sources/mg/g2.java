package mg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.wh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g2 extends vh.d {
    public final /* synthetic */ int k0;
    public final /* synthetic */ ha l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(ha haVar, Context context, p6 p6Var, int i10) {
        super(context, p6Var, true);
        this.k0 = i10;
        this.l0 = haVar;
    }

    @Override // vh.d
    public final float b(float f7, float f10) {
        switch (this.k0) {
            case 0:
                i2 i2Var = (i2) this.l0;
                boolean z10 = i2Var.l2 == 0.0f;
                i2Var.l2 = f7;
                if (z10) {
                    i2Var.m2 = new d2(i2Var, 0);
                    i2Var.n1(false);
                    break;
                }
                break;
            default:
                wh0 wh0Var = (wh0) this.l0;
                boolean z11 = wh0Var.f2 == 0.0f;
                wh0Var.f2 = f7;
                if (z11) {
                    wh0Var.g2 = new d2(wh0Var, 3);
                    wh0Var.e1(false);
                    break;
                }
                break;
        }
        return f7;
    }
}
