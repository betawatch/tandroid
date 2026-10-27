package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z51 extends s4.u0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ Object c;

    public z51(c61 c61Var) {
        this.c = c61Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.n8 n8Var;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.h4) this.c).b.i0) != null) {
                    n8Var.a();
                    break;
                }
                break;
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                c61 c61Var = (c61) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = c61Var.d.findFocus();
                    if (findFocus == null) {
                        findFocus = c61Var.d;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    c61.m(c61Var);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.m5 m5Var = ((org.telegram.ui.Wallet.h4) this.c).b;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.o3(m5Var, 14));
                    break;
                } else {
                    m5Var.A0();
                    break;
                }
        }
    }

    public z51(org.telegram.ui.Wallet.h4 h4Var, int i10) {
        this.c = h4Var;
        this.b = i10;
    }
}
