// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kdd implements tq2, us3 {
    @Override // us3
    public final rc0 a(Context context, String str, ts3 ts3Var) {
        rc0 rc0Var = new rc0();
        int a = ts3Var.a(context, str, true);
        rc0Var.b = a;
        if (a != 0) {
            rc0Var.c = 1;
            return rc0Var;
        }
        int b = ts3Var.b(context, str);
        rc0Var.a = b;
        if (b != 0) {
            rc0Var.c = -1;
        }
        return rc0Var;
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        return new q54(am2Var.d(lg7.class));
    }
}
