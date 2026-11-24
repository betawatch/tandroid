// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
