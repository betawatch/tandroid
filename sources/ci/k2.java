package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class k2 extends xw0 {
    public final /* synthetic */ l2 A3;
    public final /* synthetic */ boolean z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, i10, f6Var);
        this.A3 = l2Var;
        this.z3 = z10;
    }

    @Override // org.telegram.ui.Components.xw0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.xw0
    public final tw0[] C1(tw0[] tw0VarArr) {
        if (tw0VarArr != null && this.z3) {
            int i10 = 0;
            while (true) {
                if (i10 >= tw0VarArr.length) {
                    i10 = -1;
                    break;
                }
                tw0 tw0Var = tw0VarArr[i10];
                if (tw0Var != null && tw0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = tw0VarArr.length;
                tw0[] tw0VarArr2 = new tw0[length];
                tw0VarArr2[0] = tw0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    tw0VarArr2[i11] = tw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return tw0VarArr2;
            }
        }
        return tw0VarArr;
    }

    @Override // org.telegram.ui.Components.xw0
    public final void F1(int i10) {
        super.F1(i10);
        this.A3.d(false);
    }
}
