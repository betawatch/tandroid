package di;

import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.za;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ boolean g(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ int h(int i7) {
        return 0;
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ void b(bc bcVar) {
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ void c(float f10) {
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ void d(bc bcVar) {
    }
}
