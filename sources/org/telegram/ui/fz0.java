package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fz0 extends org.telegram.ui.Components.i6 {
    public boolean s;
    public final org.telegram.ui.Components.v5 w;
    public final /* synthetic */ SaveToGallerySettingsActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.x = saveToGallerySettingsActivity;
        this.w = new org.telegram.ui.Components.v5(this);
        getDrawable().J = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10 = this.s ? 1.0f : 0.0f;
        org.telegram.ui.Components.v5 v5Var = this.w;
        v5Var.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.m6.y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.x;
        setTextColor(i0.a.f(v5Var.c, saveToGallerySettingsActivity.getThemedColor(i7), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.m6.n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z9, boolean z10) {
        if (this.s != z9) {
            this.s = z9;
            this.w.e(z10, z9 ? 1.0f : 0.0f);
            invalidate();
        }
    }
}
