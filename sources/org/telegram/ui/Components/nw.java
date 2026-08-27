package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nw implements m2.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ yy b;

    public nw(yy yyVar, boolean z10) {
        this.b = yyVar;
        this.a = z10;
    }

    @Override // m2.e
    public final void b(int i10) {
        yy yyVar = this.b;
        kw kwVar = yyVar.h;
        boolean z10 = false;
        if (kwVar != null) {
            int currentItem = kwVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (yyVar.w1 != i11) {
                yyVar.w1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        yyVar.N(i10 == 0, true);
        if (i10 == 2 && (this.a || yyVar.r0)) {
            z10 = true;
        }
        yyVar.S(z10, true);
        if (yyVar.p1.z()) {
            if (i10 == 0) {
                vv vvVar = yyVar.R;
                if (vvVar != null) {
                    vvVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                bw bwVar = yyVar.k0;
                if (bwVar != null) {
                    bwVar.d.requestFocus();
                    return;
                }
                return;
            }
            hw hwVar = yyVar.C0;
            if (hwVar != null) {
                hwVar.d.requestFocus();
            }
        }
    }

    @Override // m2.e
    public final void c(float f10, int i10, int i11) {
        float f11;
        yy yyVar = this.b;
        ky kyVar = yyVar.C0;
        ky kyVar2 = yyVar.k0;
        ky kyVar3 = yyVar.R;
        jw jwVar = yyVar.y0;
        ew ewVar = yyVar.z0;
        dx dxVar = yyVar.l0;
        yv yvVar = yyVar.d0;
        ww wwVar = yyVar.L;
        boolean z10 = true;
        if (yyVar.t0 == null || yyVar.c0 == null) {
            f11 = 0.0f;
        } else {
            if (i10 == 0) {
                wwVar.setVisibility(0);
                f11 = 0.0f;
                yvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                dxVar.setVisibility(f10 == 0.0f ? 8 : 0);
                ewVar.setVisibility(8);
                if (jwVar != null) {
                    jwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i10 == 1) {
                    wwVar.setVisibility(8);
                    yvVar.setVisibility(0);
                    dxVar.setVisibility(0);
                    ewVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (jwVar != null) {
                        jwVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    wwVar.setVisibility(8);
                    yvVar.setVisibility(8);
                    dxVar.setVisibility(8);
                    ewVar.setVisibility(0);
                    if (jwVar != null) {
                        jwVar.setVisibility(0);
                    }
                }
            }
        }
        yyVar.getMeasuredWidth();
        yyVar.getPaddingLeft();
        yyVar.getPaddingRight();
        xx xxVar = yyVar.p1;
        if (xxVar != null) {
            if (i10 == 1) {
                xxVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                xxVar.s(3);
            } else {
                xxVar.s(0);
            }
        }
        yyVar.O(true);
        int currentItem = yyVar.h.getCurrentItem();
        ky kyVar4 = currentItem == 0 ? kyVar3 : currentItem == 1 ? kyVar2 : kyVar;
        String obj = kyVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            ky kyVar5 = i12 == 0 ? kyVar3 : i12 == 1 ? kyVar2 : kyVar;
            if (kyVar5 != null) {
                wp wpVar = kyVar5.d;
                if (kyVar5 != kyVar4 && wpVar != null && !wpVar.getText().toString().equals(obj)) {
                    wpVar.setText(obj);
                    wpVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f10 <= f11) && i10 != 1) {
            z10 = false;
        }
        yy.b(yyVar, z10);
        yyVar.a0();
    }

    @Override // m2.e
    public final void d(int i10) {
    }
}
