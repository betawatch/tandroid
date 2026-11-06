package di;

import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class c9 implements ab {
    public final float[] a = new float[2];
    public final /* synthetic */ d9 b;

    public c9(d9 d9Var) {
        this.b = d9Var;
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
        p9 p9Var = this.b.r0;
        i4 z9 = p9Var.z();
        if (z9 == null) {
            return 0;
        }
        j3 j3Var = z9.L0;
        d9 d9Var = p9Var.s;
        float[] fArr = this.a;
        org.telegram.messenger.g0.r1(j3Var, d9Var, fArr);
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
