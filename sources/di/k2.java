package di;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.vw0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class k2 extends vw0 {
    public final /* synthetic */ l2 A3;
    public final /* synthetic */ boolean z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, i10, f6Var);
        this.A3 = l2Var;
        this.z3 = z10;
    }

    @Override // org.telegram.ui.Components.vw0
    public final rw0[] A1(rw0[] rw0VarArr) {
        if (rw0VarArr != null && this.z3) {
            int i10 = 0;
            while (true) {
                if (i10 >= rw0VarArr.length) {
                    i10 = -1;
                    break;
                }
                rw0 rw0Var = rw0VarArr[i10];
                if (rw0Var != null && rw0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = rw0VarArr.length;
                rw0[] rw0VarArr2 = new rw0[length];
                rw0VarArr2[0] = rw0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    rw0VarArr2[i11] = rw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return rw0VarArr2;
            }
        }
        return rw0VarArr;
    }

    @Override // org.telegram.ui.Components.vw0
    public final void D1(int i10) {
        super.D1(i10);
        this.A3.d(false);
    }

    @Override // org.telegram.ui.Components.vw0
    public final boolean z1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }
}
