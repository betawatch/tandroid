package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class in0 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.fy b;
    public final /* synthetic */ org.telegram.ui.ox c;

    public /* synthetic */ in0(org.telegram.ui.ox oxVar, org.telegram.ui.fy fyVar, int i10) {
        this.a = i10;
        this.c = oxVar;
        this.b = fyVar;
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
        org.telegram.ui.qx qxVar;
        int i12;
        jl0 jl0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ox oxVar = this.c;
                oxVar.k0.V();
                oxVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.ox oxVar2 = this.c;
                oxVar2.r0.W();
                oxVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.ox oxVar3 = this.c;
                mn0 mn0Var = oxVar3.U;
                f2.j0 j0Var = oxVar3.V;
                int L0 = j0Var.L0();
                int N0 = j0Var.N0();
                int abs = Math.abs(j0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((mn0Var.Q.a() != 0 && !mn0Var.T) || !mn0Var.S) && (N0 == h - 1 || ((qxVar = mn0Var.Q) != null && qxVar.a() != 0 && (i12 = mn0Var.U) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    mn0Var.Q();
                }
                oxVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.ox oxVar4 = this.c;
                on0 on0Var = oxVar4.f0;
                if (on0Var.U && !on0Var.S && !TextUtils.isEmpty(on0Var.X) && (jl0Var = on0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < jl0Var.getChildCount()) {
                            if (!(jl0Var.getChildAt(i13) instanceof p00)) {
                                i13++;
                            } else if (on0Var.U && !on0Var.S && !TextUtils.isEmpty(on0Var.X)) {
                                on0Var.V(true);
                            }
                        }
                    }
                }
                oxVar4.S(i10, i11);
                break;
        }
    }
}
