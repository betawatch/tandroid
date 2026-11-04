package ai;

import org.telegram.messenger.o10;
import org.telegram.ui.Components.vp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements qe.b, o10 {
    public final /* synthetic */ vp0 a;

    public /* synthetic */ j3(vp0 vp0Var) {
        this.a = vp0Var;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.o10
    public Object d(Number number, Object obj) {
        vp0 vp0Var = this.a;
        vp0Var.i();
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        vp0Var.h(null, new l3(vp0Var, 1));
        return Boolean.TRUE;
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }
}
