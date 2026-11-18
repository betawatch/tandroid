package bi;

import android.content.Context;
import hi.m9;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d6 extends e51 {
    public final /* synthetic */ int n3 = 0;
    public final /* synthetic */ Object o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(b51 b51Var, b51 b51Var2, org.telegram.ui.Components.d dVar, a51 a51Var, a51 a51Var2) {
        super(b51Var2, dVar, a51Var, a51Var2);
        this.o3 = b51Var;
    }

    @Override // org.telegram.ui.Components.ck0
    public boolean E0(float f10) {
        switch (this.n3) {
            case 2:
                si siVar = ((cj) this.o3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + siVar.Z3[0]) + (!siVar.b2 ? org.telegram.messenger.g0.m : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.e51
    public void F1() {
        switch (this.n3) {
            case 2:
                cj cjVar = (cj) this.o3;
                cjVar.b.N1(cjVar, 0);
                break;
        }
    }

    @Override // org.telegram.ui.Components.e51
    public void K1() {
        switch (this.n3) {
            case 1:
                org.telegram.messenger.g0.d0(((m9) this.o3).b, new ai.g0(this, 27));
                break;
        }
    }

    @Override // org.telegram.ui.Components.ck0
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

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.n3) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                ((eq0) this.o3).p();
                break;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                cj cjVar = (cj) this.o3;
                cjVar.b.N1(cjVar, 0);
                break;
            case 3:
                super.onLayout(z10, i7, i10, i11, i12);
                ((b51) this.o3).c = -1;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(m9 m9Var, Context context, int i7, hi.s3 s3Var, di.c7 c7Var, fi.b bVar) {
        super(context, i7, 0, false, s3Var, c7Var, null, bVar, -1, 0);
        this.o3 = m9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(org.telegram.ui.web.k kVar, Context context, int i7, org.telegram.ui.web.b bVar, org.telegram.ui.web.a aVar, hi.d5 d5Var) {
        super(context, i7, 0, false, bVar, aVar, null, d5Var);
        this.o3 = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(cj cjVar, Context context, int i7, org.telegram.ui.Components.d dVar, wi wiVar, wi wiVar2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, 0, false, dVar, wiVar, wiVar2, i6Var);
        this.o3 = cjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(Context context, int i7, b bVar, b6 b6Var, b6 b6Var2, org.telegram.ui.ActionBar.i6 i6Var, eq0 eq0Var) {
        super(context, i7, 0, false, bVar, b6Var, b6Var2, i6Var, 3, 1);
        this.o3 = eq0Var;
    }
}
