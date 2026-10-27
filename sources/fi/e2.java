package fi;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.yx0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e2 extends cy0 {
    public final /* synthetic */ boolean H3;
    public final /* synthetic */ f2 I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(f2 f2Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, i10, u6Var);
        this.I3 = f2Var;
        this.H3 = z10;
    }

    @Override // org.telegram.ui.Components.cy0
    public final boolean G1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.cy0
    public final yx0[] H1(yx0[] yx0VarArr) {
        if (yx0VarArr != null && this.H3) {
            int i10 = 0;
            while (true) {
                if (i10 >= yx0VarArr.length) {
                    i10 = -1;
                    break;
                }
                yx0 yx0Var = yx0VarArr[i10];
                if (yx0Var != null && yx0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = yx0VarArr.length;
                yx0[] yx0VarArr2 = new yx0[length];
                yx0VarArr2[0] = yx0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    yx0VarArr2[i11] = yx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return yx0VarArr2;
            }
        }
        return yx0VarArr;
    }

    @Override // org.telegram.ui.Components.cy0
    public final void K1(int i10) {
        super.K1(i10);
        this.I3.d(false);
    }
}
