package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        kj0 kj0Var;
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
                    si siVar = klVar.b;
                    int i10 = siVar.t0;
                    if (((siVar.Z3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var = (kj0) b1Var.K(0)) != null) {
                        View view = kj0Var.a;
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
