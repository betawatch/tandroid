package bi;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ld extends zd {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ ce o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(ce ceVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, int i7) {
        super(context, h6Var);
        this.o0 = ceVar;
        this.m0 = z9;
        this.n0 = i7;
    }

    @Override // bi.zd
    public final void e(int i7) {
        long j3 = i7;
        ce ceVar = this.o0;
        ceVar.N0(j3);
        fi.d dVar = ceVar.w1;
        if (dVar != null) {
            dVar.i(dd.Y0(false, org.telegram.messenger.id.a0(null, null, 2131745047, org.telegram.messenger.id.E(j3, ',')), ceVar.M1), true, true);
        }
        if (this.m0) {
            di.s0 s0Var = ceVar.A1;
            s0Var.g = j3;
            ceVar.B1.set(s0Var);
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
