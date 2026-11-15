package bi;

import org.telegram.messenger.t10;
import org.telegram.ui.Components.wp0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements te.b, t10 {
    public final /* synthetic */ wp0 a;

    public /* synthetic */ z2(wp0 wp0Var) {
        this.a = wp0Var;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.t10
    public Object d(Number number, Object obj) {
        wp0 wp0Var = this.a;
        wp0Var.i();
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        wp0Var.h(null, new a3(wp0Var, 1));
        return Boolean.TRUE;
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
    }
}
