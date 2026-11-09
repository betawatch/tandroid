package fi;

import android.content.Context;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.wu0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d2 extends av0 {
    public final /* synthetic */ boolean G3;
    public final /* synthetic */ e2 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(i7, context, g6Var);
        this.H3 = e2Var;
        this.G3 = z9;
    }

    @Override // org.telegram.ui.Components.av0
    public final boolean D1() {
        return sc.e(8200);
    }

    @Override // org.telegram.ui.Components.av0
    public final wu0[] E1(wu0[] wu0VarArr) {
        if (wu0VarArr != null && this.G3) {
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
        this.H3.d(false);
    }
}
