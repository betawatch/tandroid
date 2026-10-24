package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class q51 extends s4.r0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ Object c;

    public q51(u51 u51Var) {
        this.c = u51Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.o8 o8Var;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i10 == 1 && (o8Var = ((org.telegram.ui.Wallet.i4) this.c).b.h0) != null) {
                    o8Var.a();
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
                    View findFocus = u51Var.d.findFocus();
                    if (findFocus == null) {
                        findFocus = u51Var.d;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    u51.m(u51Var);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.o5 o5Var = ((org.telegram.ui.Wallet.i4) this.c).b;
                if (this.b != 0) {
                    recyclerView.post(new org.telegram.ui.Wallet.o3(o5Var, 14));
                    break;
                } else {
                    o5Var.z0();
                    break;
                }
        }
    }

    public q51(org.telegram.ui.Wallet.i4 i4Var, int i10) {
        this.c = i4Var;
        this.b = i10;
    }
}
