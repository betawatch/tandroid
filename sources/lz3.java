// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lz3 implements eec {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ t14 b;

    public lz3(t14 t14Var, boolean z) {
        this.b = t14Var;
        this.a = z;
    }

    @Override // eec
    public final void a(int i) {
        t14 t14Var = this.b;
        iz3 iz3Var = t14Var.h;
        boolean z = false;
        if (iz3Var != null) {
            int currentItem = iz3Var.getCurrentItem();
            int i2 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (t14Var.B1 != i2) {
                t14Var.B1 = i2;
                na7.b1().edit().putInt("selected_page", i2).commit();
            }
        }
        t14Var.L(i == 0, true);
        if (i == 2 && (this.a || t14Var.w0)) {
            z = true;
        }
        t14Var.Q(z, true);
        if (t14Var.u1.z()) {
            if (i == 0) {
                ty3 ty3Var = t14Var.W;
                if (ty3Var != null) {
                    ty3Var.d.requestFocus();
                    return;
                }
                return;
            }
            if (i == 1) {
                yy3 yy3Var = t14Var.p0;
                if (yy3Var != null) {
                    yy3Var.d.requestFocus();
                    return;
                }
                return;
            }
            fz3 fz3Var = t14Var.H0;
            if (fz3Var != null) {
                fz3Var.d.requestFocus();
            }
        }
    }

    @Override // eec
    public final void b(float f, int i, int i2) {
        t14 t14Var = this.b;
        h14 h14Var = t14Var.H0;
        h14 h14Var2 = t14Var.p0;
        h14 h14Var3 = t14Var.W;
        hz3 hz3Var = t14Var.D0;
        bz3 bz3Var = t14Var.E0;
        b04 b04Var = t14Var.q0;
        wy3 wy3Var = t14Var.i0;
        g04 g04Var = t14Var.Q;
        boolean z = true;
        if (t14Var.y0 != null && t14Var.h0 != null) {
            if (i == 0) {
                g04Var.setVisibility(0);
                wy3Var.setVisibility(f == 0.0f ? 8 : 0);
                b04Var.setVisibility(f == 0.0f ? 8 : 0);
                bz3Var.setVisibility(8);
                if (hz3Var != null) {
                    hz3Var.setVisibility(8);
                }
            } else if (i == 1) {
                g04Var.setVisibility(8);
                wy3Var.setVisibility(0);
                b04Var.setVisibility(0);
                bz3Var.setVisibility(f == 0.0f ? 8 : 0);
                if (hz3Var != null) {
                    hz3Var.setVisibility(f != 0.0f ? 0 : 8);
                }
            } else if (i == 2) {
                g04Var.setVisibility(8);
                wy3Var.setVisibility(8);
                b04Var.setVisibility(8);
                bz3Var.setVisibility(0);
                if (hz3Var != null) {
                    hz3Var.setVisibility(0);
                }
            }
        }
        t14Var.getMeasuredWidth();
        t14Var.getPaddingLeft();
        t14Var.getPaddingRight();
        u04 u04Var = t14Var.u1;
        if (u04Var != null) {
            if (i == 1) {
                u04Var.r(i2 == 0 ? 0 : 2);
            } else if (i == 2) {
                u04Var.r(3);
            } else {
                u04Var.r(0);
            }
        }
        t14Var.M(true);
        int currentItem = t14Var.h.getCurrentItem();
        h14 h14Var4 = currentItem == 0 ? h14Var3 : currentItem == 1 ? h14Var2 : h14Var;
        String obj = h14Var4.d.getText().toString();
        int i3 = 0;
        while (i3 < 3) {
            h14 h14Var5 = i3 == 0 ? h14Var3 : i3 == 1 ? h14Var2 : h14Var;
            if (h14Var5 != null) {
                f14 f14Var = h14Var5.d;
                if (h14Var5 != h14Var4 && f14Var != null && !f14Var.getText().toString().equals(obj)) {
                    f14Var.setText(obj);
                    f14Var.setSelection(obj.length());
                }
            }
            i3++;
        }
        if ((i != 0 || f <= 0.0f) && i != 1) {
            z = false;
        }
        t14Var.R(z);
        t14Var.Z();
    }

    @Override // eec
    public final void c(int i) {
    }
}
