package fi;

import android.content.Context;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.up0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w3 extends r41 {
    public final /* synthetic */ int m3 = 4;
    public final /* synthetic */ Object n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(o41 o41Var, o41 o41Var2, org.telegram.ui.Components.d dVar, n41 n41Var, n41 n41Var2) {
        super(o41Var2, dVar, n41Var, n41Var2);
        this.n3 = o41Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public boolean E0(float f10) {
        switch (this.m3) {
            case 1:
                ci ciVar = ((mi) this.n3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + ciVar.Y3[0]) + (!ciVar.a2 ? org.telegram.messenger.g0.m : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.r41
    public void F1() {
        switch (this.m3) {
            case 1:
                mi miVar = (mi) this.n3;
                miVar.b.M1(miVar, 0);
                break;
        }
    }

    @Override // org.telegram.ui.Components.r41
    public void K1() {
        switch (this.m3) {
            case 0:
                org.telegram.messenger.g0.d0(((n9) this.n3).b, new ai.i(this, 22));
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
                mi miVar = (mi) this.n3;
                miVar.b.M1(miVar, 0);
                break;
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                ((o41) this.n3).c = -1;
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
    public w3(n9 n9Var, Context context, int i7, u3 u3Var, di.r4 r4Var, di.b bVar) {
        super(context, i7, 0, false, u3Var, r4Var, null, bVar, -1, 0);
        this.n3 = n9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(org.telegram.ui.web.j jVar, Context context, int i7, hi.u1 u1Var, org.telegram.ui.web.a aVar, g5 g5Var) {
        super(context, i7, 0, false, u1Var, aVar, null, g5Var);
        this.n3 = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(mi miVar, Context context, int i7, org.telegram.ui.Components.d dVar, gi giVar, gi giVar2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, 0, false, dVar, giVar, giVar2, h6Var);
        this.n3 = miVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Context context, int i7, zh.p0 p0Var, zh.u1 u1Var, zh.u1 u1Var2, org.telegram.ui.ActionBar.h6 h6Var, up0 up0Var) {
        super(context, i7, 0, false, p0Var, u1Var, u1Var2, h6Var, 3, 1);
        this.n3 = up0Var;
    }
}
