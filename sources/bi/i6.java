package bi;

import android.content.Context;
import hi.ga;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i6 extends g51 {
    public final /* synthetic */ int n3 = 0;
    public final /* synthetic */ Object o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(d51 d51Var, d51 d51Var2, org.telegram.ui.Components.d dVar, c51 c51Var, c51 c51Var2) {
        super(d51Var2, dVar, c51Var, c51Var2);
        this.o3 = d51Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public boolean E0(float f10) {
        switch (this.n3) {
            case 2:
                ti tiVar = ((dj) this.o3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + tiVar.Z3[0]) + (!tiVar.b2 ? org.telegram.messenger.g0.m : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.g51
    public void F1() {
        switch (this.n3) {
            case 2:
                dj djVar = (dj) this.o3;
                djVar.b.N1(djVar, 0);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g51
    public void K1() {
        switch (this.n3) {
            case 1:
                org.telegram.messenger.g0.d0(((ga) this.o3).b, new ai.d0(this, 27));
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public Integer V0(int i7) {
        switch (this.n3) {
            case 1:
                return 0;
            default:
                return super.V0(i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i7) {
        org.telegram.ui.web.i iVar;
        switch (this.n3) {
            case 4:
                if (!canScrollVertically(1) && (iVar = ((org.telegram.ui.web.k) this.o3).E) != null && iVar.h) {
                    iVar.d();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.n3) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                ((fq0) this.o3).p();
                break;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                dj djVar = (dj) this.o3;
                djVar.b.N1(djVar, 0);
                break;
            case 3:
                super.onLayout(z10, i7, i10, i11, i12);
                ((d51) this.o3).c = -1;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(ga gaVar, Context context, int i7, hi.b4 b4Var, di.v6 v6Var, fi.b bVar) {
        super(context, i7, 0, false, b4Var, v6Var, null, bVar, -1, 0);
        this.o3 = gaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(org.telegram.ui.web.k kVar, Context context, int i7, org.telegram.ui.web.b bVar, org.telegram.ui.web.a aVar, hi.n5 n5Var) {
        super(context, i7, 0, false, bVar, aVar, null, n5Var);
        this.o3 = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(dj djVar, Context context, int i7, org.telegram.ui.Components.d dVar, xi xiVar, xi xiVar2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, 0, false, dVar, xiVar, xiVar2, i6Var);
        this.o3 = djVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(Context context, int i7, b bVar, g6 g6Var, g6 g6Var2, org.telegram.ui.ActionBar.i6 i6Var, fq0 fq0Var) {
        super(context, i7, 0, false, bVar, g6Var, g6Var2, i6Var, 3, 1);
        this.o3 = fq0Var;
    }
}
