package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w21 extends u4.t0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ Object c;

    public w21(ci.o4 o4Var, int i3) {
        this.c = o4Var;
        this.b = i3;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        org.telegram.ui.Wallet.s8 s8Var;
        switch (this.a) {
            case 0:
                if (i3 == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i3 == 1 && (s8Var = ((org.telegram.ui.Wallet.w5) ((ci.o4) this.c).c).j0) != null) {
                    s8Var.a();
                    break;
                }
                break;
        }
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.a) {
            case 0:
                z21 z21Var = (z21) this.c;
                n31 n31Var = z21Var.l1;
                this.b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = n31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = n31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && n31Var.c()) {
                    z21Var.m1 = n31Var.getContentTopOffset();
                    z21Var.b.invalidate();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) ((ci.o4) this.c).c;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.d4(w5Var, 14));
                    break;
                } else {
                    w5Var.E0();
                    break;
                }
        }
    }

    public w21(z21 z21Var) {
        this.c = z21Var;
    }
}
