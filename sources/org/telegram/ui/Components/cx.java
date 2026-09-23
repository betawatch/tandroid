package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class cx implements z4.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ lz b;

    public cx(lz lzVar, boolean z10) {
        this.b = lzVar;
        this.a = z10;
    }

    @Override // z4.e
    public final void a(int i10) {
        lz lzVar = this.b;
        zw zwVar = lzVar.h;
        boolean z10 = false;
        if (zwVar != null) {
            int currentItem = zwVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (lzVar.A1 != i11) {
                lzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        lzVar.L(i10 == 0, true);
        if (i10 == 2 && (this.a || lzVar.v0)) {
            z10 = true;
        }
        lzVar.Q(z10, true);
        if (lzVar.t1.z()) {
            if (i10 == 0) {
                kw kwVar = lzVar.V;
                if (kwVar != null) {
                    kwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                qw qwVar = lzVar.o0;
                if (qwVar != null) {
                    qwVar.d.requestFocus();
                    return;
                }
                return;
            }
            ww wwVar = lzVar.G0;
            if (wwVar != null) {
                wwVar.d.requestFocus();
            }
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        float f10;
        lz lzVar = this.b;
        yy yyVar = lzVar.G0;
        yy yyVar2 = lzVar.o0;
        yy yyVar3 = lzVar.V;
        yw ywVar = lzVar.C0;
        tw twVar = lzVar.D0;
        rx rxVar = lzVar.p0;
        nw nwVar = lzVar.h0;
        wx wxVar = lzVar.P;
        boolean z10 = true;
        if (lzVar.x0 == null || lzVar.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                wxVar.setVisibility(0);
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
                    wxVar.setVisibility(8);
                    nwVar.setVisibility(0);
                    rxVar.setVisibility(0);
                    twVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (ywVar != null) {
                        ywVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    wxVar.setVisibility(8);
                    nwVar.setVisibility(8);
                    rxVar.setVisibility(8);
                    twVar.setVisibility(0);
                    if (ywVar != null) {
                        ywVar.setVisibility(0);
                    }
                }
            }
        }
        lzVar.getMeasuredWidth();
        lzVar.getPaddingLeft();
        lzVar.getPaddingRight();
        ly lyVar = lzVar.t1;
        if (lyVar != null) {
            if (i10 == 1) {
                lyVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                lyVar.s(3);
            } else {
                lyVar.s(0);
            }
        }
        lzVar.M(true);
        int currentItem = lzVar.h.getCurrentItem();
        yy yyVar4 = currentItem == 0 ? yyVar3 : currentItem == 1 ? yyVar2 : yyVar;
        String obj = yyVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            yy yyVar5 = i12 == 0 ? yyVar3 : i12 == 1 ? yyVar2 : yyVar;
            if (yyVar5 != null) {
                jq jqVar = yyVar5.d;
                if (yyVar5 != yyVar4 && jqVar != null && !jqVar.getText().toString().equals(obj)) {
                    jqVar.setText(obj);
                    jqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        lz.a(lzVar, z10);
        lzVar.Y();
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
