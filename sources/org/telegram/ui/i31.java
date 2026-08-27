package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i31 implements org.telegram.ui.Components.pn0 {
    public final /* synthetic */ org.telegram.ui.Components.qn0 a;
    public final /* synthetic */ l31 b;
    public final /* synthetic */ l31 c;
    public final /* synthetic */ l31 d;
    public final /* synthetic */ j31 e;

    public i31(j31 j31Var, org.telegram.ui.Components.qn0 qn0Var, l31 l31Var, l31 l31Var2, l31 l31Var3) {
        this.e = j31Var;
        this.a = qn0Var;
        this.b = l31Var;
        this.c = l31Var2;
        this.d = l31Var3;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void P(float f10, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j10 = f10 > 0.7f ? (long) ((4089446400L * ((f10 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f10 / 0.7f)) + 524288.0f);
        l31 l31Var = this.d;
        l31 l31Var2 = this.b;
        l31 l31Var3 = this.c;
        if (f10 >= 1.0f) {
            l31Var2.e(false, isAttachedToWindow);
            l31Var3.e(false, isAttachedToWindow);
            l31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(l31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f10 == 0.0f) {
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
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public final /* synthetic */ int a0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.pn0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void r() {
    }
}
