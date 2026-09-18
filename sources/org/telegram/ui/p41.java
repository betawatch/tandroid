package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p41 implements org.telegram.ui.Components.fo0 {
    public final /* synthetic */ org.telegram.ui.Components.go0 a;
    public final /* synthetic */ s41 b;
    public final /* synthetic */ s41 c;
    public final /* synthetic */ s41 d;
    public final /* synthetic */ q41 e;

    public p41(q41 q41Var, org.telegram.ui.Components.go0 go0Var, s41 s41Var, s41 s41Var2, s41 s41Var3) {
        this.e = q41Var;
        this.a = go0Var;
        this.b = s41Var;
        this.c = s41Var2;
        this.d = s41Var3;
    }

    @Override // org.telegram.ui.Components.fo0
    public final void X(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j3 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        s41 s41Var = this.d;
        s41 s41Var2 = this.b;
        s41 s41Var3 = this.c;
        if (f7 >= 1.0f) {
            s41Var2.e(false, isAttachedToWindow);
            s41Var3.e(false, isAttachedToWindow);
            s41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(s41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            s41Var2.e(true, isAttachedToWindow);
            s41Var3.e(false, isAttachedToWindow);
            s41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(s41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            s41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            s41Var2.e(false, isAttachedToWindow);
            s41Var3.e(true, isAttachedToWindow);
            s41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(s41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j3;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override // org.telegram.ui.Components.fo0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.fo0
    public final /* synthetic */ int m0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.fo0
    public final void B() {
    }
}
