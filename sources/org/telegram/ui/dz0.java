package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dz0 extends org.telegram.ui.Components.n6 {
    public boolean s;
    public final org.telegram.ui.Components.c6 w;
    public final /* synthetic */ SaveToGallerySettingsActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.x = saveToGallerySettingsActivity;
        this.w = new org.telegram.ui.Components.c6(this);
        getDrawable().K = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10 = this.s ? 1.0f : 0.0f;
        org.telegram.ui.Components.c6 c6Var = this.w;
        c6Var.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.n6.y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.x;
        setTextColor(i0.a.f(c6Var.c, saveToGallerySettingsActivity.getThemedColor(i7), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.n6.n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        if (this.s != z10) {
            this.s = z10;
            this.w.e(z11, z10 ? 1.0f : 0.0f);
            invalidate();
        }
    }
}
