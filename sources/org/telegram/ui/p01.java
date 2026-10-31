package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p01 extends org.telegram.ui.Components.f6 {
    public boolean s;
    public final org.telegram.ui.Components.t5 w;
    public final /* synthetic */ SaveToGallerySettingsActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.x = saveToGallerySettingsActivity;
        this.w = new org.telegram.ui.Components.t5(this);
        getDrawable().J = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7 = this.s ? 1.0f : 0.0f;
        org.telegram.ui.Components.t5 t5Var = this.w;
        t5Var.e(false, f7);
        int i10 = org.telegram.ui.ActionBar.t6.y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.x;
        setTextColor(i0.b.f(t5Var.c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.t6.n6)));
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
