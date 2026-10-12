package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class fb implements org.telegram.ui.Components.qb {
    public final float[] a = new float[2];
    public final /* synthetic */ gb b;

    public fb(gb gbVar) {
        this.b = gbVar;
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.qb
    public final int f(int i10) {
        sb sbVar = this.b.I0;
        q5 t10 = sbVar.t();
        if (t10 == null) {
            return 0;
        }
        o4 o4Var = t10.c1;
        gb gbVar = sbVar.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(o4Var, gbVar, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + o4Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ void b(sc scVar) {
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ void d(sc scVar) {
    }
}
