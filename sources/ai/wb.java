package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class wb implements org.telegram.ui.Components.pb {
    public final float[] a = new float[2];
    public final /* synthetic */ xb b;

    public wb(xb xbVar) {
        this.b = xbVar;
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.pb
    public final int f(int i10) {
        jc jcVar = this.b.I0;
        e6 t10 = jcVar.t();
        if (t10 == null) {
            return 0;
        }
        a5 a5Var = t10.c1;
        xb xbVar = jcVar.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(a5Var, xbVar, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + a5Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ void b(org.telegram.ui.Components.rc rcVar) {
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ void d(org.telegram.ui.Components.rc rcVar) {
    }
}
