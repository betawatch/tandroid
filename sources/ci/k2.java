package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.ix0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class k2 extends ix0 {
    public final /* synthetic */ l2 A3;
    public final /* synthetic */ boolean z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, i10, e6Var);
        this.A3 = l2Var;
        this.z3 = z10;
    }

    @Override // org.telegram.ui.Components.ix0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ix0
    public final ex0[] C1(ex0[] ex0VarArr) {
        if (ex0VarArr != null && this.z3) {
            int i10 = 0;
            while (true) {
                if (i10 >= ex0VarArr.length) {
                    i10 = -1;
                    break;
                }
                ex0 ex0Var = ex0VarArr[i10];
                if (ex0Var != null && ex0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = ex0VarArr.length;
                ex0[] ex0VarArr2 = new ex0[length];
                ex0VarArr2[0] = ex0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    ex0VarArr2[i11] = ex0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return ex0VarArr2;
            }
        }
        return ex0VarArr;
    }

    @Override // org.telegram.ui.Components.ix0
    public final void F1(int i10) {
        super.F1(i10);
        this.A3.d(false);
    }
}
