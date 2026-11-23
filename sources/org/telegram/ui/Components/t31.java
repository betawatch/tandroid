package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class t31 extends v4.u0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ Object c;

    public t31(di.i4 i4Var, int i7) {
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
                w31 w31Var = (w31) this.c;
                k41 k41Var = w31Var.o1;
                this.b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = k41Var.findFocus();
                    if (findFocus == null) {
                        findFocus = k41Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && k41Var.c()) {
                    w31Var.p1 = k41Var.getContentTopOffset();
                    w31Var.b.invalidate();
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

    public t31(w31 w31Var) {
        this.c = w31Var;
    }
}
