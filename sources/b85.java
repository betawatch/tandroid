// default package

import android.view.TextureView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b85 implements be8 {
    public final /* synthetic */ j95 a;

    public b85(j95 j95Var) {
        this.a = j95Var;
    }

    @Override // be8
    public final TextureView D() {
        return null;
    }

    @Override // be8
    public final void J(r47 r47Var) {
        this.a.b.invalidate();
    }

    @Override // be8
    public final void k(r47 r47Var) {
        j95 j95Var = this.a;
        j95Var.J1.K0(true);
        j95Var.V3.f.r0(hl.L(13.0f), hl.L(13.0f), 0, 0);
        j95Var.b.invalidate();
    }
}
