// default package

import android.view.TextureView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
