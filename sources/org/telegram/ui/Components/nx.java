package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nx implements z4.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ wz b;

    public nx(wz wzVar, boolean z10) {
        this.b = wzVar;
        this.a = z10;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        float f10;
        wz wzVar = this.b;
        iz izVar = wzVar.G0;
        iz izVar2 = wzVar.o0;
        iz izVar3 = wzVar.V;
        jx jxVar = wzVar.C0;
        ex exVar = wzVar.D0;
        dy dyVar = wzVar.p0;
        yw ywVar = wzVar.h0;
        iy iyVar = wzVar.P;
        boolean z10 = true;
        if (wzVar.x0 == null || wzVar.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                iyVar.setVisibility(0);
                f10 = 0.0f;
                ywVar.setVisibility(f7 == 0.0f ? 8 : 0);
                dyVar.setVisibility(f7 == 0.0f ? 8 : 0);
                exVar.setVisibility(8);
                if (jxVar != null) {
                    jxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    iyVar.setVisibility(8);
                    ywVar.setVisibility(0);
                    dyVar.setVisibility(0);
                    exVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (jxVar != null) {
                        jxVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    iyVar.setVisibility(8);
                    ywVar.setVisibility(8);
                    dyVar.setVisibility(8);
                    exVar.setVisibility(0);
                    if (jxVar != null) {
                        jxVar.setVisibility(0);
                    }
                }
            }
        }
        wzVar.getMeasuredWidth();
        wzVar.getPaddingLeft();
        wzVar.getPaddingRight();
        wy wyVar = wzVar.t1;
        if (wyVar != null) {
            if (i10 == 1) {
                wyVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                wyVar.s(3);
            } else {
                wyVar.s(0);
            }
        }
        wzVar.M(true);
        int currentItem = wzVar.h.getCurrentItem();
        iz izVar4 = currentItem == 0 ? izVar3 : currentItem == 1 ? izVar2 : izVar;
        String obj = izVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            iz izVar5 = i12 == 0 ? izVar3 : i12 == 1 ? izVar2 : izVar;
            if (izVar5 != null) {
                vq vqVar = izVar5.d;
                if (izVar5 != izVar4 && vqVar != null && !vqVar.getText().toString().equals(obj)) {
                    vqVar.setText(obj);
                    vqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        wz.c(wzVar, z10);
        wzVar.Y();
    }

    @Override // z4.e
    public final void b(int i10) {
        wz wzVar = this.b;
        kx kxVar = wzVar.h;
        boolean z10 = false;
        if (kxVar != null) {
            int currentItem = kxVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (wzVar.A1 != i11) {
                wzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        wzVar.L(i10 == 0, true);
        if (i10 == 2 && (this.a || wzVar.v0)) {
            z10 = true;
        }
        wzVar.Q(z10, true);
        if (wzVar.t1.z()) {
            if (i10 == 0) {
                vw vwVar = wzVar.V;
                if (vwVar != null) {
                    vwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                bx bxVar = wzVar.o0;
                if (bxVar != null) {
                    bxVar.d.requestFocus();
                    return;
                }
                return;
            }
            hx hxVar = wzVar.G0;
            if (hxVar != null) {
                hxVar.d.requestFocus();
            }
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
