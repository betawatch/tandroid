package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lw implements z4.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ vy b;

    public lw(vy vyVar, boolean z10) {
        this.b = vyVar;
        this.a = z10;
    }

    @Override // z4.e
    public final void a(int i10) {
        vy vyVar = this.b;
        iw iwVar = vyVar.h;
        boolean z10 = false;
        if (iwVar != null) {
            int currentItem = iwVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (vyVar.A1 != i11) {
                vyVar.A1 = i11;
                org.telegram.messenger.vp.c1().edit().putInt("selected_page", i11).commit();
            }
        }
        vyVar.M(i10 == 0, true);
        if (i10 == 2 && (this.a || vyVar.v0)) {
            z10 = true;
        }
        vyVar.R(z10, true);
        if (vyVar.t1.z()) {
            if (i10 == 0) {
                tv tvVar = vyVar.V;
                if (tvVar != null) {
                    tvVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                yv yvVar = vyVar.o0;
                if (yvVar != null) {
                    yvVar.d.requestFocus();
                    return;
                }
                return;
            }
            fw fwVar = vyVar.G0;
            if (fwVar != null) {
                fwVar.d.requestFocus();
            }
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        float f10;
        vy vyVar = this.b;
        iy iyVar = vyVar.G0;
        iy iyVar2 = vyVar.o0;
        iy iyVar3 = vyVar.V;
        hw hwVar = vyVar.C0;
        bw bwVar = vyVar.D0;
        cx cxVar = vyVar.p0;
        wv wvVar = vyVar.h0;
        hx hxVar = vyVar.P;
        boolean z10 = true;
        if (vyVar.x0 == null || vyVar.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                hxVar.setVisibility(0);
                f10 = 0.0f;
                wvVar.setVisibility(f7 == 0.0f ? 8 : 0);
                cxVar.setVisibility(f7 == 0.0f ? 8 : 0);
                bwVar.setVisibility(8);
                if (hwVar != null) {
                    hwVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    hxVar.setVisibility(8);
                    wvVar.setVisibility(0);
                    cxVar.setVisibility(0);
                    bwVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (hwVar != null) {
                        hwVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    hxVar.setVisibility(8);
                    wvVar.setVisibility(8);
                    cxVar.setVisibility(8);
                    bwVar.setVisibility(0);
                    if (hwVar != null) {
                        hwVar.setVisibility(0);
                    }
                }
            }
        }
        vyVar.getMeasuredWidth();
        vyVar.getPaddingLeft();
        vyVar.getPaddingRight();
        vx vxVar = vyVar.t1;
        if (vxVar != null) {
            if (i10 == 1) {
                vxVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                vxVar.s(3);
            } else {
                vxVar.s(0);
            }
        }
        vyVar.N(true);
        int currentItem = vyVar.h.getCurrentItem();
        iy iyVar4 = currentItem == 0 ? iyVar3 : currentItem == 1 ? iyVar2 : iyVar;
        String obj = iyVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            iy iyVar5 = i12 == 0 ? iyVar3 : i12 == 1 ? iyVar2 : iyVar;
            if (iyVar5 != null) {
                yp ypVar = iyVar5.d;
                if (iyVar5 != iyVar4 && ypVar != null && !ypVar.getText().toString().equals(obj)) {
                    ypVar.setText(obj);
                    ypVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        vy.a(vyVar, z10);
        vyVar.Z();
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
