package ih;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements vd.b, Utilities.Callback2Return {
    public final /* synthetic */ gr0 a;

    public /* synthetic */ p2(gr0 gr0Var) {
        this.a = gr0Var;
    }

    @Override // vd.b
    public void N(int i10, float f9, float f10, vd.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        gr0 gr0Var = this.a;
        gr0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        gr0Var.h(null, new k2(gr0Var, 0));
        return Boolean.TRUE;
    }

    @Override // vd.b
    public /* synthetic */ void z(float f9, int i10) {
    }
}
