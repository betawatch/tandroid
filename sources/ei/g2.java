package ei;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.qx0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class g2 extends qx0 {
    public final /* synthetic */ boolean x3;
    public final /* synthetic */ h2 y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, i10, d6Var);
        this.y3 = h2Var;
        this.x3 = z10;
    }

    @Override // org.telegram.ui.Components.qx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.qx0
    public final mx0[] C1(mx0[] mx0VarArr) {
        if (mx0VarArr != null && this.x3) {
            int i10 = 0;
            while (true) {
                if (i10 >= mx0VarArr.length) {
                    i10 = -1;
                    break;
                }
                mx0 mx0Var = mx0VarArr[i10];
                if (mx0Var != null && mx0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = mx0VarArr.length;
                mx0[] mx0VarArr2 = new mx0[length];
                mx0VarArr2[0] = mx0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    mx0VarArr2[i11] = mx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return mx0VarArr2;
            }
        }
        return mx0VarArr;
    }

    @Override // org.telegram.ui.Components.qx0
    public final void F1(int i10) {
        super.F1(i10);
        this.y3.d(false);
    }
}
