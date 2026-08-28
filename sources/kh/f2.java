package kh;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.ew0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f2 extends ew0 {
    public final /* synthetic */ boolean v3;
    public final /* synthetic */ g2 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g2 g2Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, i9, b6Var);
        this.w3 = g2Var;
        this.v3 = z10;
    }

    @Override // org.telegram.ui.Components.ew0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ew0
    public final aw0[] B1(aw0[] aw0VarArr) {
        if (aw0VarArr != null && this.v3) {
            int i9 = 0;
            while (true) {
                if (i9 >= aw0VarArr.length) {
                    i9 = -1;
                    break;
                }
                aw0 aw0Var = aw0VarArr[i9];
                if (aw0Var != null && aw0Var.b) {
                    break;
                }
                i9++;
            }
            if (i9 >= 0) {
                int length = aw0VarArr.length;
                aw0[] aw0VarArr2 = new aw0[length];
                aw0VarArr2[0] = aw0VarArr[i9];
                int i10 = 1;
                while (i10 < length) {
                    aw0VarArr2[i10] = aw0VarArr[i10 <= i9 ? i10 - 1 : i10];
                    i10++;
                }
                return aw0VarArr2;
            }
        }
        return aw0VarArr;
    }

    @Override // org.telegram.ui.Components.ew0
    public final void E1(int i9) {
        super.E1(i9);
        this.w3.d(false);
    }
}
