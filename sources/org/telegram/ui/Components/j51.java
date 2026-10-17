package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class j51 extends s4.r0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ Object c;

    public j51(n51 n51Var) {
        this.c = n51Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.q8 q8Var;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i10 == 1 && (q8Var = ((org.telegram.ui.Wallet.h4) this.c).b.j0) != null) {
                    q8Var.a();
                    break;
                }
                break;
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                n51 n51Var = (n51) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = n51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = n51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    n51.n(n51Var);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.l5 l5Var = ((org.telegram.ui.Wallet.h4) this.c).b;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.m3(l5Var, 14));
                    break;
                } else {
                    l5Var.x0();
                    break;
                }
        }
    }

    public j51(org.telegram.ui.Wallet.h4 h4Var, int i10) {
        this.c = h4Var;
        this.b = i10;
    }
}
