package fi;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.xx0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e2 extends by0 {
    public final /* synthetic */ boolean H3;
    public final /* synthetic */ f2 I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(f2 f2Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, i10, u6Var);
        this.I3 = f2Var;
        this.H3 = z10;
    }

    @Override // org.telegram.ui.Components.by0
    public final boolean G1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.by0
    public final xx0[] H1(xx0[] xx0VarArr) {
        if (xx0VarArr != null && this.H3) {
            int i10 = 0;
            while (true) {
                if (i10 >= xx0VarArr.length) {
                    i10 = -1;
                    break;
                }
                xx0 xx0Var = xx0VarArr[i10];
                if (xx0Var != null && xx0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = xx0VarArr.length;
                xx0[] xx0VarArr2 = new xx0[length];
                xx0VarArr2[0] = xx0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    xx0VarArr2[i11] = xx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return xx0VarArr2;
            }
        }
        return xx0VarArr;
    }

    @Override // org.telegram.ui.Components.by0
    public final void K1(int i10) {
        super.K1(i10);
        this.I3.d(false);
    }
}
