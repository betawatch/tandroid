package bi;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.hx0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class w2 extends hx0 {
    public final /* synthetic */ x2 A3;
    public final /* synthetic */ boolean z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, i10, f6Var);
        this.A3 = x2Var;
        this.z3 = z10;
    }

    @Override // org.telegram.ui.Components.hx0
    public final dx0[] A1(dx0[] dx0VarArr) {
        if (dx0VarArr != null && this.z3) {
            int i10 = 0;
            while (true) {
                if (i10 >= dx0VarArr.length) {
                    i10 = -1;
                    break;
                }
                dx0 dx0Var = dx0VarArr[i10];
                if (dx0Var != null && dx0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = dx0VarArr.length;
                dx0[] dx0VarArr2 = new dx0[length];
                dx0VarArr2[0] = dx0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    dx0VarArr2[i11] = dx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return dx0VarArr2;
            }
        }
        return dx0VarArr;
    }

    @Override // org.telegram.ui.Components.hx0
    public final void D1(int i10) {
        super.D1(i10);
        this.A3.d(false);
    }

    @Override // org.telegram.ui.Components.hx0
    public final boolean z1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }
}
