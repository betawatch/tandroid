package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y51 extends s4.u0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ Object c;

    public y51(b61 b61Var) {
        this.c = b61Var;
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
                b61 b61Var = (b61) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = b61Var.d.findFocus();
                    if (findFocus == null) {
                        findFocus = b61Var.d;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    b61.m(b61Var);
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

    public y51(org.telegram.ui.Wallet.h4 h4Var, int i10) {
        this.c = h4Var;
        this.b = i10;
    }
}
