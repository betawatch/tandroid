package mh;

import org.telegram.ui.ActionBar.c5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z extends c5 {
    public final /* synthetic */ c0 p;

    public z(c0 c0Var) {
        this.p = c0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
