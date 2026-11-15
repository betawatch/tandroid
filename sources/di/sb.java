package di;

import android.content.Context;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sb extends fc {
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ int o0;
    public final /* synthetic */ ic p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(ic icVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i7) {
        super(context, e6Var);
        this.p0 = icVar;
        this.n0 = z10;
        this.o0 = i7;
    }

    @Override // di.fc
    public final void e(int i7) {
        long j3 = i7;
        ic icVar = this.p0;
        icVar.N0(j3);
        hi.d dVar = icVar.x1;
        if (dVar != null) {
            dVar.i(lb.Y0(false, hd.a0(null, null, 2131745047, hd.E(j3, ',')), icVar.N1), true, true);
        }
        if (this.n0) {
            fi.s0 s0Var = icVar.B1;
            s0Var.g = j3;
            icVar.C1.set(s0Var);
            int i10 = this.o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }

    @Override // di.fc
    public final void setValue(int i7) {
        super.setValue(i7);
        if (this.n0) {
            int i10 = this.o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }
}
