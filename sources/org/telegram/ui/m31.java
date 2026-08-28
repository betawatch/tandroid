package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m31 extends org.telegram.ui.Components.j6 {
    public boolean s;
    public final org.telegram.ui.Components.y5 v;
    public final /* synthetic */ SaveToGallerySettingsActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m31(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.y5(this);
        getDrawable().D = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10 = this.s ? 1.0f : 0.0f;
        org.telegram.ui.Components.y5 y5Var = this.v;
        y5Var.d(f10, false);
        int i9 = org.telegram.ui.ActionBar.f6.y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.w;
        setTextColor(i0.a.d(y5Var.c, saveToGallerySettingsActivity.getThemedColor(i9), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        if (this.s != z10) {
            this.s = z10;
            this.v.d(z10 ? 1.0f : 0.0f, z11);
            invalidate();
        }
    }
}
