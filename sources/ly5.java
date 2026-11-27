// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ly5 extends zw3 {
    public final /* synthetic */ wy5 D1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly5(wy5 wy5Var, Context context, yx5 yx5Var) {
        super(yx5Var, context, false, false);
        this.D1 = wy5Var;
    }

    @Override // zw3
    public final boolean F0(Integer num) {
        if (num.intValue() != 6) {
            return num.intValue() == 2;
        }
        gc1 gc1Var = this.D1.J1;
        return gc1Var != null && gc1Var.c();
    }
}
