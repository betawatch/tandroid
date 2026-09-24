package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.gx0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class k2 extends gx0 {
    public final /* synthetic */ l2 A3;
    public final /* synthetic */ boolean z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, i10, d6Var);
        this.A3 = l2Var;
        this.z3 = z10;
    }

    @Override // org.telegram.ui.Components.gx0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.gx0
    public final cx0[] B1(cx0[] cx0VarArr) {
        if (cx0VarArr != null && this.z3) {
            int i10 = 0;
            while (true) {
                if (i10 >= cx0VarArr.length) {
                    i10 = -1;
                    break;
                }
                cx0 cx0Var = cx0VarArr[i10];
                if (cx0Var != null && cx0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = cx0VarArr.length;
                cx0[] cx0VarArr2 = new cx0[length];
                cx0VarArr2[0] = cx0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    cx0VarArr2[i11] = cx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return cx0VarArr2;
            }
        }
        return cx0VarArr;
    }

    @Override // org.telegram.ui.Components.gx0
    public final void E1(int i10) {
        super.E1(i10);
        this.A3.d(false);
    }
}
