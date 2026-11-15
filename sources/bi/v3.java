package bi;

import android.content.Context;
import di.z6;
import hi.l9;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wp0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class v3 extends u41 {
    public final /* synthetic */ int n3 = 0;
    public final /* synthetic */ Object o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(r41 r41Var, r41 r41Var2, org.telegram.ui.Components.d dVar, q41 q41Var, q41 q41Var2) {
        super(r41Var2, dVar, q41Var, q41Var2);
        this.o3 = r41Var;
    }

    @Override // org.telegram.ui.Components.uj0
    public boolean E0(float f10) {
        switch (this.n3) {
            case 2:
                ki kiVar = ((vi) this.o3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + kiVar.Z3[0]) + (!kiVar.b2 ? org.telegram.messenger.g0.m : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.u41
    public void F1() {
        switch (this.n3) {
            case 2:
                vi viVar = (vi) this.o3;
                viVar.b.M1(viVar, 0);
                break;
        }
    }

    @Override // org.telegram.ui.Components.u41
    public void K1() {
        switch (this.n3) {
            case 1:
                org.telegram.messenger.g0.d0(((l9) this.o3).b, new ai.f0(this, 26));
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0
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

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.n3) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                ((wp0) this.o3).p();
                break;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                vi viVar = (vi) this.o3;
                viVar.b.M1(viVar, 0);
                break;
            case 3:
                super.onLayout(z10, i7, i10, i11, i12);
                ((r41) this.o3).c = -1;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(l9 l9Var, Context context, int i7, hi.s3 s3Var, z6 z6Var, fi.b bVar) {
        super(context, i7, 0, false, s3Var, z6Var, null, bVar, -1, 0);
        this.o3 = l9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(org.telegram.ui.web.k kVar, Context context, int i7, org.telegram.ui.web.b bVar, org.telegram.ui.web.a aVar, hi.e5 e5Var) {
        super(context, i7, 0, false, bVar, aVar, null, e5Var);
        this.o3 = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(vi viVar, Context context, int i7, org.telegram.ui.Components.d dVar, oi oiVar, oi oiVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, 0, false, dVar, oiVar, oiVar2, e6Var);
        this.o3 = viVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(Context context, int i7, b bVar, t3 t3Var, t3 t3Var2, org.telegram.ui.ActionBar.e6 e6Var, wp0 wp0Var) {
        super(context, i7, 0, false, bVar, t3Var, t3Var2, e6Var, 3, 1);
        this.o3 = wp0Var;
    }
}
