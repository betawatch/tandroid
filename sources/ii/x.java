package ii;

import org.telegram.ui.ActionBar.r4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x extends r4 {
    public final /* synthetic */ a0 p;

    public x(a0 a0Var) {
        this.p = a0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
