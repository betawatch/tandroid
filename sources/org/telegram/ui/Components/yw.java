package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yw implements m2.f {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ kz b;

    public yw(kz kzVar, boolean z4) {
        this.b = kzVar;
        this.a = z4;
    }

    @Override // m2.f
    public final void a(int i10) {
        kz kzVar = this.b;
        vw vwVar = kzVar.h;
        boolean z4 = false;
        if (vwVar != null) {
            int currentItem = vwVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (kzVar.x1 != i11) {
                kzVar.x1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        kzVar.N(i10 == 0, true);
        if (i10 == 2 && (this.a || kzVar.s0)) {
            z4 = true;
        }
        kzVar.S(z4, true);
        if (kzVar.q1.z()) {
            if (i10 == 0) {
                gw gwVar = kzVar.S;
                if (gwVar != null) {
                    gwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                mw mwVar = kzVar.l0;
                if (mwVar != null) {
                    mwVar.d.requestFocus();
                    return;
                }
                return;
            }
            sw swVar = kzVar.D0;
            if (swVar != null) {
                swVar.d.requestFocus();
            }
        }
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        float f11;
        kz kzVar = this.b;
        wy wyVar = kzVar.D0;
        wy wyVar2 = kzVar.l0;
        wy wyVar3 = kzVar.S;
        uw uwVar = kzVar.z0;
        pw pwVar = kzVar.A0;
        px pxVar = kzVar.m0;
        jw jwVar = kzVar.e0;
        ix ixVar = kzVar.M;
        boolean z4 = true;
        if (kzVar.u0 == null || kzVar.d0 == null) {
            f11 = 0.0f;
        } else {
            if (i10 == 0) {
                ixVar.setVisibility(0);
                f11 = 0.0f;
                jwVar.setVisibility(f10 == 0.0f ? 8 : 0);
                pxVar.setVisibility(f10 == 0.0f ? 8 : 0);
                pwVar.setVisibility(8);
                if (uwVar != null) {
                    uwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i10 == 1) {
                    ixVar.setVisibility(8);
                    jwVar.setVisibility(0);
                    pxVar.setVisibility(0);
                    pwVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (uwVar != null) {
                        uwVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    ixVar.setVisibility(8);
                    jwVar.setVisibility(8);
                    pxVar.setVisibility(8);
                    pwVar.setVisibility(0);
                    if (uwVar != null) {
                        uwVar.setVisibility(0);
                    }
                }
            }
        }
        kzVar.getMeasuredWidth();
        kzVar.getPaddingLeft();
        kzVar.getPaddingRight();
        ky kyVar = kzVar.q1;
        if (kyVar != null) {
            if (i10 == 1) {
                kyVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                kyVar.s(3);
            } else {
                kyVar.s(0);
            }
        }
        kzVar.O(true);
        int currentItem = kzVar.h.getCurrentItem();
        wy wyVar4 = currentItem == 0 ? wyVar3 : currentItem == 1 ? wyVar2 : wyVar;
        String obj = wyVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            wy wyVar5 = i12 == 0 ? wyVar3 : i12 == 1 ? wyVar2 : wyVar;
            if (wyVar5 != null) {
                gq gqVar = wyVar5.d;
                if (wyVar5 != wyVar4 && gqVar != null && !gqVar.getText().toString().equals(obj)) {
                    gqVar.setText(obj);
                    gqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f10 <= f11) && i10 != 1) {
            z4 = false;
        }
        kz.a(kzVar, z4);
        kzVar.a0();
    }

    @Override // m2.f
    public final void c(int i10) {
    }
}
