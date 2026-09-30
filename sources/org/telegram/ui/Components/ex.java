package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ex implements z4.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ mz b;

    public ex(mz mzVar, boolean z10) {
        this.b = mzVar;
        this.a = z10;
    }

    @Override // z4.e
    public final void a(int i10) {
        mz mzVar = this.b;
        bx bxVar = mzVar.h;
        boolean z10 = false;
        if (bxVar != null) {
            int currentItem = bxVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (mzVar.A1 != i11) {
                mzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        mzVar.L(i10 == 0, true);
        if (i10 == 2 && (this.a || mzVar.v0)) {
            z10 = true;
        }
        mzVar.Q(z10, true);
        if (mzVar.t1.z()) {
            if (i10 == 0) {
                mw mwVar = mzVar.V;
                if (mwVar != null) {
                    mwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                sw swVar = mzVar.o0;
                if (swVar != null) {
                    swVar.d.requestFocus();
                    return;
                }
                return;
            }
            yw ywVar = mzVar.G0;
            if (ywVar != null) {
                ywVar.d.requestFocus();
            }
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        float f10;
        mz mzVar = this.b;
        zy zyVar = mzVar.G0;
        zy zyVar2 = mzVar.o0;
        zy zyVar3 = mzVar.V;
        ax axVar = mzVar.C0;
        vw vwVar = mzVar.D0;
        tx txVar = mzVar.p0;
        pw pwVar = mzVar.h0;
        yx yxVar = mzVar.P;
        boolean z10 = true;
        if (mzVar.x0 == null || mzVar.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                yxVar.setVisibility(0);
                f10 = 0.0f;
                pwVar.setVisibility(f7 == 0.0f ? 8 : 0);
                txVar.setVisibility(f7 == 0.0f ? 8 : 0);
                vwVar.setVisibility(8);
                if (axVar != null) {
                    axVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    yxVar.setVisibility(8);
                    pwVar.setVisibility(0);
                    txVar.setVisibility(0);
                    vwVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (axVar != null) {
                        axVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    yxVar.setVisibility(8);
                    pwVar.setVisibility(8);
                    txVar.setVisibility(8);
                    vwVar.setVisibility(0);
                    if (axVar != null) {
                        axVar.setVisibility(0);
                    }
                }
            }
        }
        mzVar.getMeasuredWidth();
        mzVar.getPaddingLeft();
        mzVar.getPaddingRight();
        ny nyVar = mzVar.t1;
        if (nyVar != null) {
            if (i10 == 1) {
                nyVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                nyVar.s(3);
            } else {
                nyVar.s(0);
            }
        }
        mzVar.M(true);
        int currentItem = mzVar.h.getCurrentItem();
        zy zyVar4 = currentItem == 0 ? zyVar3 : currentItem == 1 ? zyVar2 : zyVar;
        String obj = zyVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            zy zyVar5 = i12 == 0 ? zyVar3 : i12 == 1 ? zyVar2 : zyVar;
            if (zyVar5 != null) {
                kq kqVar = zyVar5.d;
                if (zyVar5 != zyVar4 && kqVar != null && !kqVar.getText().toString().equals(obj)) {
                    kqVar.setText(obj);
                    kqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        mz.a(mzVar, z10);
        mzVar.Y();
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
