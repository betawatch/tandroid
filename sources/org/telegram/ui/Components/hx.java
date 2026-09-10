package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hx implements z4.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ rz b;

    public hx(rz rzVar, boolean z10) {
        this.b = rzVar;
        this.a = z10;
    }

    @Override // z4.e
    public final void a(int i10) {
        rz rzVar = this.b;
        ex exVar = rzVar.h;
        boolean z10 = false;
        if (exVar != null) {
            int currentItem = exVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (rzVar.A1 != i11) {
                rzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        rzVar.N(i10 == 0, true);
        if (i10 == 2 && (this.a || rzVar.v0)) {
            z10 = true;
        }
        rzVar.S(z10, true);
        if (rzVar.t1.z()) {
            if (i10 == 0) {
                pw pwVar = rzVar.V;
                if (pwVar != null) {
                    pwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                vw vwVar = rzVar.o0;
                if (vwVar != null) {
                    vwVar.d.requestFocus();
                    return;
                }
                return;
            }
            bx bxVar = rzVar.G0;
            if (bxVar != null) {
                bxVar.d.requestFocus();
            }
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        float f10;
        rz rzVar = this.b;
        ez ezVar = rzVar.G0;
        ez ezVar2 = rzVar.o0;
        ez ezVar3 = rzVar.V;
        dx dxVar = rzVar.C0;
        yw ywVar = rzVar.D0;
        wx wxVar = rzVar.p0;
        sw swVar = rzVar.h0;
        px pxVar = rzVar.P;
        boolean z10 = true;
        if (rzVar.x0 == null || rzVar.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                pxVar.setVisibility(0);
                f10 = 0.0f;
                swVar.setVisibility(f7 == 0.0f ? 8 : 0);
                wxVar.setVisibility(f7 == 0.0f ? 8 : 0);
                ywVar.setVisibility(8);
                if (dxVar != null) {
                    dxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    pxVar.setVisibility(8);
                    swVar.setVisibility(0);
                    wxVar.setVisibility(0);
                    ywVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (dxVar != null) {
                        dxVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    pxVar.setVisibility(8);
                    swVar.setVisibility(8);
                    wxVar.setVisibility(8);
                    ywVar.setVisibility(0);
                    if (dxVar != null) {
                        dxVar.setVisibility(0);
                    }
                }
            }
        }
        rzVar.getMeasuredWidth();
        rzVar.getPaddingLeft();
        rzVar.getPaddingRight();
        sy syVar = rzVar.t1;
        if (syVar != null) {
            if (i10 == 1) {
                syVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                syVar.s(3);
            } else {
                syVar.s(0);
            }
        }
        rzVar.O(true);
        int currentItem = rzVar.h.getCurrentItem();
        ez ezVar4 = currentItem == 0 ? ezVar3 : currentItem == 1 ? ezVar2 : ezVar;
        String obj = ezVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            ez ezVar5 = i12 == 0 ? ezVar3 : i12 == 1 ? ezVar2 : ezVar;
            if (ezVar5 != null) {
                oq oqVar = ezVar5.d;
                if (ezVar5 != ezVar4 && oqVar != null && !oqVar.getText().toString().equals(obj)) {
                    oqVar.setText(obj);
                    oqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        rz.a(rzVar, z10);
        rzVar.a0();
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
