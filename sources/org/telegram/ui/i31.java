package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i31 implements org.telegram.ui.Components.kp0 {
    public final /* synthetic */ org.telegram.ui.Components.lp0 a;
    public final /* synthetic */ l31 b;
    public final /* synthetic */ l31 c;
    public final /* synthetic */ l31 d;
    public final /* synthetic */ j31 e;

    public i31(j31 j31Var, org.telegram.ui.Components.lp0 lp0Var, l31 l31Var, l31 l31Var2, l31 l31Var3) {
        this.e = j31Var;
        this.a = lp0Var;
        this.b = l31Var;
        this.c = l31Var2;
        this.d = l31Var3;
    }

    @Override // org.telegram.ui.Components.kp0
    public final void U(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j10 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        l31 l31Var = this.d;
        l31 l31Var2 = this.b;
        l31 l31Var3 = this.c;
        if (f7 >= 1.0f) {
            l31Var2.e(false, isAttachedToWindow);
            l31Var3.e(false, isAttachedToWindow);
            l31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(l31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            l31Var2.e(true, isAttachedToWindow);
            l31Var3.e(false, isAttachedToWindow);
            l31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(l31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            l31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            l31Var2.e(false, isAttachedToWindow);
            l31Var3.e(true, isAttachedToWindow);
            l31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(l31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.Z().limitVideo = j10;
            saveToGallerySettingsActivity.a0();
        }
    }

    @Override // org.telegram.ui.Components.kp0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.kp0
    public final /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.kp0
    public final void y() {
    }
}
