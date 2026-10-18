package gi;

import org.telegram.ui.ActionBar.e5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
