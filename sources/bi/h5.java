package bi;

import org.telegram.messenger.r10;
import org.telegram.ui.Components.eq0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h5 implements te.b, r10 {
    public final /* synthetic */ eq0 a;

    public /* synthetic */ h5(eq0 eq0Var) {
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
        eq0Var.h(null, new i5(eq0Var, 1));
        return Boolean.TRUE;
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
