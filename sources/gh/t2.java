package gh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class t2 implements ud.b, Utilities.Callback2Return {
    public final /* synthetic */ wq0 a;

    public /* synthetic */ t2(wq0 wq0Var) {
        this.a = wq0Var;
    }

    @Override // ud.b
    public void o(int i10, float f10, float f11, ud.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        wq0 wq0Var = this.a;
        wq0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        wq0Var.h(null, new n2(wq0Var, 0));
        return Boolean.TRUE;
    }

    @Override // ud.b
    public /* synthetic */ void A(float f10, int i10) {
    }
}
