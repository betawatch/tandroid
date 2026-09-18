package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class n41 implements org.telegram.ui.Components.so0 {
    public final /* synthetic */ org.telegram.ui.Components.to0 a;
    public final /* synthetic */ q41 b;
    public final /* synthetic */ q41 c;
    public final /* synthetic */ q41 d;
    public final /* synthetic */ o41 e;

    public n41(o41 o41Var, org.telegram.ui.Components.to0 to0Var, q41 q41Var, q41 q41Var2, q41 q41Var3) {
        this.e = o41Var;
        this.a = to0Var;
        this.b = q41Var;
        this.c = q41Var2;
        this.d = q41Var3;
    }

    @Override // org.telegram.ui.Components.so0
    public final void X(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j3 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        q41 q41Var = this.d;
        q41 q41Var2 = this.b;
        q41 q41Var3 = this.c;
        if (f7 >= 1.0f) {
            q41Var2.e(false, isAttachedToWindow);
            q41Var3.e(false, isAttachedToWindow);
            q41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(q41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            q41Var2.e(true, isAttachedToWindow);
            q41Var3.e(false, isAttachedToWindow);
            q41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(q41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            q41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            q41Var2.e(false, isAttachedToWindow);
            q41Var3.e(true, isAttachedToWindow);
            q41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(q41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j3;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override // org.telegram.ui.Components.so0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.so0
    public final /* synthetic */ int m0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.so0
    public final void B() {
    }
}
