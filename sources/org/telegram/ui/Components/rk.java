package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rk extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uk b;

    public /* synthetic */ rk(uk ukVar, int i3) {
        this.a = i3;
        this.b = ukVar;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        bj0 bj0Var;
        switch (this.a) {
            case 0:
                uk ukVar = this.b;
                ci.j1 j1Var = ukVar.M;
                boolean z10 = i3 != 0;
                ukVar.I = z10;
                if (!z10 && ukVar.G != null) {
                    ukVar.G = null;
                }
                if (i3 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    bi biVar = ukVar.b;
                    int i10 = biVar.t0;
                    if (((biVar.W3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var = (bj0) j1Var.K(0)) != null) {
                        View view = bj0Var.a;
                        if (view.getTop() > 0) {
                            j1Var.w0(0, view.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i3 == 1) {
                    uk ukVar2 = this.b;
                    if (ukVar2.d0 && ukVar2.e0) {
                        org.telegram.messenger.g0.v1(ukVar2.b.getCurrentFocus());
                        break;
                    }
                }
                break;
        }
    }

    @Override // u4.t0
    public void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.a) {
            case 0:
                uk ukVar = this.b;
                ukVar.i0();
                if (ukVar.G != null) {
                    ukVar.H += i10;
                }
                ukVar.b.M1(ukVar, i10);
                break;
        }
    }
}
