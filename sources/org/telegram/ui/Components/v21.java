package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class v21 extends v4.s0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ Object c;

    public v21(bi.g5 g5Var, int i7) {
        this.c = g5Var;
        this.b = i7;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.t8 t8Var;
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i7 == 1 && (t8Var = ((org.telegram.ui.Wallet.y5) ((bi.g5) this.c).c).i0) != null) {
                    t8Var.a();
                    break;
                }
                break;
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                y21 y21Var = (y21) this.c;
                n31 n31Var = y21Var.k1;
                this.b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = n31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = n31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && n31Var.c()) {
                    y21Var.l1 = n31Var.getContentTopOffset();
                    y21Var.b.invalidate();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) ((bi.g5) this.c).c;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.f4(y5Var, 14));
                    break;
                } else {
                    y5Var.E0();
                    break;
                }
        }
    }

    public v21(y21 y21Var) {
        this.c = y21Var;
    }
}
