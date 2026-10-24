package gi;

import org.telegram.ui.ActionBar.i5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class y extends i5 {
    public final /* synthetic */ b0 p;

    public y(b0 b0Var) {
        this.p = b0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
