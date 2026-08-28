package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j31 implements org.telegram.ui.Components.on0 {
    public final /* synthetic */ org.telegram.ui.Components.pn0 a;
    public final /* synthetic */ m31 b;
    public final /* synthetic */ m31 c;
    public final /* synthetic */ m31 d;
    public final /* synthetic */ k31 e;

    public j31(k31 k31Var, org.telegram.ui.Components.pn0 pn0Var, m31 m31Var, m31 m31Var2, m31 m31Var3) {
        this.e = k31Var;
        this.a = pn0Var;
        this.b = m31Var;
        this.c = m31Var2;
        this.d = m31Var3;
    }

    @Override // org.telegram.ui.Components.on0
    public final void Q(float f10, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        long j10 = f10 > 0.7f ? (long) ((4089446400L * ((f10 - 0.7f) / 0.3f)) + SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) : (long) ((104333312 * (f10 / 0.7f)) + 524288.0f);
        m31 m31Var = this.d;
        m31 m31Var2 = this.b;
        m31 m31Var3 = this.c;
        if (f10 >= 1.0f) {
            m31Var2.e(false, isAttachedToWindow);
            m31Var3.e(false, isAttachedToWindow);
            m31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            m31Var2.e(true, isAttachedToWindow);
            m31Var3.e(false, isAttachedToWindow);
            m31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            m31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            m31Var2.e(false, isAttachedToWindow);
            m31Var3.e(true, isAttachedToWindow);
            m31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.W().limitVideo = j10;
            saveToGallerySettingsActivity.X();
        }
    }

    @Override // org.telegram.ui.Components.on0
    public final /* synthetic */ int c0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.on0
    public final /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.on0
    public final void n() {
    }
}
