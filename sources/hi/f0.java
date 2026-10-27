package hi;

import org.telegram.ui.ActionBar.k5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f0 extends k5 {
    public final /* synthetic */ i0 p;

    public f0(i0 i0Var) {
        this.p = i0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
