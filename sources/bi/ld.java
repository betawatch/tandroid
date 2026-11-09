package bi;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ld extends zd {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ ce o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(ce ceVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, int i7) {
        super(context, g6Var);
        this.o0 = ceVar;
        this.m0 = z9;
        this.n0 = i7;
    }

    @Override // bi.zd
    public final void e(int i7) {
        long j3 = i7;
        ce ceVar = this.o0;
        ceVar.N0(j3);
        fi.d dVar = ceVar.t1;
        if (dVar != null) {
            dVar.i(dd.Y0(false, org.telegram.messenger.id.a0(null, null, 2131745047, org.telegram.messenger.id.E(j3, ',')), ceVar.J1), true, true);
        }
        if (this.m0) {
            di.s0 s0Var = ceVar.x1;
            s0Var.g = j3;
            ceVar.y1.set(s0Var);
            int i10 = this.n0;
            f(di.t.b(i10, i7, 3), di.t.b(i10, i7, 4), true);
        }
    }

    @Override // bi.zd
    public final void setValue(int i7) {
        super.setValue(i7);
        if (this.m0) {
            int i10 = this.n0;
            f(di.t.b(i10, i7, 3), di.t.b(i10, i7, 4), true);
        }
    }
}
