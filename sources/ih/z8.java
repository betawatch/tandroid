package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z8 implements fb {
    public final float[] a = new float[2];
    public final /* synthetic */ a9 b;

    public z8(a9 a9Var) {
        this.b = a9Var;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final int f(int i9) {
        m9 m9Var = this.b.E0;
        i4 t10 = m9Var.t();
        if (t10 == null) {
            return 0;
        }
        l3 l3Var = t10.Y0;
        a9 a9Var = m9Var.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(l3Var, a9Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + l3Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean g(int i9) {
        return false;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ int h(int i9) {
        return 0;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void b(gc gcVar) {
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void c(float f10) {
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void d(gc gcVar) {
    }
}
