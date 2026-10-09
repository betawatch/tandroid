package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class so0 extends s4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ty b;
    public final /* synthetic */ org.telegram.ui.dy c;

    public /* synthetic */ so0(org.telegram.ui.dy dyVar, org.telegram.ui.ty tyVar, int i10) {
        this.a = i10;
        this.c = dyVar;
        this.b = tyVar;
    }

    @Override // s4.t0
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

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.fy fyVar;
        int i12;
        qm0 qm0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.dy dyVar = this.c;
                dyVar.o0.V();
                dyVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.dy dyVar2 = this.c;
                dyVar2.v0.W();
                dyVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.dy dyVar3 = this.c;
                wo0 wo0Var = dyVar3.b0;
                s4.d0 d0Var = dyVar3.c0;
                int L0 = d0Var.L0();
                int N0 = d0Var.N0();
                int abs = Math.abs(d0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((wo0Var.U.a() != 0 && !wo0Var.X) || !wo0Var.W) && (N0 == h - 1 || ((fyVar = wo0Var.U) != null && fyVar.a() != 0 && (i12 = wo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    wo0Var.Q();
                }
                dyVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.dy dyVar4 = this.c;
                yo0 yo0Var = dyVar4.j0;
                if (yo0Var.Y && !yo0Var.W && !TextUtils.isEmpty(yo0Var.b0) && (qm0Var = yo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < qm0Var.getChildCount()) {
                            if (!(qm0Var.getChildAt(i13) instanceof j10)) {
                                i13++;
                            } else if (yo0Var.Y && !yo0Var.W && !TextUtils.isEmpty(yo0Var.b0)) {
                                yo0Var.V(true);
                            }
                        }
                    }
                }
                dyVar4.S(i10, i11);
                break;
        }
    }
}
