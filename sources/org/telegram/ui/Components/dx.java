package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class dx implements z4.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ lz b;

    public dx(lz lzVar, boolean z10) {
        this.b = lzVar;
        this.a = z10;
    }

    @Override // z4.e
    public final void a(int i10) {
        lz lzVar = this.b;
        ax axVar = lzVar.h;
        boolean z10 = false;
        if (axVar != null) {
            int currentItem = axVar.getCurrentItem();
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
            xw xwVar = lzVar.G0;
            if (xwVar != null) {
                xwVar.d.requestFocus();
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
        zw zwVar = lzVar.C0;
        tw twVar = lzVar.D0;
        sx sxVar = lzVar.p0;
        nw nwVar = lzVar.h0;
        xx xxVar = lzVar.P;
        boolean z10 = true;
        if (lzVar.x0 == null || lzVar.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                xxVar.setVisibility(0);
                f10 = 0.0f;
                nwVar.setVisibility(f7 == 0.0f ? 8 : 0);
                sxVar.setVisibility(f7 == 0.0f ? 8 : 0);
                twVar.setVisibility(8);
                if (zwVar != null) {
                    zwVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    xxVar.setVisibility(8);
                    nwVar.setVisibility(0);
                    sxVar.setVisibility(0);
                    twVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (zwVar != null) {
                        zwVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    xxVar.setVisibility(8);
                    nwVar.setVisibility(8);
                    sxVar.setVisibility(8);
                    twVar.setVisibility(0);
                    if (zwVar != null) {
                        zwVar.setVisibility(0);
                    }
                }
            }
        }
        lzVar.getMeasuredWidth();
        lzVar.getPaddingLeft();
        lzVar.getPaddingRight();
        my myVar = lzVar.t1;
        if (myVar != null) {
            if (i10 == 1) {
                myVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                myVar.s(3);
            } else {
                myVar.s(0);
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
