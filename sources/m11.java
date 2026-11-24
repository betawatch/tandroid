// default package

import android.animation.ObjectAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class m11 implements p11 {
    public long a;

    public m11(k27 k27Var) {
        this.a = k27.B0(k27Var.k);
        k27Var.e1();
    }

    public final boolean a(rg6 rg6Var) {
        return rg6Var.b == this.a && ah5.c(rg6Var);
    }

    @Override // p11
    public final void f(q11 q11Var, b11 b11Var, nv0 nv0Var, i42 i42Var) {
        q11Var.setInOutOffset(q11Var.getMeasuredHeight());
        i42Var.accept(Float.valueOf(q11Var.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q11Var, q11.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(ls3.d);
        byte b = 5;
        ofFloat.addListener(new u5(b11Var, nv0Var, false, b));
        ofFloat.addUpdateListener(new pk(i42Var, q11Var, b));
        ofFloat.start();
    }

    @Override // p11
    public final void g(q11 q11Var, b11 b11Var, z01 z01Var, gw gwVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q11Var, q11.IN_OUT_OFFSET_Y2, q11Var.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ls3.c);
        ofFloat.addListener(new u5(b11Var, z01Var, false, (byte) 6));
        ofFloat.addUpdateListener(new pk(gwVar, q11Var, (byte) 4));
        ofFloat.start();
    }
}
