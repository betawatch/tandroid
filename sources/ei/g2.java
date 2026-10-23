package ei;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.rx0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class g2 extends rx0 {
    public final /* synthetic */ boolean x3;
    public final /* synthetic */ h2 y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, i10, d6Var);
        this.y3 = h2Var;
        this.x3 = z10;
    }

    @Override // org.telegram.ui.Components.rx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.rx0
    public final nx0[] C1(nx0[] nx0VarArr) {
        if (nx0VarArr != null && this.x3) {
            int i10 = 0;
            while (true) {
                if (i10 >= nx0VarArr.length) {
                    i10 = -1;
                    break;
                }
                nx0 nx0Var = nx0VarArr[i10];
                if (nx0Var != null && nx0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = nx0VarArr.length;
                nx0[] nx0VarArr2 = new nx0[length];
                nx0VarArr2[0] = nx0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    nx0VarArr2[i11] = nx0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return nx0VarArr2;
            }
        }
        return nx0VarArr;
    }

    @Override // org.telegram.ui.Components.rx0
    public final void F1(int i10) {
        super.F1(i10);
        this.y3.d(false);
    }
}
