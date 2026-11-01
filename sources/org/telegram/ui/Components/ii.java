package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ii extends v51 {
    public final /* synthetic */ int m3 = 3;
    public final /* synthetic */ Object n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(s51 s51Var, s51 s51Var2, d dVar, r51 r51Var, r51 r51Var2) {
        super(s51Var2, dVar, r51Var, r51Var2);
        this.n3 = s51Var;
    }

    @Override // org.telegram.ui.Components.uk0
    public boolean E0(float f7) {
        switch (this.m3) {
            case 0:
                bi biVar = ((mi) this.n3).b;
                return f7 >= ((float) ((org.telegram.messenger.i0.L(30.0f) + biVar.V3[0]) + (!biVar.X1 ? org.telegram.messenger.i0.m : 0)));
            default:
                return super.E0(f7);
        }
    }

    @Override // org.telegram.ui.Components.v51
    public void F1() {
        switch (this.m3) {
            case 0:
                mi miVar = (mi) this.n3;
                miVar.b.L1(miVar, 0);
                break;
        }
    }

    @Override // org.telegram.ui.Components.v51
    public void K1() {
        switch (this.m3) {
            case 4:
                org.telegram.messenger.i0.d0(((vh.k7) this.n3).b, new ph.h1(this, 25));
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public Integer V0(int i10) {
        switch (this.m3) {
            case 4:
                return 0;
            default:
                return super.V0(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i10) {
        org.telegram.ui.web.h hVar;
        switch (this.m3) {
            case 2:
                if (!canScrollVertically(1) && (hVar = ((org.telegram.ui.web.j) this.n3).D) != null && hVar.h) {
                    hVar.d();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.m3) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                mi miVar = (mi) this.n3;
                miVar.b.L1(miVar, 0);
                break;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ((s51) this.n3).c = -1;
                break;
            case 2:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                ((wq0) this.n3).p();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(vh.k7 k7Var, Context context, int i10, vh.t2 t2Var, rh.d0 d0Var, th.b bVar) {
        super(context, i10, 0, false, t2Var, d0Var, null, bVar, -1, 0);
        this.n3 = k7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(org.telegram.ui.web.j jVar, Context context, int i10, ag.a aVar, org.telegram.ui.web.a aVar2, org.telegram.ui.ActionBar.x4 x4Var) {
        super(context, i10, 0, false, aVar, aVar2, null, x4Var);
        this.n3 = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(mi miVar, Context context, int i10, d dVar, fi fiVar, fi fiVar2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, 0, false, dVar, fiVar, fiVar2, p6Var);
        this.n3 = miVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(Context context, int i10, ag.a aVar, ph.a2 a2Var, ph.a2 a2Var2, org.telegram.ui.ActionBar.p6 p6Var, wq0 wq0Var) {
        super(context, i10, 0, false, aVar, a2Var, a2Var2, p6Var, 3, 1);
        this.n3 = wq0Var;
    }
}
