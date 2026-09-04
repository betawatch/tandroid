package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class nn0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.uy b;
    public final /* synthetic */ org.telegram.ui.ey c;

    public /* synthetic */ nn0(org.telegram.ui.ey eyVar, org.telegram.ui.uy uyVar, int i10) {
        this.a = i10;
        this.c = eyVar;
        this.b = uyVar;
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
        org.telegram.ui.gy gyVar;
        int i12;
        ll0 ll0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ey eyVar = this.c;
                eyVar.o0.V();
                eyVar.S(i10, i11);
                break;
            case 1:
                org.telegram.ui.ey eyVar2 = this.c;
                eyVar2.v0.W();
                eyVar2.S(i10, i11);
                break;
            case 2:
                org.telegram.ui.ey eyVar3 = this.c;
                rn0 rn0Var = eyVar3.b0;
                s4.c0 c0Var = eyVar3.c0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((rn0Var.U.a() != 0 && !rn0Var.X) || !rn0Var.W) && (N0 == h - 1 || ((gyVar = rn0Var.U) != null && gyVar.a() != 0 && (i12 = rn0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    rn0Var.Q();
                }
                eyVar3.S(i10, i11);
                break;
            default:
                org.telegram.ui.ey eyVar4 = this.c;
                tn0 tn0Var = eyVar4.j0;
                if (tn0Var.Y && !tn0Var.W && !TextUtils.isEmpty(tn0Var.b0) && (ll0Var = tn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < ll0Var.getChildCount()) {
                            if (!(ll0Var.getChildAt(i13) instanceof t00)) {
                                i13++;
                            } else if (tn0Var.Y && !tn0Var.W && !TextUtils.isEmpty(tn0Var.b0)) {
                                tn0Var.V(true);
                            }
                        }
                    }
                }
                eyVar4.S(i10, i11);
                break;
        }
    }
}
