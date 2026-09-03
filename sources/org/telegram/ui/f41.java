package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f41 extends org.telegram.ui.Components.k6 {
    public boolean s;
    public final org.telegram.ui.Components.z5 v;
    public final /* synthetic */ SaveToGallerySettingsActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f41(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.z5(this);
        getDrawable().D = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10 = this.s ? 1.0f : 0.0f;
        org.telegram.ui.Components.z5 z5Var = this.v;
        z5Var.d(f10, false);
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.w;
        setTextColor(i0.a.d(z5Var.c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z4, boolean z10) {
        if (this.s != z4) {
            this.s = z4;
            this.v.d(z4 ? 1.0f : 0.0f, z10);
            invalidate();
        }
    }
}
