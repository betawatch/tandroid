package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s31 extends v4.u0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ Object c;

    public s31(di.i4 i4Var, int i7) {
        this.c = i4Var;
        this.b = i7;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.k9 k9Var;
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i7 == 1 && (k9Var = ((org.telegram.ui.Wallet.o6) ((di.i4) this.c).c).j0) != null) {
                    k9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                v31 v31Var = (v31) this.c;
                j41 j41Var = v31Var.o1;
                this.b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = j41Var.findFocus();
                    if (findFocus == null) {
                        findFocus = j41Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && j41Var.c()) {
                    v31Var.p1 = j41Var.getContentTopOffset();
                    v31Var.b.invalidate();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) ((di.i4) this.c).c;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.r4(o6Var, 14));
                    break;
                } else {
                    o6Var.I0();
                    break;
                }
        }
    }

    public s31(v31 v31Var) {
        this.c = v31Var;
    }
}
