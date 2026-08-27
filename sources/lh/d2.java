package lh;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.gw0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d2 extends gw0 {
    public final /* synthetic */ boolean v3;
    public final /* synthetic */ e2 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, i10, c6Var);
        this.w3 = e2Var;
        this.v3 = z10;
    }

    @Override // org.telegram.ui.Components.gw0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.gw0
    public final cw0[] B1(cw0[] cw0VarArr) {
        if (cw0VarArr != null && this.v3) {
            int i10 = 0;
            while (true) {
                if (i10 >= cw0VarArr.length) {
                    i10 = -1;
                    break;
                }
                cw0 cw0Var = cw0VarArr[i10];
                if (cw0Var != null && cw0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = cw0VarArr.length;
                cw0[] cw0VarArr2 = new cw0[length];
                cw0VarArr2[0] = cw0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    cw0VarArr2[i11] = cw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return cw0VarArr2;
            }
        }
        return cw0VarArr;
    }

    @Override // org.telegram.ui.Components.gw0
    public final void E1(int i10) {
        super.E1(i10);
        this.w3.d(false);
    }
}
