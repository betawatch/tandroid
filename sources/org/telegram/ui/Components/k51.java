package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k51 extends s4.r0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ Object c;

    public k51(o51 o51Var) {
        this.c = o51Var;
    }

    @Override // s4.r0
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
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.k4) this.c).b.h0) != null) {
                    n8Var.a();
                    break;
                }
                break;
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                o51 o51Var = (o51) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = o51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = o51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    o51.n(o51Var);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.o5 o5Var = ((org.telegram.ui.Wallet.k4) this.c).b;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.p3(o5Var, 14));
                    break;
                } else {
                    o5Var.z0();
                    break;
                }
        }
    }

    public k51(org.telegram.ui.Wallet.k4 k4Var, int i10) {
        this.c = k4Var;
        this.b = i10;
    }
}
