package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bx implements z4.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ kz b;

    public bx(kz kzVar, boolean z10) {
        this.b = kzVar;
        this.a = z10;
    }

    @Override // z4.e
    public final void a(int i10) {
        kz kzVar = this.b;
        yw ywVar = kzVar.h;
        boolean z10 = false;
        if (ywVar != null) {
            int currentItem = ywVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (kzVar.A1 != i11) {
                kzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        kzVar.L(i10 == 0, true);
        if (i10 == 2 && (this.a || kzVar.v0)) {
            z10 = true;
        }
        kzVar.Q(z10, true);
        if (kzVar.t1.z()) {
            if (i10 == 0) {
                jw jwVar = kzVar.V;
                if (jwVar != null) {
                    jwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                pw pwVar = kzVar.o0;
                if (pwVar != null) {
                    pwVar.d.requestFocus();
                    return;
                }
                return;
            }
            vw vwVar = kzVar.G0;
            if (vwVar != null) {
                vwVar.d.requestFocus();
            }
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        float f10;
        kz kzVar = this.b;
        xy xyVar = kzVar.G0;
        xy xyVar2 = kzVar.o0;
        xy xyVar3 = kzVar.V;
        xw xwVar = kzVar.C0;
        sw swVar = kzVar.D0;
        qx qxVar = kzVar.p0;
        mw mwVar = kzVar.h0;
        vx vxVar = kzVar.P;
        boolean z10 = true;
        if (kzVar.x0 == null || kzVar.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                vxVar.setVisibility(0);
                f10 = 0.0f;
                mwVar.setVisibility(f7 == 0.0f ? 8 : 0);
                qxVar.setVisibility(f7 == 0.0f ? 8 : 0);
                swVar.setVisibility(8);
                if (xwVar != null) {
                    xwVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    vxVar.setVisibility(8);
                    mwVar.setVisibility(0);
                    qxVar.setVisibility(0);
                    swVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (xwVar != null) {
                        xwVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    vxVar.setVisibility(8);
                    mwVar.setVisibility(8);
                    qxVar.setVisibility(8);
                    swVar.setVisibility(0);
                    if (xwVar != null) {
                        xwVar.setVisibility(0);
                    }
                }
            }
        }
        kzVar.getMeasuredWidth();
        kzVar.getPaddingLeft();
        kzVar.getPaddingRight();
        ky kyVar = kzVar.t1;
        if (kyVar != null) {
            if (i10 == 1) {
                kyVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                kyVar.s(3);
            } else {
                kyVar.s(0);
            }
        }
        kzVar.M(true);
        int currentItem = kzVar.h.getCurrentItem();
        xy xyVar4 = currentItem == 0 ? xyVar3 : currentItem == 1 ? xyVar2 : xyVar;
        String obj = xyVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            xy xyVar5 = i12 == 0 ? xyVar3 : i12 == 1 ? xyVar2 : xyVar;
            if (xyVar5 != null) {
                iq iqVar = xyVar5.d;
                if (xyVar5 != xyVar4 && iqVar != null && !iqVar.getText().toString().equals(obj)) {
                    iqVar.setText(obj);
                    iqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        kz.a(kzVar, z10);
        kzVar.Y();
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
