package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
