package ci;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.yx0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class j2 extends yx0 {
    public final /* synthetic */ boolean x3;
    public final /* synthetic */ k2 y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, i10, e6Var);
        this.y3 = k2Var;
        this.x3 = z10;
    }

    @Override // org.telegram.ui.Components.yx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.yx0
    public final ux0[] C1(ux0[] ux0VarArr) {
        if (ux0VarArr != null && this.x3) {
            int i10 = 0;
            while (true) {
                if (i10 >= ux0VarArr.length) {
                    i10 = -1;
                    break;
                }
                ux0 ux0Var = ux0VarArr[i10];
                if (ux0Var != null && ux0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = ux0VarArr.length;
                ux0[] ux0VarArr2 = new ux0[length];
                ux0VarArr2[0] = ux0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    ux0VarArr2[i11] = ux0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return ux0VarArr2;
            }
        }
        return ux0VarArr;
    }

    @Override // org.telegram.ui.Components.yx0
    public final void F1(int i10) {
        super.F1(i10);
        this.y3.d(false);
    }
}
