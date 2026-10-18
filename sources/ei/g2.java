package ei;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.px0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class g2 extends px0 {
    public final /* synthetic */ boolean x3;
    public final /* synthetic */ h2 y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, i10, d6Var);
        this.y3 = h2Var;
        this.x3 = z10;
    }

    @Override // org.telegram.ui.Components.px0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.px0
    public final lx0[] C1(lx0[] lx0VarArr) {
        if (lx0VarArr != null && this.x3) {
            int i10 = 0;
            while (true) {
                if (i10 >= lx0VarArr.length) {
                    i10 = -1;
                    break;
                }
                lx0 lx0Var = lx0VarArr[i10];
                if (lx0Var != null && lx0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = lx0VarArr.length;
                lx0[] lx0VarArr2 = new lx0[length];
                lx0VarArr2[0] = lx0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    lx0VarArr2[i11] = lx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return lx0VarArr2;
            }
        }
        return lx0VarArr;
    }

    @Override // org.telegram.ui.Components.px0
    public final void F1(int i10) {
        super.F1(i10);
        this.y3.d(false);
    }
}
