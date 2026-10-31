package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uk extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;

    public /* synthetic */ uk(bl blVar, int i10) {
        this.a = i10;
        this.b = blVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        ck0 ck0Var;
        switch (this.a) {
            case 0:
                bl blVar = this.b;
                ag.b1 b1Var = blVar.N;
                boolean z10 = i10 != 0;
                blVar.J = z10;
                if (!z10 && blVar.H != null) {
                    blVar.H = null;
                }
                if (i10 == 0) {
                    int L = org.telegram.messenger.i0.L(13.0f);
                    bi biVar = blVar.b;
                    int i11 = biVar.s0;
                    if (((biVar.V3[0] - i11) - L) + i11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (ck0Var = (ck0) b1Var.K(0)) != null) {
                        View view = ck0Var.a;
                        if (view.getTop() > blVar.x0 - blVar.w0) {
                            b1Var.w0(0, view.getTop() - (blVar.x0 - blVar.w0), null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i10 == 1) {
                    bl blVar2 = this.b;
                    if (blVar2.i0 && blVar2.j0) {
                        org.telegram.messenger.i0.v1(blVar2.b.getCurrentFocus());
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                bl blVar = this.b;
                blVar.h0();
                if (blVar.H != null) {
                    blVar.I += i11;
                }
                blVar.b.L1(blVar, i11);
                break;
        }
    }
}
