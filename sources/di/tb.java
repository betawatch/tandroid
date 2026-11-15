package di;

import android.content.Context;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class tb extends gc {
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ int o0;
    public final /* synthetic */ jc p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(jc jcVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i7) {
        super(context, e6Var);
        this.p0 = jcVar;
        this.n0 = z10;
        this.o0 = i7;
    }

    @Override // di.gc
    public final void e(int i7) {
        long j3 = i7;
        jc jcVar = this.p0;
        jcVar.N0(j3);
        hi.d dVar = jcVar.x1;
        if (dVar != null) {
            dVar.i(mb.Y0(false, hd.a0(null, null, 2131745047, hd.E(j3, ',')), jcVar.N1), true, true);
        }
        if (this.n0) {
            fi.s0 s0Var = jcVar.B1;
            s0Var.g = j3;
            jcVar.C1.set(s0Var);
            int i10 = this.o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }

    @Override // di.gc
    public final void setValue(int i7) {
        super.setValue(i7);
        if (this.n0) {
            int i10 = this.o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }
}
