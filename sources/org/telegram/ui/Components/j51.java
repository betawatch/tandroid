package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        org.telegram.ui.Wallet.t8 t8Var;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i10 == 1 && (t8Var = ((org.telegram.ui.Wallet.i4) this.c).b.j0) != null) {
                    t8Var.a();
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
                org.telegram.ui.Wallet.m5 m5Var = ((org.telegram.ui.Wallet.i4) this.c).b;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.n3(m5Var, 14));
                    break;
                } else {
                    m5Var.x0();
                    break;
                }
        }
    }

    public j51(org.telegram.ui.Wallet.i4 i4Var, int i10) {
        this.c = i4Var;
        this.b = i10;
    }
}
