package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class g41 implements org.telegram.ui.Components.eo0 {
    public final /* synthetic */ org.telegram.ui.Components.fo0 a;
    public final /* synthetic */ j41 b;
    public final /* synthetic */ j41 c;
    public final /* synthetic */ j41 d;
    public final /* synthetic */ h41 e;

    public g41(h41 h41Var, org.telegram.ui.Components.fo0 fo0Var, j41 j41Var, j41 j41Var2, j41 j41Var3) {
        this.e = h41Var;
        this.a = fo0Var;
        this.b = j41Var;
        this.c = j41Var2;
        this.d = j41Var3;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void X(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j3 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        j41 j41Var = this.d;
        j41 j41Var2 = this.b;
        j41 j41Var3 = this.c;
        if (f7 >= 1.0f) {
            j41Var2.e(false, isAttachedToWindow);
            j41Var3.e(false, isAttachedToWindow);
            j41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(j41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            j41Var2.e(true, isAttachedToWindow);
            j41Var3.e(false, isAttachedToWindow);
            j41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(j41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            j41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            j41Var2.e(false, isAttachedToWindow);
            j41Var3.e(true, isAttachedToWindow);
            j41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(j41Var3, true, 0.8f, isAttachedToWindow);
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
