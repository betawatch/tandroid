// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j02 extends gb {
    public final /* synthetic */ k02 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j02(k02 k02Var, k02 k02Var2) {
        super(k02Var2);
        this.x = k02Var;
    }

    @Override // gb
    public final boolean b() {
        t14 t14Var;
        x02 x02Var = this.x.r0;
        if ((!x02Var.J || x02Var.r2) && x02Var.p3) {
            p02 p02Var = x02Var.v2;
            if (p02Var != x02Var.g2 && p02Var != x02Var.h2 && !x02Var.U0().m()) {
                return true;
            }
            p02 p02Var2 = x02Var.v2;
            k62 k62Var = x02Var.g2;
            if (p02Var2 == k62Var && ((t14Var = k62Var.F) == null || t14Var.getVisibility() != 0)) {
                return true;
            }
            p02 p02Var3 = x02Var.v2;
            k62 k62Var2 = x02Var.h2;
            if (p02Var3 == k62Var2) {
                t14 t14Var2 = k62Var2.F;
                return t14Var2 == null || t14Var2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // gb
    public final void e(float f, float f2, boolean z) {
        k02 k02Var = this.x;
        x02 x02Var = k02Var.r0;
        x02Var.i4 = f;
        float f3 = x02Var.a4;
        if (f3 > 0.0f) {
            f = tb4.A(f3, x02Var.b4, (x02Var.v2 != x02Var.q2 || z) ? 1.0f - f2 : f2, f);
            x02Var.i4 = f;
        }
        x02Var.U2.setTranslationY(f);
        x02Var.X2.setTranslationY(x02Var.i4);
        r7 r7Var = x02Var.b3;
        if (r7Var != null) {
            r7Var.setTranslationY(x02Var.i4);
        }
        r7 r7Var2 = x02Var.Z2;
        if (r7Var2 != null) {
            r7Var2.setTranslationY(x02Var.X2.getTranslationY());
        }
        je5 je5Var = x02Var.a3;
        if (je5Var != null) {
            je5Var.setTranslationY(x02Var.X2.getTranslationY());
        }
        x02Var.c3.setTranslationY(x02Var.i4);
        x02Var.K1(0);
        x02Var.F0 = x02Var.v2 != x02Var.q2 ? x02Var.i4 : 0.0f;
        x02Var.c.invalidate();
        k02Var.invalidate();
        x02Var.A2.invalidate();
        x02Var.E1();
        p02 p02Var = x02Var.v2;
        if (p02Var != null) {
            p02Var.n(x02Var.i4, f2);
        }
    }

    @Override // gb
    public final void f() {
        x02 x02Var = this.x.r0;
        x02Var.H1(x02Var.v2, 0);
        x02Var.Z3 = x02Var.Y3[0];
        x02Var.v2.z();
        if (!(x02Var.v2 instanceof s12) || x02Var.A3) {
            return;
        }
        int L = x02Var.d ? gl.L(84.0f) : 0;
        for (int i = 0; i < x02Var.u2.size(); i++) {
            ((s12) x02Var.u2.valueAt(i)).setMeasureOffsetY(L);
        }
    }

    @Override // gb
    public final void g(int i, boolean z) {
        int i2;
        k02 k02Var = this.x;
        x02 x02Var = k02Var.r0;
        int i3 = x02Var.Z3;
        if (i3 <= 0 || i3 == (i2 = x02Var.Y3[0]) || !(z || x02Var.v2 == x02Var.q2)) {
            x02Var.a4 = -1.0f;
        } else {
            x02Var.a4 = i3;
            x02Var.b4 = i2;
        }
        k02Var.invalidate();
        if ((x02Var.v2 instanceof s12) && !x02Var.A3) {
            wz1 wz1Var = x02Var.u3;
            if (z) {
                wz1Var.setVisibility(8);
            } else {
                wz1Var.setVisibility(0);
            }
        }
        x02Var.v2.A(i, z);
    }
}
