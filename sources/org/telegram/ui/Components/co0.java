package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class co0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.uy b;
    public final /* synthetic */ org.telegram.ui.ey c;

    public /* synthetic */ co0(org.telegram.ui.ey eyVar, org.telegram.ui.uy uyVar, int i10) {
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
        yl0 yl0Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ey eyVar = this.c;
                eyVar.p0.V();
                eyVar.T(i10, i11);
                break;
            case 1:
                org.telegram.ui.ey eyVar2 = this.c;
                eyVar2.w0.W();
                eyVar2.T(i10, i11);
                break;
            case 2:
                org.telegram.ui.ey eyVar3 = this.c;
                go0 go0Var = eyVar3.c0;
                s4.c0 c0Var = eyVar3.d0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((go0Var.U.a() != 0 && !go0Var.X) || !go0Var.W) && (N0 == h - 1 || ((gyVar = go0Var.U) != null && gyVar.a() != 0 && (i12 = go0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    go0Var.Q();
                }
                eyVar3.T(i10, i11);
                break;
            default:
                org.telegram.ui.ey eyVar4 = this.c;
                io0 io0Var = eyVar4.k0;
                if (io0Var.Y && !io0Var.W && !TextUtils.isEmpty(io0Var.b0) && (yl0Var = io0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < yl0Var.getChildCount()) {
                            if (!(yl0Var.getChildAt(i13) instanceof t00)) {
                                i13++;
                            } else if (io0Var.Y && !io0Var.W && !TextUtils.isEmpty(io0Var.b0)) {
                                io0Var.V(true);
                            }
                        }
                    }
                }
                eyVar4.T(i10, i11);
                break;
        }
    }
}
