package bi;

import org.telegram.messenger.r10;
import org.telegram.ui.Components.eq0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g5 implements te.b, r10 {
    public final /* synthetic */ eq0 a;

    public /* synthetic */ g5(eq0 eq0Var) {
        this.a = eq0Var;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.r10
    public Object g(Number number, Object obj) {
        eq0 eq0Var = this.a;
        eq0Var.i();
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        eq0Var.h(null, new h5(eq0Var, 1));
        return Boolean.TRUE;
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
