package ai;

import android.content.Context;
import ei.y8;
import gi.o9;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h4 extends l41 {
    public final /* synthetic */ int n3 = 0;
    public final /* synthetic */ Object o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(h41 h41Var, h41 h41Var2, org.telegram.ui.Components.e eVar, g41 g41Var, g41 g41Var2) {
        super(h41Var2, eVar, g41Var, g41Var2);
        this.o3 = h41Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean E0(float f10) {
        switch (this.n3) {
            case 2:
                bi biVar = ((ni) this.o3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + biVar.W3[0]) + (!biVar.Y1 ? org.telegram.messenger.g0.m : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.l41
    public void F1() {
        switch (this.n3) {
            case 2:
                ni niVar = (ni) this.o3;
                niVar.b.M1(niVar, 0);
                break;
        }
    }

    @Override // org.telegram.ui.Components.l41
    public void K1() {
        switch (this.n3) {
            case 1:
                org.telegram.messenger.g0.d0(((o9) this.o3).b, new v2(this, 25));
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public Integer V0(int i3) {
        switch (this.n3) {
            case 1:
                return 0;
            default:
                return super.V0(i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i3) {
        org.telegram.ui.web.j jVar;
        switch (this.n3) {
            case 4:
                if (!canScrollVertically(1) && (jVar = ((org.telegram.ui.web.l) this.o3).E) != null && jVar.h) {
                    jVar.d();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.n3) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                ((vp0) this.o3).p();
                break;
            case 1:
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z10, i3, i10, i11, i12);
                ni niVar = (ni) this.o3;
                niVar.b.M1(niVar, 0);
                break;
            case 3:
                super.onLayout(z10, i3, i10, i11, i12);
                ((h41) this.o3).c = -1;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(o9 o9Var, Context context, int i3, gi.t3 t3Var, y8 y8Var, ei.b bVar) {
        super(context, i3, 0, false, t3Var, y8Var, null, bVar, -1, 0);
        this.o3 = o9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(org.telegram.ui.web.l lVar, Context context, int i3, org.telegram.ui.web.b bVar, org.telegram.ui.web.a aVar, gi.e5 e5Var) {
        super(context, i3, 0, false, bVar, aVar, null, e5Var);
        this.o3 = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(ni niVar, Context context, int i3, org.telegram.ui.Components.e eVar, gi giVar, gi giVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, 0, false, eVar, giVar, giVar2, e6Var);
        this.o3 = niVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Context context, int i3, c cVar, f4 f4Var, f4 f4Var2, org.telegram.ui.ActionBar.e6 e6Var, vp0 vp0Var) {
        super(context, i3, 0, false, cVar, f4Var, f4Var2, e6Var, 3, 1);
        this.o3 = vp0Var;
    }
}
