package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q41 implements org.telegram.ui.Components.eo0 {
    public final /* synthetic */ org.telegram.ui.Components.fo0 a;
    public final /* synthetic */ t41 b;
    public final /* synthetic */ t41 c;
    public final /* synthetic */ t41 d;
    public final /* synthetic */ r41 e;

    public q41(r41 r41Var, org.telegram.ui.Components.fo0 fo0Var, t41 t41Var, t41 t41Var2, t41 t41Var3) {
        this.e = r41Var;
        this.a = fo0Var;
        this.b = t41Var;
        this.c = t41Var2;
        this.d = t41Var3;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void X(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j3 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        t41 t41Var = this.d;
        t41 t41Var2 = this.b;
        t41 t41Var3 = this.c;
        if (f7 >= 1.0f) {
            t41Var2.e(false, isAttachedToWindow);
            t41Var3.e(false, isAttachedToWindow);
            t41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(t41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            t41Var2.e(true, isAttachedToWindow);
            t41Var3.e(false, isAttachedToWindow);
            t41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(t41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            t41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            t41Var2.e(false, isAttachedToWindow);
            t41Var3.e(true, isAttachedToWindow);
            t41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(t41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j3;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.eo0
    public final /* synthetic */ int l0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void B() {
    }
}
