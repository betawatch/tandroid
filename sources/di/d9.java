package di;

import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d9 implements ab {
    public final float[] a = new float[2];
    public final /* synthetic */ e9 b;

    public d9(e9 e9Var) {
        this.b = e9Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.ab
    public final int f(int i7) {
        q9 q9Var = this.b.r0;
        j4 z9 = q9Var.z();
        if (z9 == null) {
            return 0;
        }
        j3 j3Var = z9.L0;
        e9 e9Var = q9Var.s;
        float[] fArr = this.a;
        org.telegram.messenger.g0.r1(j3Var, e9Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + j3Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ boolean g(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ int h(int i7) {
        return 0;
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ void b(cc ccVar) {
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ void c(float f10) {
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ void d(cc ccVar) {
    }
}
