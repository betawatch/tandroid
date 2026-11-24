// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gw5 extends ew3 {
    public final /* synthetic */ rw5 D1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw5(rw5 rw5Var, Context context, tv5 tv5Var) {
        super(tv5Var, context, false, false);
        this.D1 = rw5Var;
    }

    @Override // ew3
    public final boolean E0(Integer num) {
        if (num.intValue() != 6) {
            return num.intValue() == 2;
        }
        yb1 yb1Var = this.D1.P1;
        return yb1Var != null && yb1Var.c();
    }
}
