package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.ww0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class k2 extends ww0 {
    public final /* synthetic */ l2 A3;
    public final /* synthetic */ boolean z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, i10, e6Var);
        this.A3 = l2Var;
        this.z3 = z10;
    }

    @Override // org.telegram.ui.Components.ww0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ww0
    public final sw0[] B1(sw0[] sw0VarArr) {
        if (sw0VarArr != null && this.z3) {
            int i10 = 0;
            while (true) {
                if (i10 >= sw0VarArr.length) {
                    i10 = -1;
                    break;
                }
                sw0 sw0Var = sw0VarArr[i10];
                if (sw0Var != null && sw0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = sw0VarArr.length;
                sw0[] sw0VarArr2 = new sw0[length];
                sw0VarArr2[0] = sw0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    sw0VarArr2[i11] = sw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return sw0VarArr2;
            }
        }
        return sw0VarArr;
    }

    @Override // org.telegram.ui.Components.ww0
    public final void E1(int i10) {
        super.E1(i10);
        this.A3.d(false);
    }
}
