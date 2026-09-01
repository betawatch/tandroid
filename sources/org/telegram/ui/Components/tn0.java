package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tn0 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.py b;
    public final /* synthetic */ org.telegram.ui.yx c;

    public /* synthetic */ tn0(org.telegram.ui.yx yxVar, org.telegram.ui.py pyVar, int i10) {
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
        tl0 tl0Var;
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
                xn0 xn0Var = yxVar3.V;
                f2.j0 j0Var = yxVar3.W;
                int L0 = j0Var.L0();
                int N0 = j0Var.N0();
                int abs = Math.abs(j0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((xn0Var.R.a() != 0 && !xn0Var.U) || !xn0Var.T) && (N0 == h - 1 || ((ayVar = xn0Var.R) != null && ayVar.a() != 0 && (i12 = xn0Var.V) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    xn0Var.Q();
                }
                yxVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.yx yxVar4 = this.c;
                zn0 zn0Var = yxVar4.g0;
                if (zn0Var.V && !zn0Var.T && !TextUtils.isEmpty(zn0Var.Y) && (tl0Var = zn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < tl0Var.getChildCount()) {
                            if (!(tl0Var.getChildAt(i13) instanceof u00)) {
                                i13++;
                            } else if (zn0Var.V && !zn0Var.T && !TextUtils.isEmpty(zn0Var.Y)) {
                                zn0Var.V(true);
                            }
                        }
                    }
                }
                yxVar4.S(i10, i11);
                break;
        }
    }
}
