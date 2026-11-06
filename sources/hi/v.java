package hi;

import org.telegram.ui.ActionBar.r4;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class v extends r4 {
    public final /* synthetic */ y p;

    public v(y yVar) {
        this.p = yVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
