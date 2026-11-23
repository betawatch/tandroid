package hi;

import android.content.Context;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.kv0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class k2 extends kv0 {
    public final /* synthetic */ boolean H3;
    public final /* synthetic */ l2 I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(i7, context, i6Var);
        this.I3 = l2Var;
        this.H3 = z10;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean D1() {
        return pc.e(8200);
    }

    @Override // org.telegram.ui.Components.kv0
    public final gv0[] E1(gv0[] gv0VarArr) {
        if (gv0VarArr != null && this.H3) {
            int i7 = 0;
            while (true) {
                if (i7 >= gv0VarArr.length) {
                    i7 = -1;
                    break;
                }
                gv0 gv0Var = gv0VarArr[i7];
                if (gv0Var != null && gv0Var.b) {
                    break;
                }
                i7++;
            }
            if (i7 >= 0) {
                int length = gv0VarArr.length;
                gv0[] gv0VarArr2 = new gv0[length];
                gv0VarArr2[0] = gv0VarArr[i7];
                int i10 = 1;
                while (i10 < length) {
                    gv0VarArr2[i10] = gv0VarArr[i10 <= i7 ? i10 - 1 : i10];
                    i10++;
                }
                return gv0VarArr2;
            }
        }
        return gv0VarArr;
    }

    @Override // org.telegram.ui.Components.kv0
    public final void H1(int i7) {
        super.H1(i7);
        this.I3.d(false);
    }
}
