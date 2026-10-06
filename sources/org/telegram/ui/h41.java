package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class h41 implements org.telegram.ui.Components.yo0 {
    public final /* synthetic */ org.telegram.ui.Components.zo0 a;
    public final /* synthetic */ k41 b;
    public final /* synthetic */ k41 c;
    public final /* synthetic */ k41 d;
    public final /* synthetic */ i41 e;

    public h41(i41 i41Var, org.telegram.ui.Components.zo0 zo0Var, k41 k41Var, k41 k41Var2, k41 k41Var3) {
        this.e = i41Var;
        this.a = zo0Var;
        this.b = k41Var;
        this.c = k41Var2;
        this.d = k41Var3;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void Y(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j3 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        k41 k41Var = this.d;
        k41 k41Var2 = this.b;
        k41 k41Var3 = this.c;
        if (f7 >= 1.0f) {
            k41Var2.e(false, isAttachedToWindow);
            k41Var3.e(false, isAttachedToWindow);
            k41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            k41Var2.e(true, isAttachedToWindow);
            k41Var3.e(false, isAttachedToWindow);
            k41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            k41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            k41Var2.e(false, isAttachedToWindow);
            k41Var3.e(true, isAttachedToWindow);
            k41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.W().limitVideo = j3;
            saveToGallerySettingsActivity.X();
        }
    }

    @Override // org.telegram.ui.Components.yo0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.yo0
    public final /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void B() {
    }
}
