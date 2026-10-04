package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class j41 implements org.telegram.ui.Components.xo0 {
    public final /* synthetic */ org.telegram.ui.Components.yo0 a;
    public final /* synthetic */ m41 b;
    public final /* synthetic */ m41 c;
    public final /* synthetic */ m41 d;
    public final /* synthetic */ k41 e;

    public j41(k41 k41Var, org.telegram.ui.Components.yo0 yo0Var, m41 m41Var, m41 m41Var2, m41 m41Var3) {
        this.e = k41Var;
        this.a = yo0Var;
        this.b = m41Var;
        this.c = m41Var2;
        this.d = m41Var3;
    }

    @Override // org.telegram.ui.Components.xo0
    public final void Y(float f7, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j3 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        m41 m41Var = this.d;
        m41 m41Var2 = this.b;
        m41 m41Var3 = this.c;
        if (f7 >= 1.0f) {
            m41Var2.e(false, isAttachedToWindow);
            m41Var3.e(false, isAttachedToWindow);
            m41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            m41Var2.e(true, isAttachedToWindow);
            m41Var3.e(false, isAttachedToWindow);
            m41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            m41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            m41Var2.e(false, isAttachedToWindow);
            m41Var3.e(true, isAttachedToWindow);
            m41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.W().limitVideo = j3;
            saveToGallerySettingsActivity.X();
        }
    }

    @Override // org.telegram.ui.Components.xo0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.xo0
    public final /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.xo0
    public final void B() {
    }
}
