package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.i6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z0 extends i6 {
    public final /* synthetic */ int W;
    public final /* synthetic */ d1 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(d1 d1Var, int i9) {
        super(false, true, true, false);
        this.W = i9;
        this.X = d1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                this.X.invalidate();
                break;
            default:
                this.X.invalidate();
                break;
        }
    }
}
