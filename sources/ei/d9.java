package ei;

import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.za;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d9 implements za {
    public final float[] a = new float[2];
    public final /* synthetic */ e9 b;

    public d9(e9 e9Var) {
        this.b = e9Var;
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.za
    public final int f(int i3) {
        r9 r9Var = this.b.s0;
        j4 H = r9Var.H();
        if (H == null) {
            return 0;
        }
        m3 m3Var = H.M0;
        e9 e9Var = r9Var.s;
        float[] fArr = this.a;
        org.telegram.messenger.g0.r1(m3Var, e9Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + m3Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ boolean g(int i3) {
        return false;
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ int h(int i3) {
        return 0;
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ void b(ac acVar) {
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ void c(float f10) {
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ void d(ac acVar) {
    }
}
