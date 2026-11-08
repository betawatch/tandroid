package fi;

import android.content.Context;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.up0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w3 extends q41 {
    public final /* synthetic */ int m3 = 4;
    public final /* synthetic */ Object n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(n41 n41Var, n41 n41Var2, org.telegram.ui.Components.d dVar, m41 m41Var, m41 m41Var2) {
        super(n41Var2, dVar, m41Var, m41Var2);
        this.n3 = n41Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public boolean E0(float f10) {
        switch (this.m3) {
            case 1:
                di diVar = ((ni) this.n3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + diVar.V3[0]) + (!diVar.X1 ? org.telegram.messenger.g0.m : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.q41
    public void F1() {
        switch (this.m3) {
            case 1:
                ni niVar = (ni) this.n3;
                niVar.b.M1(niVar, 0);
                break;
        }
    }

    @Override // org.telegram.ui.Components.q41
    public void K1() {
        switch (this.m3) {
            case 0:
                org.telegram.messenger.g0.d0(((o9) this.n3).b, new ai.i(this, 22));
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public Integer V0(int i7) {
        switch (this.m3) {
            case 0:
                return 0;
            default:
                return super.V0(i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i7) {
        org.telegram.ui.web.h hVar;
        switch (this.m3) {
            case 3:
                if (!canScrollVertically(1) && (hVar = ((org.telegram.ui.web.j) this.n3).D) != null && hVar.h) {
                    hVar.d();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.m3) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                ni niVar = (ni) this.n3;
                niVar.b.M1(niVar, 0);
                break;
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                ((n41) this.n3).c = -1;
                break;
            case 3:
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
            case 4:
                super.onLayout(z9, i7, i10, i11, i12);
                ((up0) this.n3).p();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(o9 o9Var, Context context, int i7, u3 u3Var, di.q4 q4Var, di.b bVar) {
        super(context, i7, 0, false, u3Var, q4Var, null, bVar, -1, 0);
        this.n3 = o9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(org.telegram.ui.web.j jVar, Context context, int i7, hi.u1 u1Var, org.telegram.ui.web.a aVar, g5 g5Var) {
        super(context, i7, 0, false, u1Var, aVar, null, g5Var);
        this.n3 = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(ni niVar, Context context, int i7, org.telegram.ui.Components.d dVar, hi hiVar, hi hiVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, 0, false, dVar, hiVar, hiVar2, f6Var);
        this.n3 = niVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Context context, int i7, zh.p0 p0Var, zh.u1 u1Var, zh.u1 u1Var2, org.telegram.ui.ActionBar.f6 f6Var, up0 up0Var) {
        super(context, i7, 0, false, p0Var, u1Var, u1Var2, f6Var, 3, 1);
        this.n3 = up0Var;
    }
}
