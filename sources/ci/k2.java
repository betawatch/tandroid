package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.sx0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class k2 extends sx0 {
    public final /* synthetic */ boolean G3;
    public final /* synthetic */ l2 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, i10, d6Var);
        this.H3 = l2Var;
        this.G3 = z10;
    }

    @Override // org.telegram.ui.Components.sx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.sx0
    public final ox0[] C1(ox0[] ox0VarArr) {
        if (ox0VarArr != null && this.G3) {
            int i10 = 0;
            while (true) {
                if (i10 >= ox0VarArr.length) {
                    i10 = -1;
                    break;
                }
                ox0 ox0Var = ox0VarArr[i10];
                if (ox0Var != null && ox0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = ox0VarArr.length;
                ox0[] ox0VarArr2 = new ox0[length];
                ox0VarArr2[0] = ox0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    ox0VarArr2[i11] = ox0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return ox0VarArr2;
            }
        }
        return ox0VarArr;
    }

    @Override // org.telegram.ui.Components.sx0
    public final void F1(int i10) {
        super.F1(i10);
        this.H3.d(false);
    }
}
