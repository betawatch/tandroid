package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class jl extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml b;

    public /* synthetic */ jl(ml mlVar, int i7) {
        this.a = i7;
        this.b = mlVar;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        mj0 mj0Var;
        switch (this.a) {
            case 0:
                ml mlVar = this.b;
                di.b1 b1Var = mlVar.M;
                boolean z10 = i7 != 0;
                mlVar.I = z10;
                if (!z10 && mlVar.G != null) {
                    mlVar.G = null;
                }
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    ui uiVar = mlVar.b;
                    int i10 = uiVar.t0;
                    if (((uiVar.Z3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) b1Var.K(0)) != null) {
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
                    ml mlVar2 = this.b;
                    if (mlVar2.d0 && mlVar2.e0) {
                        org.telegram.messenger.g0.v1(mlVar2.b.getCurrentFocus());
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
                ml mlVar = this.b;
                mlVar.i0();
                if (mlVar.G != null) {
                    mlVar.H += i10;
                }
                mlVar.b.N1(mlVar, i10);
                break;
        }
    }
}
