package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f41 extends s4.s0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ Object c;

    public f41(mg.s sVar, int i10) {
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
                i41 i41Var = (i41) this.c;
                x41 x41Var = i41Var.k1;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > org.telegram.messenger.i0.L(96.0f)) {
                    View findFocus = x41Var.findFocus();
                    if (findFocus == null) {
                        findFocus = x41Var;
                    }
                    org.telegram.messenger.i0.v1(findFocus);
                }
                if (i11 != 0 && x41Var.c()) {
                    i41Var.l1 = x41Var.getContentTopOffset();
                    i41Var.b.invalidate();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) ((mg.s) this.c).c;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.f4(b6Var, 14));
                    break;
                } else {
                    b6Var.E0();
                    break;
                }
        }
    }

    public f41(i41 i41Var) {
        this.c = i41Var;
    }
}
