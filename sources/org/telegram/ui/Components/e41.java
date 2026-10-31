package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e41 extends s4.s0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ Object c;

    public e41(mg.s sVar, int i10) {
        this.c = sVar;
        this.b = i10;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.y8 y8Var;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i10 == 1 && (y8Var = ((org.telegram.ui.Wallet.b6) ((mg.s) this.c).c).i0) != null) {
                    y8Var.a();
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                h41 h41Var = (h41) this.c;
                w41 w41Var = h41Var.k1;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > org.telegram.messenger.i0.L(96.0f)) {
                    View findFocus = w41Var.findFocus();
                    if (findFocus == null) {
                        findFocus = w41Var;
                    }
                    org.telegram.messenger.i0.v1(findFocus);
                }
                if (i11 != 0 && w41Var.c()) {
                    h41Var.l1 = w41Var.getContentTopOffset();
                    h41Var.b.invalidate();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) ((mg.s) this.c).c;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.f4(b6Var, 14));
                    break;
                } else {
                    b6Var.D0();
                    break;
                }
        }
    }

    public e41(h41 h41Var) {
        this.c = h41Var;
    }
}
