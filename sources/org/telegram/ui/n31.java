package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n31 extends org.telegram.ui.Components.s6 {
    public boolean s;
    public final org.telegram.ui.Components.h6 v;
    public final /* synthetic */ SaveToGallerySettingsActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n31(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.h6(this);
        getDrawable().J = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7 = this.s ? 1.0f : 0.0f;
        org.telegram.ui.Components.h6 h6Var = this.v;
        h6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.y6.y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.w;
        setTextColor(i0.a.f(h6Var.c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.y6.n6)));
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
