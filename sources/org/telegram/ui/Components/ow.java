package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ow implements m2.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ wy b;

    public ow(wy wyVar, boolean z10) {
        this.b = wyVar;
        this.a = z10;
    }

    @Override // m2.e
    public final void b(int i9) {
        wy wyVar = this.b;
        lw lwVar = wyVar.h;
        boolean z10 = false;
        if (lwVar != null) {
            int currentItem = lwVar.getCurrentItem();
            int i10 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (wyVar.w1 != i10) {
                wyVar.w1 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i10).commit();
            }
        }
        wyVar.M(i9 == 0, true);
        if (i9 == 2 && (this.a || wyVar.r0)) {
            z10 = true;
        }
        wyVar.R(z10, true);
        if (wyVar.p1.z()) {
            if (i9 == 0) {
                wv wvVar = wyVar.R;
                if (wvVar != null) {
                    wvVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i9 == 1) {
                cw cwVar = wyVar.k0;
                if (cwVar != null) {
                    cwVar.d.requestFocus();
                    return;
                }
                return;
            }
            iw iwVar = wyVar.C0;
            if (iwVar != null) {
                iwVar.d.requestFocus();
            }
        }
    }

    @Override // m2.e
    public final void c(float f10, int i9, int i10) {
        float f11;
        wy wyVar = this.b;
        jy jyVar = wyVar.C0;
        jy jyVar2 = wyVar.k0;
        jy jyVar3 = wyVar.R;
        kw kwVar = wyVar.y0;
        fw fwVar = wyVar.z0;
        dx dxVar = wyVar.l0;
        zv zvVar = wyVar.d0;
        ww wwVar = wyVar.L;
        boolean z10 = true;
        if (wyVar.t0 == null || wyVar.c0 == null) {
            f11 = 0.0f;
        } else {
            if (i9 == 0) {
                wwVar.setVisibility(0);
                f11 = 0.0f;
                zvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                dxVar.setVisibility(f10 == 0.0f ? 8 : 0);
                fwVar.setVisibility(8);
                if (kwVar != null) {
                    kwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i9 == 1) {
                    wwVar.setVisibility(8);
                    zvVar.setVisibility(0);
                    dxVar.setVisibility(0);
                    fwVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (kwVar != null) {
                        kwVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i9 == 2) {
                    wwVar.setVisibility(8);
                    zvVar.setVisibility(8);
                    dxVar.setVisibility(8);
                    fwVar.setVisibility(0);
                    if (kwVar != null) {
                        kwVar.setVisibility(0);
                    }
                }
            }
        }
        wyVar.getMeasuredWidth();
        wyVar.getPaddingLeft();
        wyVar.getPaddingRight();
        wx wxVar = wyVar.p1;
        if (wxVar != null) {
            if (i9 == 1) {
                wxVar.s(i10 == 0 ? 0 : 2);
            } else if (i9 == 2) {
                wxVar.s(3);
            } else {
                wxVar.s(0);
            }
        }
        wyVar.N(true);
        int currentItem = wyVar.h.getCurrentItem();
        jy jyVar4 = currentItem == 0 ? jyVar3 : currentItem == 1 ? jyVar2 : jyVar;
        String obj = jyVar4.d.getText().toString();
        int i11 = 0;
        while (i11 < 3) {
            jy jyVar5 = i11 == 0 ? jyVar3 : i11 == 1 ? jyVar2 : jyVar;
            if (jyVar5 != null) {
                yp ypVar = jyVar5.d;
                if (jyVar5 != jyVar4 && ypVar != null && !ypVar.getText().toString().equals(obj)) {
                    ypVar.setText(obj);
                    ypVar.setSelection(obj.length());
                }
            }
            i11++;
        }
        if ((i9 != 0 || f10 <= f11) && i9 != 1) {
            z10 = false;
        }
        wy.b(wyVar, z10);
        wyVar.Z();
    }

    @Override // m2.e
    public final void d(int i9) {
    }
}
