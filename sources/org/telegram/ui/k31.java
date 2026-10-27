package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k31 implements org.telegram.ui.Components.lp0 {
    public final /* synthetic */ org.telegram.ui.Components.mp0 a;
    public final /* synthetic */ n31 b;
    public final /* synthetic */ n31 c;
    public final /* synthetic */ n31 d;
    public final /* synthetic */ l31 e;

    public k31(l31 l31Var, org.telegram.ui.Components.mp0 mp0Var, n31 n31Var, n31 n31Var2, n31 n31Var3) {
        this.e = l31Var;
        this.a = mp0Var;
        this.b = n31Var;
        this.c = n31Var2;
        this.d = n31Var3;
    }

    @Override // org.telegram.ui.Components.lp0
    public final void U(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j10 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        n31 n31Var = this.d;
        n31 n31Var2 = this.b;
        n31 n31Var3 = this.c;
        if (f7 >= 1.0f) {
            n31Var2.e(false, isAttachedToWindow);
            n31Var3.e(false, isAttachedToWindow);
            n31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(n31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            n31Var2.e(true, isAttachedToWindow);
            n31Var3.e(false, isAttachedToWindow);
            n31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(n31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            n31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            n31Var2.e(false, isAttachedToWindow);
            n31Var3.e(true, isAttachedToWindow);
            n31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(n31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.Z().limitVideo = j10;
            saveToGallerySettingsActivity.a0();
        }
    }

    @Override // org.telegram.ui.Components.lp0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.lp0
    public final /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.lp0
    public final void y() {
    }
}
