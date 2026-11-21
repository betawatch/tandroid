package bi;

import org.telegram.messenger.r10;
import org.telegram.ui.Components.gq0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements te.b, r10 {
    public final /* synthetic */ gq0 a;

    public /* synthetic */ k5(gq0 gq0Var) {
        this.a = gq0Var;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.r10
    public Object g(Number number, Object obj) {
        gq0 gq0Var = this.a;
        gq0Var.i();
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        gq0Var.h(null, new l5(gq0Var, 1));
        return Boolean.TRUE;
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
