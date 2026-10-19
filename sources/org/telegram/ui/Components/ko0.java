package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ko0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.cy b;
    public final /* synthetic */ org.telegram.ui.lx c;

    public /* synthetic */ ko0(org.telegram.ui.lx lxVar, org.telegram.ui.cy cyVar, int i10) {
        this.a = i10;
        this.c = lxVar;
        this.b = cyVar;
    }

    @Override // s4.r0
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

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.nx nxVar;
        int i12;
        im0 im0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.lx lxVar = this.c;
                lxVar.o0.V();
                lxVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.lx lxVar2 = this.c;
                lxVar2.v0.W();
                lxVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.lx lxVar3 = this.c;
                oo0 oo0Var = lxVar3.b0;
                s4.b0 b0Var = lxVar3.c0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((oo0Var.U.a() != 0 && !oo0Var.X) || !oo0Var.W) && (N0 == h - 1 || ((nxVar = oo0Var.U) != null && nxVar.a() != 0 && (i12 = oo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    oo0Var.Q();
                }
                lxVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.lx lxVar4 = this.c;
                qo0 qo0Var = lxVar4.j0;
                if (qo0Var.Y && !qo0Var.W && !TextUtils.isEmpty(qo0Var.b0) && (im0Var = qo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < im0Var.getChildCount()) {
                            if (!(im0Var.getChildAt(i13) instanceof b10)) {
                                i13++;
                            } else if (qo0Var.Y && !qo0Var.W && !TextUtils.isEmpty(qo0Var.b0)) {
                                qo0Var.V(true);
                            }
                        }
                    }
                }
                lxVar4.S(i10, i11);
                break;
        }
    }
}
