package di;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.ux0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class j2 extends ux0 {
    public final /* synthetic */ boolean x3;
    public final /* synthetic */ k2 y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, i10, c6Var);
        this.y3 = k2Var;
        this.x3 = z10;
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ux0
    public final qx0[] C1(qx0[] qx0VarArr) {
        if (qx0VarArr != null && this.x3) {
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
    public final void F1(int i10) {
        super.F1(i10);
        this.y3.d(false);
    }
}
