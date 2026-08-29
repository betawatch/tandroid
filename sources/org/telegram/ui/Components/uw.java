package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uw implements m2.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ fz b;

    public uw(fz fzVar, boolean z10) {
        this.b = fzVar;
        this.a = z10;
    }

    @Override // m2.e
    public final void a(int i10) {
        fz fzVar = this.b;
        rw rwVar = fzVar.h;
        boolean z10 = false;
        if (rwVar != null) {
            int currentItem = rwVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (fzVar.w1 != i11) {
                fzVar.w1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        fzVar.M(i10 == 0, true);
        if (i10 == 2 && (this.a || fzVar.r0)) {
            z10 = true;
        }
        fzVar.S(z10, true);
        if (fzVar.p1.z()) {
            if (i10 == 0) {
                cw cwVar = fzVar.R;
                if (cwVar != null) {
                    cwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                iw iwVar = fzVar.k0;
                if (iwVar != null) {
                    iwVar.d.requestFocus();
                    return;
                }
                return;
            }
            ow owVar = fzVar.C0;
            if (owVar != null) {
                owVar.d.requestFocus();
            }
        }
    }

    @Override // m2.e
    public final void b(float f9, int i10, int i11) {
        float f10;
        fz fzVar = this.b;
        ry ryVar = fzVar.C0;
        ry ryVar2 = fzVar.k0;
        ry ryVar3 = fzVar.R;
        qw qwVar = fzVar.y0;
        lw lwVar = fzVar.z0;
        kx kxVar = fzVar.l0;
        fw fwVar = fzVar.d0;
        dx dxVar = fzVar.L;
        boolean z10 = true;
        if (fzVar.t0 == null || fzVar.c0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                dxVar.setVisibility(0);
                f10 = 0.0f;
                fwVar.setVisibility(f9 == 0.0f ? 8 : 0);
                kxVar.setVisibility(f9 == 0.0f ? 8 : 0);
                lwVar.setVisibility(8);
                if (qwVar != null) {
                    qwVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    dxVar.setVisibility(8);
                    fwVar.setVisibility(0);
                    kxVar.setVisibility(0);
                    lwVar.setVisibility(f9 == 0.0f ? 8 : 0);
                    if (qwVar != null) {
                        qwVar.setVisibility(f9 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    dxVar.setVisibility(8);
                    fwVar.setVisibility(8);
                    kxVar.setVisibility(8);
                    lwVar.setVisibility(0);
                    if (qwVar != null) {
                        qwVar.setVisibility(0);
                    }
                }
            }
        }
        fzVar.getMeasuredWidth();
        fzVar.getPaddingLeft();
        fzVar.getPaddingRight();
        fy fyVar = fzVar.p1;
        if (fyVar != null) {
            if (i10 == 1) {
                fyVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                fyVar.s(3);
            } else {
                fyVar.s(0);
            }
        }
        fzVar.O(true);
        int currentItem = fzVar.h.getCurrentItem();
        ry ryVar4 = currentItem == 0 ? ryVar3 : currentItem == 1 ? ryVar2 : ryVar;
        String obj = ryVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            ry ryVar5 = i12 == 0 ? ryVar3 : i12 == 1 ? ryVar2 : ryVar;
            if (ryVar5 != null) {
                cq cqVar = ryVar5.d;
                if (ryVar5 != ryVar4 && cqVar != null && !cqVar.getText().toString().equals(obj)) {
                    cqVar.setText(obj);
                    cqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f9 <= f10) && i10 != 1) {
            z10 = false;
        }
        fz.a(fzVar, z10);
        fzVar.a0();
    }

    @Override // m2.e
    public final void c(int i10) {
    }
}
