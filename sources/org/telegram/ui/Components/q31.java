package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q31 extends v4.u0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ Object c;

    public q31(di.i4 i4Var, int i7) {
        this.c = i4Var;
        this.b = i7;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.j9 j9Var;
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i7 == 1 && (j9Var = ((org.telegram.ui.Wallet.n6) ((di.i4) this.c).c).j0) != null) {
                    j9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                t31 t31Var = (t31) this.c;
                h41 h41Var = t31Var.o1;
                this.b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = h41Var.findFocus();
                    if (findFocus == null) {
                        findFocus = h41Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && h41Var.c()) {
                    t31Var.p1 = h41Var.getContentTopOffset();
                    t31Var.b.invalidate();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) ((di.i4) this.c).c;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.q4(n6Var, 14));
                    break;
                } else {
                    n6Var.I0();
                    break;
                }
        }
    }

    public q31(t31 t31Var) {
        this.c = t31Var;
    }
}
