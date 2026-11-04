package ci;

import android.content.Context;
import org.telegram.messenger.bd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dc extends qc {
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ int o0;
    public final /* synthetic */ tc p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(tc tcVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i3) {
        super(context, e6Var);
        this.p0 = tcVar;
        this.n0 = z10;
        this.o0 = i3;
    }

    @Override // ci.qc
    public final void e(int i3) {
        long j10 = i3;
        tc tcVar = this.p0;
        tcVar.N0(j10);
        gi.d dVar = tcVar.u1;
        if (dVar != null) {
            dVar.i(wb.Y0(false, bd.a0(null, null, 2131745057, bd.E(j10, ',')), tcVar.K1), true, true);
        }
        if (this.n0) {
            ei.u0 u0Var = tcVar.y1;
            u0Var.g = j10;
            tcVar.z1.set(u0Var);
            int i10 = this.o0;
            f(ei.u.b(i10, i3, 3), ei.u.b(i10, i3, 4), true);
        }
    }

    @Override // ci.qc
    public final void setValue(int i3) {
        super.setValue(i3);
        if (this.n0) {
            int i10 = this.o0;
            f(ei.u.b(i10, i3, 3), ei.u.b(i10, i3, 4), true);
        }
    }
}
