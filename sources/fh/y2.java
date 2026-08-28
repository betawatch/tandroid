package fh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vq0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y2 implements td.b, Utilities.Callback2Return {
    public final /* synthetic */ vq0 a;

    public /* synthetic */ y2(vq0 vq0Var) {
        this.a = vq0Var;
    }

    @Override // td.b
    public void J0(int i9, float f10, float f11, td.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        vq0 vq0Var = this.a;
        vq0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        vq0Var.h(null, new s2(vq0Var, 0));
        return Boolean.TRUE;
    }

    @Override // td.b
    public /* synthetic */ void B(float f10, int i9) {
    }
}
