package hi;

import org.telegram.ui.ActionBar.k5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
