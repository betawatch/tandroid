package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class q51 extends s4.r0 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public q51(u51 u51Var) {
        this.a = 0;
        this.c = u51Var;
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
                u51 u51Var = (u51) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = u51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = u51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    u51.n(u51Var);
                    break;
                }
                break;
            case 1:
                int i12 = this.b + i11;
                this.b = i12;
                ((org.telegram.ui.k31) this.c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                break;
            default:
                org.telegram.ui.Wallet.a5 a5Var = ((org.telegram.ui.Wallet.x3) this.c).a;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.g3(a5Var, 13));
                    break;
                } else {
                    a5Var.q0();
                    break;
                }
        }
    }

    public q51(org.telegram.ui.k31 k31Var) {
        this.a = 1;
        this.c = k31Var;
        this.b = 0;
    }

    public q51(org.telegram.ui.Wallet.x3 x3Var, int i10) {
        this.a = 2;
        this.c = x3Var;
        this.b = i10;
    }
}
