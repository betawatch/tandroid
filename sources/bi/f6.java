package bi;

import android.content.Context;
import hi.l9;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.yi;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class f6 extends h51 {
    public final /* synthetic */ int n3 = 0;
    public final /* synthetic */ Object o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(e51 e51Var, e51 e51Var2, org.telegram.ui.Components.d dVar, d51 d51Var, d51 d51Var2) {
        super(e51Var2, dVar, d51Var, d51Var2);
        this.o3 = e51Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public boolean E0(float f10) {
        switch (this.n3) {
            case 2:
                ui uiVar = ((ej) this.o3).b;
                return f10 >= ((float) ((org.telegram.messenger.g0.L(30.0f) + uiVar.Z3[0]) + (!uiVar.b2 ? org.telegram.messenger.g0.m : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.h51
    public void F1() {
        switch (this.n3) {
            case 2:
                ej ejVar = (ej) this.o3;
                ejVar.b.N1(ejVar, 0);
                break;
        }
    }

    @Override // org.telegram.ui.Components.h51
    public void K1() {
        switch (this.n3) {
            case 1:
                org.telegram.messenger.g0.d0(((l9) this.o3).b, new ai.h0(this, 27));
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
                ((gq0) this.o3).p();
                break;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                ej ejVar = (ej) this.o3;
                ejVar.b.N1(ejVar, 0);
                break;
            case 3:
                super.onLayout(z10, i7, i10, i11, i12);
                ((e51) this.o3).c = -1;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(l9 l9Var, Context context, int i7, hi.r3 r3Var, di.v6 v6Var, fi.b bVar) {
        super(context, i7, 0, false, r3Var, v6Var, null, bVar, -1, 0);
        this.o3 = l9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(org.telegram.ui.web.k kVar, Context context, int i7, org.telegram.ui.web.b bVar, org.telegram.ui.web.a aVar, hi.c5 c5Var) {
        super(context, i7, 0, false, bVar, aVar, null, c5Var);
        this.o3 = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(ej ejVar, Context context, int i7, org.telegram.ui.Components.d dVar, yi yiVar, yi yiVar2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, 0, false, dVar, yiVar, yiVar2, h6Var);
        this.o3 = ejVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(Context context, int i7, b bVar, d6 d6Var, d6 d6Var2, org.telegram.ui.ActionBar.h6 h6Var, gq0 gq0Var) {
        super(context, i7, 0, false, bVar, d6Var, d6Var2, h6Var, 3, 1);
        this.o3 = gq0Var;
    }
}
