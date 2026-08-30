package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sn0 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.oy b;
    public final /* synthetic */ org.telegram.ui.xx c;

    public /* synthetic */ sn0(org.telegram.ui.xx xxVar, org.telegram.ui.oy oyVar, int i10) {
        this.a = i10;
        this.c = xxVar;
        this.b = oyVar;
    }

    @Override // f2.z0
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

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.zx zxVar;
        int i12;
        sl0 sl0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.xx xxVar = this.c;
                xxVar.l0.V();
                xxVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.xx xxVar2 = this.c;
                xxVar2.s0.W();
                xxVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.xx xxVar3 = this.c;
                wn0 wn0Var = xxVar3.V;
                f2.i0 i0Var = xxVar3.W;
                int L0 = i0Var.L0();
                int N0 = i0Var.N0();
                int abs = Math.abs(i0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((wn0Var.R.a() != 0 && !wn0Var.U) || !wn0Var.T) && (N0 == h - 1 || ((zxVar = wn0Var.R) != null && zxVar.a() != 0 && (i12 = wn0Var.V) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    wn0Var.Q();
                }
                xxVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.xx xxVar4 = this.c;
                yn0 yn0Var = xxVar4.g0;
                if (yn0Var.V && !yn0Var.T && !TextUtils.isEmpty(yn0Var.Y) && (sl0Var = yn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < sl0Var.getChildCount()) {
                            if (!(sl0Var.getChildAt(i13) instanceof t00)) {
                                i13++;
                            } else if (yn0Var.V && !yn0Var.T && !TextUtils.isEmpty(yn0Var.Y)) {
                                yn0Var.V(true);
                            }
                        }
                    }
                }
                xxVar4.S(i10, i11);
                break;
        }
    }
}
