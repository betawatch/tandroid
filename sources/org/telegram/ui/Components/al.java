package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class al extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl b;

    public /* synthetic */ al(dl dlVar, int i7) {
        this.a = i7;
        this.b = dlVar;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, int i7) {
        cj0 cj0Var;
        switch (this.a) {
            case 0:
                dl dlVar = this.b;
                di.c1 c1Var = dlVar.M;
                boolean z10 = i7 != 0;
                dlVar.I = z10;
                if (!z10 && dlVar.G != null) {
                    dlVar.G = null;
                }
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    ki kiVar = dlVar.b;
                    int i10 = kiVar.t0;
                    if (((kiVar.Z3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var = (cj0) c1Var.K(0)) != null) {
                        View view = cj0Var.a;
                        if (view.getTop() > 0) {
                            c1Var.w0(0, view.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i7 == 1) {
                    dl dlVar2 = this.b;
                    if (dlVar2.d0 && dlVar2.e0) {
                        org.telegram.messenger.g0.v1(dlVar2.b.getCurrentFocus());
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.t0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                dl dlVar = this.b;
                dlVar.i0();
                if (dlVar.G != null) {
                    dlVar.H += i10;
                }
                dlVar.b.M1(dlVar, i10);
                break;
        }
    }
}
