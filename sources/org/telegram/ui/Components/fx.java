package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class fx implements z4.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nz b;

    public fx(nz nzVar, boolean z10) {
        this.b = nzVar;
        this.a = z10;
    }

    @Override // z4.e
    public final void a(int i10) {
        nz nzVar = this.b;
        cx cxVar = nzVar.h;
        boolean z10 = false;
        if (cxVar != null) {
            int currentItem = cxVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (nzVar.A1 != i11) {
                nzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        nzVar.J(i10 == 0, true);
        if (i10 == 2 && (this.a || nzVar.v0)) {
            z10 = true;
        }
        nzVar.O(z10, true);
        if (nzVar.t1.z()) {
            if (i10 == 0) {
                nw nwVar = nzVar.V;
                if (nwVar != null) {
                    nwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                sw swVar = nzVar.o0;
                if (swVar != null) {
                    swVar.d.requestFocus();
                    return;
                }
                return;
            }
            zw zwVar = nzVar.G0;
            if (zwVar != null) {
                zwVar.d.requestFocus();
            }
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        float f10;
        nz nzVar = this.b;
        az azVar = nzVar.G0;
        az azVar2 = nzVar.o0;
        az azVar3 = nzVar.V;
        bx bxVar = nzVar.C0;
        vw vwVar = nzVar.D0;
        ux uxVar = nzVar.p0;
        qw qwVar = nzVar.h0;
        zx zxVar = nzVar.P;
        boolean z10 = true;
        if (nzVar.x0 == null || nzVar.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                zxVar.setVisibility(0);
                f10 = 0.0f;
                qwVar.setVisibility(f7 == 0.0f ? 8 : 0);
                uxVar.setVisibility(f7 == 0.0f ? 8 : 0);
                vwVar.setVisibility(8);
                if (bxVar != null) {
                    bxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    zxVar.setVisibility(8);
                    qwVar.setVisibility(0);
                    uxVar.setVisibility(0);
                    vwVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (bxVar != null) {
                        bxVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    zxVar.setVisibility(8);
                    qwVar.setVisibility(8);
                    uxVar.setVisibility(8);
                    vwVar.setVisibility(0);
                    if (bxVar != null) {
                        bxVar.setVisibility(0);
                    }
                }
            }
        }
        nzVar.getMeasuredWidth();
        nzVar.getPaddingLeft();
        nzVar.getPaddingRight();
        oy oyVar = nzVar.t1;
        if (oyVar != null) {
            if (i10 == 1) {
                oyVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                oyVar.s(3);
            } else {
                oyVar.s(0);
            }
        }
        nzVar.K(true);
        int currentItem = nzVar.h.getCurrentItem();
        az azVar4 = currentItem == 0 ? azVar3 : currentItem == 1 ? azVar2 : azVar;
        String obj = azVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            az azVar5 = i12 == 0 ? azVar3 : i12 == 1 ? azVar2 : azVar;
            if (azVar5 != null) {
                lq lqVar = azVar5.d;
                if (azVar5 != azVar4 && lqVar != null && !lqVar.getText().toString().equals(obj)) {
                    lqVar.setText(obj);
                    lqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        nz.a(nzVar, z10);
        nzVar.X();
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
