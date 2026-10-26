package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ix implements a5.i {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ sz b;

    public ix(sz szVar, boolean z10) {
        this.b = szVar;
        this.a = z10;
    }

    @Override // a5.i
    public final void a(int i10) {
        sz szVar = this.b;
        fx fxVar = szVar.h;
        boolean z10 = false;
        if (fxVar != null) {
            int currentItem = fxVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (szVar.A1 != i11) {
                szVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        szVar.L(i10 == 0, true);
        if (i10 == 2 && (this.a || szVar.v0)) {
            z10 = true;
        }
        szVar.Q(z10, true);
        if (szVar.t1.z()) {
            if (i10 == 0) {
                rw rwVar = szVar.V;
                if (rwVar != null) {
                    rwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                ww wwVar = szVar.o0;
                if (wwVar != null) {
                    wwVar.d.requestFocus();
                    return;
                }
                return;
            }
            cx cxVar = szVar.G0;
            if (cxVar != null) {
                cxVar.d.requestFocus();
            }
        }
    }

    @Override // a5.i
    public final void b(float f7, int i10, int i11) {
        float f10;
        sz szVar = this.b;
        fz fzVar = szVar.G0;
        fz fzVar2 = szVar.o0;
        fz fzVar3 = szVar.V;
        ex exVar = szVar.C0;
        zw zwVar = szVar.D0;
        xx xxVar = szVar.p0;
        uw uwVar = szVar.h0;
        dy dyVar = szVar.P;
        boolean z10 = true;
        if (szVar.x0 == null || szVar.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                dyVar.setVisibility(0);
                f10 = 0.0f;
                uwVar.setVisibility(f7 == 0.0f ? 8 : 0);
                xxVar.setVisibility(f7 == 0.0f ? 8 : 0);
                zwVar.setVisibility(8);
                if (exVar != null) {
                    exVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    dyVar.setVisibility(8);
                    uwVar.setVisibility(0);
                    xxVar.setVisibility(0);
                    zwVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (exVar != null) {
                        exVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    dyVar.setVisibility(8);
                    uwVar.setVisibility(8);
                    xxVar.setVisibility(8);
                    zwVar.setVisibility(0);
                    if (exVar != null) {
                        exVar.setVisibility(0);
                    }
                }
            }
        }
        szVar.getMeasuredWidth();
        szVar.getPaddingLeft();
        szVar.getPaddingRight();
        ty tyVar = szVar.t1;
        if (tyVar != null) {
            if (i10 == 1) {
                tyVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                tyVar.s(3);
            } else {
                tyVar.s(0);
            }
        }
        szVar.M(true);
        int currentItem = szVar.h.getCurrentItem();
        fz fzVar4 = currentItem == 0 ? fzVar3 : currentItem == 1 ? fzVar2 : fzVar;
        String obj = fzVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            fz fzVar5 = i12 == 0 ? fzVar3 : i12 == 1 ? fzVar2 : fzVar;
            if (fzVar5 != null) {
                uq uqVar = fzVar5.d;
                if (fzVar5 != fzVar4 && uqVar != null && !uqVar.getText().toString().equals(obj)) {
                    uqVar.setText(obj);
                    uqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        sz.a(szVar, z10);
        szVar.Y();
    }

    @Override // a5.i
    public final void c(int i10) {
    }
}
