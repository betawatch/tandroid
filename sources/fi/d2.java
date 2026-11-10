package fi;

import android.content.Context;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d2 extends zu0 {
    public final /* synthetic */ boolean G3;
    public final /* synthetic */ e2 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(i7, context, h6Var);
        this.H3 = e2Var;
        this.G3 = z9;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean D1() {
        return sc.e(8200);
    }

    @Override // org.telegram.ui.Components.zu0
    public final vu0[] E1(vu0[] vu0VarArr) {
        if (vu0VarArr != null && this.G3) {
            int i7 = 0;
            while (true) {
                if (i7 >= vu0VarArr.length) {
                    i7 = -1;
                    break;
                }
                vu0 vu0Var = vu0VarArr[i7];
                if (vu0Var != null && vu0Var.b) {
                    break;
                }
                i7++;
            }
            if (i7 >= 0) {
                int length = vu0VarArr.length;
                vu0[] vu0VarArr2 = new vu0[length];
                vu0VarArr2[0] = vu0VarArr[i7];
                int i10 = 1;
                while (i10 < length) {
                    vu0VarArr2[i10] = vu0VarArr[i10 <= i7 ? i10 - 1 : i10];
                    i10++;
                }
                return vu0VarArr2;
            }
        }
        return vu0VarArr;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void H1(int i7) {
        super.H1(i7);
        this.H3.d(false);
    }
}
