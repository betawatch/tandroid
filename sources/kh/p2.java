package kh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.or0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements xd.b, Utilities.Callback2Return {
    public final /* synthetic */ or0 a;

    public /* synthetic */ p2(or0 or0Var) {
        this.a = or0Var;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        or0 or0Var = this.a;
        or0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        or0Var.h(null, new k2(or0Var, 0));
        return Boolean.TRUE;
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
