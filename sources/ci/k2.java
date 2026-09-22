package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.jx0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class k2 extends jx0 {
    public final /* synthetic */ l2 A3;
    public final /* synthetic */ boolean z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, i10, f6Var);
        this.A3 = l2Var;
        this.z3 = z10;
    }

    @Override // org.telegram.ui.Components.jx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.jx0
    public final fx0[] C1(fx0[] fx0VarArr) {
        if (fx0VarArr != null && this.z3) {
            int i10 = 0;
            while (true) {
                if (i10 >= fx0VarArr.length) {
                    i10 = -1;
                    break;
                }
                fx0 fx0Var = fx0VarArr[i10];
                if (fx0Var != null && fx0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = fx0VarArr.length;
                fx0[] fx0VarArr2 = new fx0[length];
                fx0VarArr2[0] = fx0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    fx0VarArr2[i11] = fx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return fx0VarArr2;
            }
        }
        return fx0VarArr;
    }

    @Override // org.telegram.ui.Components.jx0
    public final void F1(int i10) {
        super.F1(i10);
        this.A3.d(false);
    }
}
