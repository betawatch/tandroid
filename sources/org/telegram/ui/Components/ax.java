package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ax implements m2.f {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ mz b;

    public ax(mz mzVar, boolean z4) {
        this.b = mzVar;
        this.a = z4;
    }

    @Override // m2.f
    public final void a(int i10) {
        mz mzVar = this.b;
        xw xwVar = mzVar.h;
        boolean z4 = false;
        if (xwVar != null) {
            int currentItem = xwVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (mzVar.x1 != i11) {
                mzVar.x1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        mzVar.N(i10 == 0, true);
        if (i10 == 2 && (this.a || mzVar.s0)) {
            z4 = true;
        }
        mzVar.S(z4, true);
        if (mzVar.q1.z()) {
            if (i10 == 0) {
                iw iwVar = mzVar.S;
                if (iwVar != null) {
                    iwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                ow owVar = mzVar.l0;
                if (owVar != null) {
                    owVar.d.requestFocus();
                    return;
                }
                return;
            }
            uw uwVar = mzVar.D0;
            if (uwVar != null) {
                uwVar.d.requestFocus();
            }
        }
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        float f11;
        mz mzVar = this.b;
        yy yyVar = mzVar.D0;
        yy yyVar2 = mzVar.l0;
        yy yyVar3 = mzVar.S;
        ww wwVar = mzVar.z0;
        rw rwVar = mzVar.A0;
        rx rxVar = mzVar.m0;
        lw lwVar = mzVar.e0;
        kx kxVar = mzVar.M;
        boolean z4 = true;
        if (mzVar.u0 == null || mzVar.d0 == null) {
            f11 = 0.0f;
        } else {
            if (i10 == 0) {
                kxVar.setVisibility(0);
                f11 = 0.0f;
                lwVar.setVisibility(f10 == 0.0f ? 8 : 0);
                rxVar.setVisibility(f10 == 0.0f ? 8 : 0);
                rwVar.setVisibility(8);
                if (wwVar != null) {
                    wwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i10 == 1) {
                    kxVar.setVisibility(8);
                    lwVar.setVisibility(0);
                    rxVar.setVisibility(0);
                    rwVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (wwVar != null) {
                        wwVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    kxVar.setVisibility(8);
                    lwVar.setVisibility(8);
                    rxVar.setVisibility(8);
                    rwVar.setVisibility(0);
                    if (wwVar != null) {
                        wwVar.setVisibility(0);
                    }
                }
            }
        }
        mzVar.getMeasuredWidth();
        mzVar.getPaddingLeft();
        mzVar.getPaddingRight();
        my myVar = mzVar.q1;
        if (myVar != null) {
            if (i10 == 1) {
                myVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                myVar.s(3);
            } else {
                myVar.s(0);
            }
        }
        mzVar.O(true);
        int currentItem = mzVar.h.getCurrentItem();
        yy yyVar4 = currentItem == 0 ? yyVar3 : currentItem == 1 ? yyVar2 : yyVar;
        String obj = yyVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            yy yyVar5 = i12 == 0 ? yyVar3 : i12 == 1 ? yyVar2 : yyVar;
            if (yyVar5 != null) {
                iq iqVar = yyVar5.d;
                if (yyVar5 != yyVar4 && iqVar != null && !iqVar.getText().toString().equals(obj)) {
                    iqVar.setText(obj);
                    iqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f10 <= f11) && i10 != 1) {
            z4 = false;
        }
        mz.a(mzVar, z4);
        mzVar.a0();
    }

    @Override // m2.f
    public final void c(int i10) {
    }
}
