package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.hx0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class k2 extends hx0 {
    public final /* synthetic */ l2 A3;
    public final /* synthetic */ boolean z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, i10, f6Var);
        this.A3 = l2Var;
        this.z3 = z10;
    }

    @Override // org.telegram.ui.Components.hx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.hx0
    public final dx0[] C1(dx0[] dx0VarArr) {
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
    public final void F1(int i10) {
        super.F1(i10);
        this.A3.d(false);
    }
}
