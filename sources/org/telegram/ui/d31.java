package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class d31 implements org.telegram.ui.Components.cp0 {
    public final /* synthetic */ org.telegram.ui.Components.dp0 a;
    public final /* synthetic */ g31 b;
    public final /* synthetic */ g31 c;
    public final /* synthetic */ g31 d;
    public final /* synthetic */ e31 e;

    public d31(e31 e31Var, org.telegram.ui.Components.dp0 dp0Var, g31 g31Var, g31 g31Var2, g31 g31Var3) {
        this.e = e31Var;
        this.a = dp0Var;
        this.b = g31Var;
        this.c = g31Var2;
        this.d = g31Var3;
    }

    @Override // org.telegram.ui.Components.cp0
    public final void L(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j10 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        g31 g31Var = this.d;
        g31 g31Var2 = this.b;
        g31 g31Var3 = this.c;
        if (f7 >= 1.0f) {
            g31Var2.e(false, isAttachedToWindow);
            g31Var3.e(false, isAttachedToWindow);
            g31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(g31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            g31Var2.e(true, isAttachedToWindow);
            g31Var3.e(false, isAttachedToWindow);
            g31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(g31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            g31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            g31Var2.e(false, isAttachedToWindow);
            g31Var3.e(true, isAttachedToWindow);
            g31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(g31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override // org.telegram.ui.Components.cp0
    public final /* synthetic */ int Y() {
        return 0;
    }

    @Override // org.telegram.ui.Components.cp0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.cp0
    public final void v() {
    }
}
