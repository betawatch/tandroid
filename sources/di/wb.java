package di;

import android.content.Context;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class wb extends jc {
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ int o0;
    public final /* synthetic */ mc p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(mc mcVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, int i7) {
        super(context, h6Var);
        this.p0 = mcVar;
        this.n0 = z10;
        this.o0 = i7;
    }

    @Override // di.jc
    public final void e(int i7) {
        long j3 = i7;
        mc mcVar = this.p0;
        mcVar.O0(j3);
        hi.e eVar = mcVar.x1;
        if (eVar != null) {
            eVar.i(pb.Z0(false, hd.a0(null, null, 2131744804, hd.E(j3, ',')), mcVar.N1), true, true);
        }
        if (this.n0) {
            fi.r0 r0Var = mcVar.B1;
            r0Var.g = j3;
            mcVar.C1.set(r0Var);
            int i10 = this.o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }

    @Override // di.jc
    public final void setValue(int i7) {
        super.setValue(i7);
        if (this.n0) {
            int i10 = this.o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }
}
