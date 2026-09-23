package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class nn0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ry b;
    public final /* synthetic */ org.telegram.ui.ay c;

    public /* synthetic */ nn0(org.telegram.ui.ay ayVar, org.telegram.ui.ry ryVar, int i10) {
        this.a = i10;
        this.c = ayVar;
        this.b = ryVar;
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
        org.telegram.ui.dy dyVar;
        int i12;
        ml0 ml0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ay ayVar = this.c;
                ayVar.o0.V();
                ayVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.ay ayVar2 = this.c;
                ayVar2.v0.W();
                ayVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.ay ayVar3 = this.c;
                rn0 rn0Var = ayVar3.b0;
                s4.c0 c0Var = ayVar3.c0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((rn0Var.U.a() != 0 && !rn0Var.X) || !rn0Var.W) && (N0 == h - 1 || ((dyVar = rn0Var.U) != null && dyVar.a() != 0 && (i12 = rn0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    rn0Var.Q();
                }
                ayVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.ay ayVar4 = this.c;
                tn0 tn0Var = ayVar4.j0;
                if (tn0Var.Y && !tn0Var.W && !TextUtils.isEmpty(tn0Var.b0) && (ml0Var = tn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < ml0Var.getChildCount()) {
                            if (!(ml0Var.getChildAt(i13) instanceof u00)) {
                                i13++;
                            } else if (tn0Var.Y && !tn0Var.W && !TextUtils.isEmpty(tn0Var.b0)) {
                                tn0Var.V(true);
                            }
                        }
                    }
                }
                ayVar4.S(i10, i11);
                break;
        }
    }
}
