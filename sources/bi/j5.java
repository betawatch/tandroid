package bi;

import org.telegram.messenger.s10;
import org.telegram.ui.Components.gq0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j5 implements te.b, s10 {
    public final /* synthetic */ gq0 a;

    public /* synthetic */ j5(gq0 gq0Var) {
        this.a = gq0Var;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.s10
    public Object g(Number number, Object obj) {
        gq0 gq0Var = this.a;
        gq0Var.i();
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        gq0Var.h(null, new k5(gq0Var, 1));
        return Boolean.TRUE;
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
