package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b31 extends v4.s0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ Object c;

    public b31(bi.g5 g5Var, int i7) {
        this.c = g5Var;
        this.b = i7;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.u8 u8Var;
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i7 == 1 && (u8Var = ((org.telegram.ui.Wallet.z5) ((bi.g5) this.c).c).i0) != null) {
                    u8Var.a();
                    break;
                }
                break;
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                e31 e31Var = (e31) this.c;
                t31 t31Var = e31Var.n1;
                this.b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = t31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = t31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && t31Var.c()) {
                    e31Var.o1 = t31Var.getContentTopOffset();
                    e31Var.b.invalidate();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) ((bi.g5) this.c).c;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.f4(z5Var, 14));
                    break;
                } else {
                    z5Var.E0();
                    break;
                }
        }
    }

    public b31(e31 e31Var) {
        this.c = e31Var;
    }
}
