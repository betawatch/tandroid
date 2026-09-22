package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class o41 implements org.telegram.ui.Components.eo0 {
    public final /* synthetic */ org.telegram.ui.Components.fo0 a;
    public final /* synthetic */ r41 b;
    public final /* synthetic */ r41 c;
    public final /* synthetic */ r41 d;
    public final /* synthetic */ p41 e;

    public o41(p41 p41Var, org.telegram.ui.Components.fo0 fo0Var, r41 r41Var, r41 r41Var2, r41 r41Var3) {
        this.e = p41Var;
        this.a = fo0Var;
        this.b = r41Var;
        this.c = r41Var2;
        this.d = r41Var3;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void X(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j3 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        r41 r41Var = this.d;
        r41 r41Var2 = this.b;
        r41 r41Var3 = this.c;
        if (f7 >= 1.0f) {
            r41Var2.e(false, isAttachedToWindow);
            r41Var3.e(false, isAttachedToWindow);
            r41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(r41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            r41Var2.e(true, isAttachedToWindow);
            r41Var3.e(false, isAttachedToWindow);
            r41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(r41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            r41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            r41Var2.e(false, isAttachedToWindow);
            r41Var3.e(true, isAttachedToWindow);
            r41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(r41Var3, true, 0.8f, isAttachedToWindow);
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
    public final /* synthetic */ int m0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void B() {
    }
}
