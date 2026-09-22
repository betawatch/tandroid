package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class wb implements org.telegram.ui.Components.nb {
    public final float[] a = new float[2];
    public final /* synthetic */ xb b;

    public wb(xb xbVar) {
        this.b = xbVar;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final int f(int i10) {
        jc jcVar = this.b.I0;
        f6 t10 = jcVar.t();
        if (t10 == null) {
            return 0;
        }
        a5 a5Var = t10.c1;
        xb xbVar = jcVar.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(a5Var, xbVar, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + a5Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void b(org.telegram.ui.Components.pc pcVar) {
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void d(org.telegram.ui.Components.pc pcVar) {
    }
}
