package gi;

import org.telegram.ui.ActionBar.e5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class y extends e5 {
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
