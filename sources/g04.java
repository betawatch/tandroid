// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class g04 implements dic {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ o24 b;

    public g04(o24 o24Var, boolean z) {
        this.b = o24Var;
        this.a = z;
    }

    @Override // dic
    public final void a(int i) {
        o24 o24Var = this.b;
        d04 d04Var = o24Var.h;
        boolean z = false;
        if (d04Var != null) {
            int currentItem = d04Var.getCurrentItem();
            int i2 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (o24Var.B1 != i2) {
                o24Var.B1 = i2;
                uc7.d1().edit().putInt("selected_page", i2).commit();
            }
        }
        o24Var.K(i == 0, true);
        if (i == 2 && (this.a || o24Var.w0)) {
            z = true;
        }
        o24Var.P(z, true);
        if (o24Var.u1.z()) {
            if (i == 0) {
                oz3 oz3Var = o24Var.W;
                if (oz3Var != null) {
                    oz3Var.d.requestFocus();
                    return;
                }
                return;
            }
            if (i == 1) {
                tz3 tz3Var = o24Var.p0;
                if (tz3Var != null) {
                    tz3Var.d.requestFocus();
                    return;
                }
                return;
            }
            a04 a04Var = o24Var.H0;
            if (a04Var != null) {
                a04Var.d.requestFocus();
            }
        }
    }

    @Override // dic
    public final void b(float f, int i, int i2) {
        o24 o24Var = this.b;
        c24 c24Var = o24Var.H0;
        c24 c24Var2 = o24Var.p0;
        c24 c24Var3 = o24Var.W;
        c04 c04Var = o24Var.D0;
        wz3 wz3Var = o24Var.E0;
        w04 w04Var = o24Var.q0;
        rz3 rz3Var = o24Var.i0;
        b14 b14Var = o24Var.Q;
        boolean z = true;
        if (o24Var.y0 != null && o24Var.h0 != null) {
            if (i == 0) {
                b14Var.setVisibility(0);
                rz3Var.setVisibility(f == 0.0f ? 8 : 0);
                w04Var.setVisibility(f == 0.0f ? 8 : 0);
                wz3Var.setVisibility(8);
                if (c04Var != null) {
                    c04Var.setVisibility(8);
                }
            } else if (i == 1) {
                b14Var.setVisibility(8);
                rz3Var.setVisibility(0);
                w04Var.setVisibility(0);
                wz3Var.setVisibility(f == 0.0f ? 8 : 0);
                if (c04Var != null) {
                    c04Var.setVisibility(f != 0.0f ? 0 : 8);
                }
            } else if (i == 2) {
                b14Var.setVisibility(8);
                rz3Var.setVisibility(8);
                w04Var.setVisibility(8);
                wz3Var.setVisibility(0);
                if (c04Var != null) {
                    c04Var.setVisibility(0);
                }
            }
        }
        o24Var.getMeasuredWidth();
        o24Var.getPaddingLeft();
        o24Var.getPaddingRight();
        p14 p14Var = o24Var.u1;
        if (p14Var != null) {
            if (i == 1) {
                p14Var.r(i2 == 0 ? 0 : 2);
            } else if (i == 2) {
                p14Var.r(3);
            } else {
                p14Var.r(0);
            }
        }
        o24Var.L(true);
        int currentItem = o24Var.h.getCurrentItem();
        c24 c24Var4 = currentItem == 0 ? c24Var3 : currentItem == 1 ? c24Var2 : c24Var;
        String obj = c24Var4.d.getText().toString();
        int i3 = 0;
        while (i3 < 3) {
            c24 c24Var5 = i3 == 0 ? c24Var3 : i3 == 1 ? c24Var2 : c24Var;
            if (c24Var5 != null) {
                a24 a24Var = c24Var5.d;
                if (c24Var5 != c24Var4 && a24Var != null && !a24Var.getText().toString().equals(obj)) {
                    a24Var.setText(obj);
                    a24Var.setSelection(obj.length());
                }
            }
            i3++;
        }
        if ((i != 0 || f <= 0.0f) && i != 1) {
            z = false;
        }
        o24Var.Q(z);
        o24Var.Y();
    }

    @Override // dic
    public final void c(int i) {
    }
}
