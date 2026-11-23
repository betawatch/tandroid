package fi;

import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class s8 implements fb {
    public final float[] a = new float[2];
    public final /* synthetic */ t8 b;

    public s8(t8 t8Var) {
        this.b = t8Var;
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
    public final int f(int i7) {
        f9 f9Var = this.b.s0;
        z3 z10 = f9Var.z();
        if (z10 == null) {
            return 0;
        }
        c3 c3Var = z10.M0;
        t8 t8Var = f9Var.s;
        float[] fArr = this.a;
        org.telegram.messenger.g0.r1(c3Var, t8Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + c3Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean g(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ int h(int i7) {
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
