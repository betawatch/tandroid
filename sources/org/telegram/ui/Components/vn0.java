package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vn0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.wy b;
    public final /* synthetic */ org.telegram.ui.gy c;

    public /* synthetic */ vn0(org.telegram.ui.gy gyVar, org.telegram.ui.wy wyVar, int i10) {
        this.a = i10;
        this.c = gyVar;
        this.b = wyVar;
    }

    @Override // s4.s0
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

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.iy iyVar;
        int i12;
        vl0 vl0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.gy gyVar = this.c;
                gyVar.o0.V();
                gyVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.gy gyVar2 = this.c;
                gyVar2.v0.W();
                gyVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.gy gyVar3 = this.c;
                ao0 ao0Var = gyVar3.b0;
                s4.c0 c0Var = gyVar3.c0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((ao0Var.U.a() != 0 && !ao0Var.X) || !ao0Var.W) && (N0 == h - 1 || ((iyVar = ao0Var.U) != null && iyVar.a() != 0 && (i12 = ao0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    ao0Var.Q();
                }
                gyVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.gy gyVar4 = this.c;
                co0 co0Var = gyVar4.j0;
                if (co0Var.Y && !co0Var.W && !TextUtils.isEmpty(co0Var.b0) && (vl0Var = co0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < vl0Var.getChildCount()) {
                            if (!(vl0Var.getChildAt(i13) instanceof a10)) {
                                i13++;
                            } else if (co0Var.Y && !co0Var.W && !TextUtils.isEmpty(co0Var.b0)) {
                                co0Var.V(true);
                            }
                        }
                    }
                }
                gyVar4.S(i10, i11);
                break;
        }
    }
}
