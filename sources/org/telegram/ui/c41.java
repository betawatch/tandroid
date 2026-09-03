package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c41 implements org.telegram.ui.Components.jo0 {
    public final /* synthetic */ org.telegram.ui.Components.ko0 a;
    public final /* synthetic */ f41 b;
    public final /* synthetic */ f41 c;
    public final /* synthetic */ f41 d;
    public final /* synthetic */ d41 e;

    public c41(d41 d41Var, org.telegram.ui.Components.ko0 ko0Var, f41 f41Var, f41 f41Var2, f41 f41Var3) {
        this.e = d41Var;
        this.a = ko0Var;
        this.b = f41Var;
        this.c = f41Var2;
        this.d = f41Var3;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void X(float f10, boolean z4) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j10 = f10 > 0.7f ? (long) ((4089446400L * ((f10 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f10 / 0.7f)) + 524288.0f);
        f41 f41Var = this.d;
        f41 f41Var2 = this.b;
        f41 f41Var3 = this.c;
        if (f10 >= 1.0f) {
            f41Var2.e(false, isAttachedToWindow);
            f41Var3.e(false, isAttachedToWindow);
            f41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(f41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            f41Var2.e(true, isAttachedToWindow);
            f41Var3.e(false, isAttachedToWindow);
            f41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(f41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            f41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            f41Var2.e(false, isAttachedToWindow);
            f41Var3.e(true, isAttachedToWindow);
            f41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(f41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z4) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ int m0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void A() {
    }
}
