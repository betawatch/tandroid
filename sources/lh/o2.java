package lh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class o2 implements xd.b, Utilities.Callback2Return {
    public final /* synthetic */ pr0 a;

    public /* synthetic */ o2(pr0 pr0Var) {
        this.a = pr0Var;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        pr0 pr0Var = this.a;
        pr0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        pr0Var.h(null, new j2(pr0Var, 0));
        return Boolean.TRUE;
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
