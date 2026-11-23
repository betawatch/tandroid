package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hl extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl b;

    public /* synthetic */ hl(kl klVar, int i7) {
        this.a = i7;
        this.b = klVar;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        mj0 mj0Var;
        switch (this.a) {
            case 0:
                kl klVar = this.b;
                di.b1 b1Var = klVar.M;
                boolean z10 = i7 != 0;
                klVar.I = z10;
                if (!z10 && klVar.G != null) {
                    klVar.G = null;
                }
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    ti tiVar = klVar.b;
                    int i10 = tiVar.t0;
                    if (((tiVar.Z3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) b1Var.K(0)) != null) {
                        View view = mj0Var.a;
                        if (view.getTop() > 0) {
                            b1Var.w0(0, view.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i7 == 1) {
                    kl klVar2 = this.b;
                    if (klVar2.d0 && klVar2.e0) {
                        org.telegram.messenger.g0.v1(klVar2.b.getCurrentFocus());
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.u0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                kl klVar = this.b;
                klVar.i0();
                if (klVar.G != null) {
                    klVar.H += i10;
                }
                klVar.b.N1(klVar, i10);
                break;
        }
    }
}
