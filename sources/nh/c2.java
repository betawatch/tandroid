package nh;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.ow0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c2 extends ow0 {
    public final /* synthetic */ boolean v3;
    public final /* synthetic */ d2 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d2 d2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, i10, c6Var);
        this.w3 = d2Var;
        this.v3 = z10;
    }

    @Override // org.telegram.ui.Components.ow0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.ow0
    public final kw0[] B1(kw0[] kw0VarArr) {
        if (kw0VarArr != null && this.v3) {
            int i10 = 0;
            while (true) {
                if (i10 >= kw0VarArr.length) {
                    i10 = -1;
                    break;
                }
                kw0 kw0Var = kw0VarArr[i10];
                if (kw0Var != null && kw0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = kw0VarArr.length;
                kw0[] kw0VarArr2 = new kw0[length];
                kw0VarArr2[0] = kw0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    kw0VarArr2[i11] = kw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return kw0VarArr2;
            }
        }
        return kw0VarArr;
    }

    @Override // org.telegram.ui.Components.ow0
    public final void E1(int i10) {
        super.E1(i10);
        this.w3.d(false);
    }
}
