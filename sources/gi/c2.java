package gi;

import android.content.Context;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c2 extends xu0 {
    public final /* synthetic */ boolean H3;
    public final /* synthetic */ d2 I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d2 d2Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(i3, context, e6Var);
        this.I3 = d2Var;
        this.H3 = z10;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean D1() {
        return lc.e(8200);
    }

    @Override // org.telegram.ui.Components.xu0
    public final tu0[] E1(tu0[] tu0VarArr) {
        if (tu0VarArr != null && this.H3) {
            int i3 = 0;
            while (true) {
                if (i3 >= tu0VarArr.length) {
                    i3 = -1;
                    break;
                }
                tu0 tu0Var = tu0VarArr[i3];
                if (tu0Var != null && tu0Var.b) {
                    break;
                }
                i3++;
            }
            if (i3 >= 0) {
                int length = tu0VarArr.length;
                tu0[] tu0VarArr2 = new tu0[length];
                tu0VarArr2[0] = tu0VarArr[i3];
                int i10 = 1;
                while (i10 < length) {
                    tu0VarArr2[i10] = tu0VarArr[i10 <= i3 ? i10 - 1 : i10];
                    i10++;
                }
                return tu0VarArr2;
            }
        }
        return tu0VarArr;
    }

    @Override // org.telegram.ui.Components.xu0
    public final void H1(int i3) {
        super.H1(i3);
        this.I3.d(false);
    }
}
