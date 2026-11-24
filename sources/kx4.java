// default package

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kx4 extends tm {
    public final /* synthetic */ lx4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx4(lx4 lx4Var, ViewGroup viewGroup, int i) {
        super(i, viewGroup);
        this.N = lx4Var;
    }

    @Override // tm, dn
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.N;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
