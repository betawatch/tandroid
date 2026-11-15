package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g31 extends v4.t0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ Object c;

    public g31(di.f4 f4Var, int i7) {
        this.c = f4Var;
        this.b = i7;
    }

    @Override // v4.t0
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
                if (i7 == 1 && (u8Var = ((org.telegram.ui.Wallet.y5) ((di.f4) this.c).c).j0) != null) {
                    u8Var.a();
                    break;
                }
                break;
        }
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                j31 j31Var = (j31) this.c;
                x31 x31Var = j31Var.o1;
                this.b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = x31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = x31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && x31Var.c()) {
                    j31Var.p1 = x31Var.getContentTopOffset();
                    j31Var.b.invalidate();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) ((di.f4) this.c).c;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.e4(y5Var, 14));
                    break;
                } else {
                    y5Var.E0();
                    break;
                }
        }
    }

    public g31(j31 j31Var) {
        this.c = j31Var;
    }
}
