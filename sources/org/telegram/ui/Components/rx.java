package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class rx implements z4.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ a00 b;

    public rx(a00 a00Var, boolean z10) {
        this.b = a00Var;
        this.a = z10;
    }

    @Override // z4.e
    public final void a(int i10) {
        a00 a00Var = this.b;
        ox oxVar = a00Var.h;
        boolean z10 = false;
        if (oxVar != null) {
            int currentItem = oxVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (a00Var.A1 != i11) {
                a00Var.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        a00Var.L(i10 == 0, true);
        if (i10 == 2 && (this.a || a00Var.v0)) {
            z10 = true;
        }
        a00Var.Q(z10, true);
        if (a00Var.t1.z()) {
            if (i10 == 0) {
                zw zwVar = a00Var.V;
                if (zwVar != null) {
                    zwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                fx fxVar = a00Var.o0;
                if (fxVar != null) {
                    fxVar.d.requestFocus();
                    return;
                }
                return;
            }
            lx lxVar = a00Var.G0;
            if (lxVar != null) {
                lxVar.d.requestFocus();
            }
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        float f10;
        a00 a00Var = this.b;
        mz mzVar = a00Var.G0;
        mz mzVar2 = a00Var.o0;
        mz mzVar3 = a00Var.V;
        nx nxVar = a00Var.C0;
        ix ixVar = a00Var.D0;
        hy hyVar = a00Var.p0;
        cx cxVar = a00Var.h0;
        my myVar = a00Var.P;
        boolean z10 = true;
        if (a00Var.x0 == null || a00Var.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                myVar.setVisibility(0);
                f10 = 0.0f;
                cxVar.setVisibility(f7 == 0.0f ? 8 : 0);
                hyVar.setVisibility(f7 == 0.0f ? 8 : 0);
                ixVar.setVisibility(8);
                if (nxVar != null) {
                    nxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    myVar.setVisibility(8);
                    cxVar.setVisibility(0);
                    hyVar.setVisibility(0);
                    ixVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (nxVar != null) {
                        nxVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    myVar.setVisibility(8);
                    cxVar.setVisibility(8);
                    hyVar.setVisibility(8);
                    ixVar.setVisibility(0);
                    if (nxVar != null) {
                        nxVar.setVisibility(0);
                    }
                }
            }
        }
        a00Var.getMeasuredWidth();
        a00Var.getPaddingLeft();
        a00Var.getPaddingRight();
        az azVar = a00Var.t1;
        if (azVar != null) {
            if (i10 == 1) {
                azVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                azVar.s(3);
            } else {
                azVar.s(0);
            }
        }
        a00Var.M(true);
        int currentItem = a00Var.h.getCurrentItem();
        mz mzVar4 = currentItem == 0 ? mzVar3 : currentItem == 1 ? mzVar2 : mzVar;
        String obj = mzVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            mz mzVar5 = i12 == 0 ? mzVar3 : i12 == 1 ? mzVar2 : mzVar;
            if (mzVar5 != null) {
                yq yqVar = mzVar5.d;
                if (mzVar5 != mzVar4 && yqVar != null && !yqVar.getText().toString().equals(obj)) {
                    yqVar.setText(obj);
                    yqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        a00.a(a00Var, z10);
        a00Var.Y();
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
