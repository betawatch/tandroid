// default package

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ly5 extends e99 {
    public final /* synthetic */ Bitmap F;
    public final /* synthetic */ sa8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly5(sa8 sa8Var, Context context, hw7 hw7Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, hw7Var, bitmap, null, null);
        this.G = sa8Var;
        this.F = bitmap2;
    }

    @Override // e99
    public final void g(u11 u11Var) {
        int indexOf = u11.a.indexOf(u11Var);
        int i = indexOf + 1;
        if (i <= 1 || this.F != null) {
            indexOf = i;
        }
        sa8 sa8Var = this.G;
        sa8Var.j1.b(indexOf);
        sa8Var.s(u11Var);
    }
}
