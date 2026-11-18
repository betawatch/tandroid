package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class kw implements c5.h {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ry b;

    public kw(ry ryVar, boolean z10) {
        this.b = ryVar;
        this.a = z10;
    }

    @Override // c5.h
    public final void a(int i7) {
        ry ryVar = this.b;
        hw hwVar = ryVar.h;
        boolean z10 = false;
        if (hwVar != null) {
            int currentItem = hwVar.getCurrentItem();
            int i10 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (ryVar.B1 != i10) {
                ryVar.B1 = i10;
                org.telegram.messenger.mp.f1().edit().putInt("selected_page", i10).commit();
            }
        }
        ryVar.M(i7 == 0, true);
        if (i7 == 2 && (this.a || ryVar.w0)) {
            z10 = true;
        }
        ryVar.R(z10, true);
        if (ryVar.u1.z()) {
            if (i7 == 0) {
                sv svVar = ryVar.W;
                if (svVar != null) {
                    svVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i7 == 1) {
                xv xvVar = ryVar.p0;
                if (xvVar != null) {
                    xvVar.d.requestFocus();
                    return;
                }
                return;
            }
            ew ewVar = ryVar.H0;
            if (ewVar != null) {
                ewVar.d.requestFocus();
            }
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        float f11;
        ry ryVar = this.b;
        ey eyVar = ryVar.H0;
        ey eyVar2 = ryVar.p0;
        ey eyVar3 = ryVar.W;
        gw gwVar = ryVar.D0;
        aw awVar = ryVar.E0;
        zw zwVar = ryVar.q0;
        vv vvVar = ryVar.i0;
        ex exVar = ryVar.Q;
        boolean z10 = true;
        if (ryVar.y0 == null || ryVar.h0 == null) {
            f11 = 0.0f;
        } else {
            if (i7 == 0) {
                exVar.setVisibility(0);
                f11 = 0.0f;
                vvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                zwVar.setVisibility(f10 == 0.0f ? 8 : 0);
                awVar.setVisibility(8);
                if (gwVar != null) {
                    gwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    exVar.setVisibility(8);
                    vvVar.setVisibility(0);
                    zwVar.setVisibility(0);
                    awVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (gwVar != null) {
                        gwVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i7 == 2) {
                    exVar.setVisibility(8);
                    vvVar.setVisibility(8);
                    zwVar.setVisibility(8);
                    awVar.setVisibility(0);
                    if (gwVar != null) {
                        gwVar.setVisibility(0);
                    }
                }
            }
        }
        ryVar.getMeasuredWidth();
        ryVar.getPaddingLeft();
        ryVar.getPaddingRight();
        rx rxVar = ryVar.u1;
        if (rxVar != null) {
            if (i7 == 1) {
                rxVar.s(i10 == 0 ? 0 : 2);
            } else if (i7 == 2) {
                rxVar.s(3);
            } else {
                rxVar.s(0);
            }
        }
        ryVar.N(true);
        int currentItem = ryVar.h.getCurrentItem();
        ey eyVar4 = currentItem == 0 ? eyVar3 : currentItem == 1 ? eyVar2 : eyVar;
        String obj = eyVar4.d.getText().toString();
        int i11 = 0;
        while (i11 < 3) {
            ey eyVar5 = i11 == 0 ? eyVar3 : i11 == 1 ? eyVar2 : eyVar;
            if (eyVar5 != null) {
                gq gqVar = eyVar5.d;
                if (eyVar5 != eyVar4 && gqVar != null && !gqVar.getText().toString().equals(obj)) {
                    gqVar.setText(obj);
                    gqVar.setSelection(obj.length());
                }
            }
            i11++;
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z10 = false;
        }
        ry.a(ryVar, z10);
        ryVar.Z();
    }

    @Override // c5.h
    public final void c(int i7) {
    }
}
