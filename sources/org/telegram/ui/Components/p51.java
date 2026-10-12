package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class p51 extends s4.r0 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public p51(t51 t51Var) {
        this.a = 0;
        this.c = t51Var;
    }

    @Override // s4.r0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    this.b = 0;
                    break;
                }
                break;
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                t51 t51Var = (t51) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = t51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = t51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    t51.n(t51Var);
                    break;
                }
                break;
            case 1:
                int i12 = this.b + i11;
                this.b = i12;
                ((org.telegram.ui.k31) this.c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                break;
            default:
                org.telegram.ui.Wallet.z4 z4Var = ((org.telegram.ui.Wallet.w3) this.c).a;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.f3(z4Var, 13));
                    break;
                } else {
                    z4Var.q0();
                    break;
                }
        }
    }

    public p51(org.telegram.ui.k31 k31Var) {
        this.a = 1;
        this.c = k31Var;
        this.b = 0;
    }

    public p51(org.telegram.ui.Wallet.w3 w3Var, int i10) {
        this.a = 2;
        this.c = w3Var;
        this.b = i10;
    }
}
