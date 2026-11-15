package hi;

import android.content.Context;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.wu0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c2 extends av0 {
    public final /* synthetic */ boolean H3;
    public final /* synthetic */ d2 I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d2 d2Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(i7, context, e6Var);
        this.I3 = d2Var;
        this.H3 = z10;
    }

    @Override // org.telegram.ui.Components.av0
    public final boolean D1() {
        return qc.e(8200);
    }

    @Override // org.telegram.ui.Components.av0
    public final wu0[] E1(wu0[] wu0VarArr) {
        if (wu0VarArr != null && this.H3) {
            int i7 = 0;
            while (true) {
                if (i7 >= wu0VarArr.length) {
                    i7 = -1;
                    break;
                }
                wu0 wu0Var = wu0VarArr[i7];
                if (wu0Var != null && wu0Var.b) {
                    break;
                }
                i7++;
            }
            if (i7 >= 0) {
                int length = wu0VarArr.length;
                wu0[] wu0VarArr2 = new wu0[length];
                wu0VarArr2[0] = wu0VarArr[i7];
                int i10 = 1;
                while (i10 < length) {
                    wu0VarArr2[i10] = wu0VarArr[i10 <= i7 ? i10 - 1 : i10];
                    i10++;
                }
                return wu0VarArr2;
            }
        }
        return wu0VarArr;
    }

    @Override // org.telegram.ui.Components.av0
    public final void H1(int i7) {
        super.H1(i7);
        this.I3.d(false);
    }
}
