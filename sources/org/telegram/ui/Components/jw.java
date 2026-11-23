package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jw implements c5.h {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ qy b;

    public jw(qy qyVar, boolean z10) {
        this.b = qyVar;
        this.a = z10;
    }

    @Override // c5.h
    public final void a(int i7) {
        qy qyVar = this.b;
        gw gwVar = qyVar.h;
        boolean z10 = false;
        if (gwVar != null) {
            int currentItem = gwVar.getCurrentItem();
            int i10 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (qyVar.B1 != i10) {
                qyVar.B1 = i10;
                org.telegram.messenger.mp.f1().edit().putInt("selected_page", i10).commit();
            }
        }
        qyVar.M(i7 == 0, true);
        if (i7 == 2 && (this.a || qyVar.w0)) {
            z10 = true;
        }
        qyVar.R(z10, true);
        if (qyVar.u1.z()) {
            if (i7 == 0) {
                sv svVar = qyVar.W;
                if (svVar != null) {
                    svVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i7 == 1) {
                xv xvVar = qyVar.p0;
                if (xvVar != null) {
                    xvVar.d.requestFocus();
                    return;
                }
                return;
            }
            dw dwVar = qyVar.H0;
            if (dwVar != null) {
                dwVar.d.requestFocus();
            }
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        float f11;
        qy qyVar = this.b;
        dy dyVar = qyVar.H0;
        dy dyVar2 = qyVar.p0;
        dy dyVar3 = qyVar.W;
        fw fwVar = qyVar.D0;
        aw awVar = qyVar.E0;
        yw ywVar = qyVar.q0;
        vv vvVar = qyVar.i0;
        dx dxVar = qyVar.Q;
        boolean z10 = true;
        if (qyVar.y0 == null || qyVar.h0 == null) {
            f11 = 0.0f;
        } else {
            if (i7 == 0) {
                dxVar.setVisibility(0);
                f11 = 0.0f;
                vvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                ywVar.setVisibility(f10 == 0.0f ? 8 : 0);
                awVar.setVisibility(8);
                if (fwVar != null) {
                    fwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    dxVar.setVisibility(8);
                    vvVar.setVisibility(0);
                    ywVar.setVisibility(0);
                    awVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (fwVar != null) {
                        fwVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i7 == 2) {
                    dxVar.setVisibility(8);
                    vvVar.setVisibility(8);
                    ywVar.setVisibility(8);
                    awVar.setVisibility(0);
                    if (fwVar != null) {
                        fwVar.setVisibility(0);
                    }
                }
            }
        }
        qyVar.getMeasuredWidth();
        qyVar.getPaddingLeft();
        qyVar.getPaddingRight();
        qx qxVar = qyVar.u1;
        if (qxVar != null) {
            if (i7 == 1) {
                qxVar.s(i10 == 0 ? 0 : 2);
            } else if (i7 == 2) {
                qxVar.s(3);
            } else {
                qxVar.s(0);
            }
        }
        qyVar.N(true);
        int currentItem = qyVar.h.getCurrentItem();
        dy dyVar4 = currentItem == 0 ? dyVar3 : currentItem == 1 ? dyVar2 : dyVar;
        String obj = dyVar4.d.getText().toString();
        int i11 = 0;
        while (i11 < 3) {
            dy dyVar5 = i11 == 0 ? dyVar3 : i11 == 1 ? dyVar2 : dyVar;
            if (dyVar5 != null) {
                fq fqVar = dyVar5.d;
                if (dyVar5 != dyVar4 && fqVar != null && !fqVar.getText().toString().equals(obj)) {
                    fqVar.setText(obj);
                    fqVar.setSelection(obj.length());
                }
            }
            i11++;
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z10 = false;
        }
        qy.a(qyVar, z10);
        qyVar.Z();
    }

    @Override // c5.h
    public final void c(int i7) {
    }
}
