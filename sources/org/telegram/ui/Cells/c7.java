package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c7 extends org.telegram.ui.Components.z8 {
    public final /* synthetic */ int D;
    public final /* synthetic */ FrameLayout E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(b6Var);
        this.D = i9;
        this.E = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((e7) this.E).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((f7) this.E).a.invalidate();
                break;
        }
    }
}
