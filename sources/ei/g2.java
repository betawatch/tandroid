package ei;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.ux0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class g2 extends ux0 {
    public final /* synthetic */ boolean A3;
    public final /* synthetic */ h2 B3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, i10, g6Var);
        this.B3 = h2Var;
        this.A3 = z10;
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean G1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ux0
    public final qx0[] H1(qx0[] qx0VarArr) {
        if (qx0VarArr != null && this.A3) {
            int i10 = 0;
            while (true) {
                if (i10 >= qx0VarArr.length) {
                    i10 = -1;
                    break;
                }
                qx0 qx0Var = qx0VarArr[i10];
                if (qx0Var != null && qx0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = qx0VarArr.length;
                qx0[] qx0VarArr2 = new qx0[length];
                qx0VarArr2[0] = qx0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    qx0VarArr2[i11] = qx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return qx0VarArr2;
            }
        }
        return qx0VarArr;
    }

    @Override // org.telegram.ui.Components.ux0
    public final void K1(int i10) {
        super.K1(i10);
        this.B3.d(false);
    }
}
