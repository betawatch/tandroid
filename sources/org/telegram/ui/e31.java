package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class e31 implements org.telegram.ui.Components.bp0 {
    public final /* synthetic */ org.telegram.ui.Components.cp0 a;
    public final /* synthetic */ h31 b;
    public final /* synthetic */ h31 c;
    public final /* synthetic */ h31 d;
    public final /* synthetic */ f31 e;

    public e31(f31 f31Var, org.telegram.ui.Components.cp0 cp0Var, h31 h31Var, h31 h31Var2, h31 h31Var3) {
        this.e = f31Var;
        this.a = cp0Var;
        this.b = h31Var;
        this.c = h31Var2;
        this.d = h31Var3;
    }

    @Override // org.telegram.ui.Components.bp0
    public final void L(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j10 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        h31 h31Var = this.d;
        h31 h31Var2 = this.b;
        h31 h31Var3 = this.c;
        if (f7 >= 1.0f) {
            h31Var2.e(false, isAttachedToWindow);
            h31Var3.e(false, isAttachedToWindow);
            h31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(h31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            h31Var2.e(true, isAttachedToWindow);
            h31Var3.e(false, isAttachedToWindow);
            h31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(h31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            h31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            h31Var2.e(false, isAttachedToWindow);
            h31Var3.e(true, isAttachedToWindow);
            h31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(h31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public final /* synthetic */ int Y() {
        return 0;
    }

    @Override // org.telegram.ui.Components.bp0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.bp0
    public final void v() {
    }
}
