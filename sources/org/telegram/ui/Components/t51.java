package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class t51 extends s4.t0 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public t51(x51 x51Var) {
        this.a = 0;
        this.c = x51Var;
    }

    @Override // s4.t0
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

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                x51 x51Var = (x51) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = x51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = x51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    x51.o(x51Var);
                    break;
                }
                break;
            case 1:
                int i12 = this.b + i11;
                this.b = i12;
                ((org.telegram.ui.d31) this.c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                break;
            default:
                org.telegram.ui.Wallet.a5 a5Var = ((org.telegram.ui.Wallet.w3) this.c).a;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.f3(a5Var, 13));
                    break;
                } else {
                    a5Var.q0();
                    break;
                }
        }
    }

    public t51(org.telegram.ui.d31 d31Var) {
        this.a = 1;
        this.c = d31Var;
        this.b = 0;
    }

    public t51(org.telegram.ui.Wallet.w3 w3Var, int i10) {
        this.a = 2;
        this.c = w3Var;
        this.b = i10;
    }
}
