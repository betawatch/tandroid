package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class h31 implements org.telegram.ui.Components.gp0 {
    public final /* synthetic */ org.telegram.ui.Components.hp0 a;
    public final /* synthetic */ k31 b;
    public final /* synthetic */ k31 c;
    public final /* synthetic */ k31 d;
    public final /* synthetic */ i31 e;

    public h31(i31 i31Var, org.telegram.ui.Components.hp0 hp0Var, k31 k31Var, k31 k31Var2, k31 k31Var3) {
        this.e = i31Var;
        this.a = hp0Var;
        this.b = k31Var;
        this.c = k31Var2;
        this.d = k31Var3;
    }

    @Override // org.telegram.ui.Components.gp0
    public final void L(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j10 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        k31 k31Var = this.d;
        k31 k31Var2 = this.b;
        k31 k31Var3 = this.c;
        if (f7 >= 1.0f) {
            k31Var2.e(false, isAttachedToWindow);
            k31Var3.e(false, isAttachedToWindow);
            k31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            k31Var2.e(true, isAttachedToWindow);
            k31Var3.e(false, isAttachedToWindow);
            k31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            k31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            k31Var2.e(false, isAttachedToWindow);
            k31Var3.e(true, isAttachedToWindow);
            k31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.Y().limitVideo = j10;
            saveToGallerySettingsActivity.Z();
        }
    }

    @Override // org.telegram.ui.Components.gp0
    public final /* synthetic */ int Y() {
        return 0;
    }

    @Override // org.telegram.ui.Components.gp0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.gp0
    public final void v() {
    }
}
