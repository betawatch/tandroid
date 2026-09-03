package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sn0 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.py b;
    public final /* synthetic */ org.telegram.ui.yx c;

    public /* synthetic */ sn0(org.telegram.ui.yx yxVar, org.telegram.ui.py pyVar, int i10) {
        this.a = i10;
        this.c = yxVar;
        this.b = pyVar;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ay ayVar;
        int i12;
        sl0 sl0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.yx yxVar = this.c;
                yxVar.l0.V();
                yxVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.yx yxVar2 = this.c;
                yxVar2.s0.W();
                yxVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.yx yxVar3 = this.c;
                wn0 wn0Var = yxVar3.V;
                f2.j0 j0Var = yxVar3.W;
                int L0 = j0Var.L0();
                int N0 = j0Var.N0();
                int abs = Math.abs(j0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((wn0Var.R.a() != 0 && !wn0Var.U) || !wn0Var.T) && (N0 == h - 1 || ((ayVar = wn0Var.R) != null && ayVar.a() != 0 && (i12 = wn0Var.V) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    wn0Var.Q();
                }
                yxVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.yx yxVar4 = this.c;
                yn0 yn0Var = yxVar4.g0;
                if (yn0Var.V && !yn0Var.T && !TextUtils.isEmpty(yn0Var.Y) && (sl0Var = yn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < sl0Var.getChildCount()) {
                            if (!(sl0Var.getChildAt(i13) instanceof u00)) {
                                i13++;
                            } else if (yn0Var.V && !yn0Var.T && !TextUtils.isEmpty(yn0Var.Y)) {
                                yn0Var.V(true);
                            }
                        }
                    }
                }
                yxVar4.S(i10, i11);
                break;
        }
    }
}
