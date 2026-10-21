package gi;

import org.telegram.ui.ActionBar.e5;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
