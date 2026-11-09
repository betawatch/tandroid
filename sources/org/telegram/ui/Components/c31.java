package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c31 extends v4.s0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ Object c;

    public c31(bi.g5 g5Var, int i7) {
        this.c = g5Var;
        this.b = i7;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.r8 r8Var;
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i7 == 1 && (r8Var = ((org.telegram.ui.Wallet.w5) ((bi.g5) this.c).c).i0) != null) {
                    r8Var.a();
                    break;
                }
                break;
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                f31 f31Var = (f31) this.c;
                u31 u31Var = f31Var.k1;
                this.b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = u31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = u31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && u31Var.c()) {
                    f31Var.l1 = u31Var.getContentTopOffset();
                    f31Var.b.invalidate();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) ((bi.g5) this.c).c;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.d4(w5Var, 14));
                    break;
                } else {
                    w5Var.E0();
                    break;
                }
        }
    }

    public c31(f31 f31Var) {
        this.c = f31Var;
    }
}
