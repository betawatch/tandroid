package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class cx implements z4.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ kz b;

    public cx(kz kzVar, boolean z10) {
        this.b = kzVar;
        this.a = z10;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        float f10;
        kz kzVar = this.b;
        xy xyVar = kzVar.G0;
        xy xyVar2 = kzVar.o0;
        xy xyVar3 = kzVar.V;
        yw ywVar = kzVar.C0;
        tw twVar = kzVar.D0;
        rx rxVar = kzVar.p0;
        nw nwVar = kzVar.h0;
        kx kxVar = kzVar.P;
        boolean z10 = true;
        if (kzVar.x0 == null || kzVar.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                kxVar.setVisibility(0);
                f10 = 0.0f;
                nwVar.setVisibility(f7 == 0.0f ? 8 : 0);
                rxVar.setVisibility(f7 == 0.0f ? 8 : 0);
                twVar.setVisibility(8);
                if (ywVar != null) {
                    ywVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    kxVar.setVisibility(8);
                    nwVar.setVisibility(0);
                    rxVar.setVisibility(0);
                    twVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (ywVar != null) {
                        ywVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    kxVar.setVisibility(8);
                    nwVar.setVisibility(8);
                    rxVar.setVisibility(8);
                    twVar.setVisibility(0);
                    if (ywVar != null) {
                        ywVar.setVisibility(0);
                    }
                }
            }
        }
        kzVar.getMeasuredWidth();
        kzVar.getPaddingLeft();
        kzVar.getPaddingRight();
        ly lyVar = kzVar.t1;
        if (lyVar != null) {
            if (i10 == 1) {
                lyVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                lyVar.s(3);
            } else {
                lyVar.s(0);
            }
        }
        kzVar.O(true);
        int currentItem = kzVar.h.getCurrentItem();
        xy xyVar4 = currentItem == 0 ? xyVar3 : currentItem == 1 ? xyVar2 : xyVar;
        String obj = xyVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            xy xyVar5 = i12 == 0 ? xyVar3 : i12 == 1 ? xyVar2 : xyVar;
            if (xyVar5 != null) {
                hq hqVar = xyVar5.d;
                if (xyVar5 != xyVar4 && hqVar != null && !hqVar.getText().toString().equals(obj)) {
                    hqVar.setText(obj);
                    hqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        kz.c(kzVar, z10);
        kzVar.a0();
    }

    @Override // z4.e
    public final void b(int i10) {
        kz kzVar = this.b;
        zw zwVar = kzVar.h;
        boolean z10 = false;
        if (zwVar != null) {
            int currentItem = zwVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (kzVar.A1 != i11) {
                kzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        kzVar.N(i10 == 0, true);
        if (i10 == 2 && (this.a || kzVar.v0)) {
            z10 = true;
        }
        kzVar.S(z10, true);
        if (kzVar.t1.z()) {
            if (i10 == 0) {
                kw kwVar = kzVar.V;
                if (kwVar != null) {
                    kwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                qw qwVar = kzVar.o0;
                if (qwVar != null) {
                    qwVar.d.requestFocus();
                    return;
                }
                return;
            }
            ww wwVar = kzVar.G0;
            if (wwVar != null) {
                wwVar.d.requestFocus();
            }
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
