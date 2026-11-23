package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class mw implements c5.h {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ty b;

    public mw(ty tyVar, boolean z10) {
        this.b = tyVar;
        this.a = z10;
    }

    @Override // c5.h
    public final void a(int i7) {
        ty tyVar = this.b;
        jw jwVar = tyVar.h;
        boolean z10 = false;
        if (jwVar != null) {
            int currentItem = jwVar.getCurrentItem();
            int i10 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (tyVar.B1 != i10) {
                tyVar.B1 = i10;
                org.telegram.messenger.np.f1().edit().putInt("selected_page", i10).commit();
            }
        }
        tyVar.M(i7 == 0, true);
        if (i7 == 2 && (this.a || tyVar.w0)) {
            z10 = true;
        }
        tyVar.R(z10, true);
        if (tyVar.u1.z()) {
            if (i7 == 0) {
                vv vvVar = tyVar.W;
                if (vvVar != null) {
                    vvVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i7 == 1) {
                aw awVar = tyVar.p0;
                if (awVar != null) {
                    awVar.d.requestFocus();
                    return;
                }
                return;
            }
            gw gwVar = tyVar.H0;
            if (gwVar != null) {
                gwVar.d.requestFocus();
            }
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        float f11;
        ty tyVar = this.b;
        gy gyVar = tyVar.H0;
        gy gyVar2 = tyVar.p0;
        gy gyVar3 = tyVar.W;
        iw iwVar = tyVar.D0;
        dw dwVar = tyVar.E0;
        bx bxVar = tyVar.q0;
        yv yvVar = tyVar.i0;
        gx gxVar = tyVar.Q;
        boolean z10 = true;
        if (tyVar.y0 == null || tyVar.h0 == null) {
            f11 = 0.0f;
        } else {
            if (i7 == 0) {
                gxVar.setVisibility(0);
                f11 = 0.0f;
                yvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                bxVar.setVisibility(f10 == 0.0f ? 8 : 0);
                dwVar.setVisibility(8);
                if (iwVar != null) {
                    iwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    gxVar.setVisibility(8);
                    yvVar.setVisibility(0);
                    bxVar.setVisibility(0);
                    dwVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (iwVar != null) {
                        iwVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i7 == 2) {
                    gxVar.setVisibility(8);
                    yvVar.setVisibility(8);
                    bxVar.setVisibility(8);
                    dwVar.setVisibility(0);
                    if (iwVar != null) {
                        iwVar.setVisibility(0);
                    }
                }
            }
        }
        tyVar.getMeasuredWidth();
        tyVar.getPaddingLeft();
        tyVar.getPaddingRight();
        tx txVar = tyVar.u1;
        if (txVar != null) {
            if (i7 == 1) {
                txVar.s(i10 == 0 ? 0 : 2);
            } else if (i7 == 2) {
                txVar.s(3);
            } else {
                txVar.s(0);
            }
        }
        tyVar.N(true);
        int currentItem = tyVar.h.getCurrentItem();
        gy gyVar4 = currentItem == 0 ? gyVar3 : currentItem == 1 ? gyVar2 : gyVar;
        String obj = gyVar4.d.getText().toString();
        int i11 = 0;
        while (i11 < 3) {
            gy gyVar5 = i11 == 0 ? gyVar3 : i11 == 1 ? gyVar2 : gyVar;
            if (gyVar5 != null) {
                iq iqVar = gyVar5.d;
                if (gyVar5 != gyVar4 && iqVar != null && !iqVar.getText().toString().equals(obj)) {
                    iqVar.setText(obj);
                    iqVar.setSelection(obj.length());
                }
            }
            i11++;
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z10 = false;
        }
        ty.a(tyVar, z10);
        tyVar.Z();
    }

    @Override // c5.h
    public final void c(int i7) {
    }
}
