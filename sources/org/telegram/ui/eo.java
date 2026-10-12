package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class eo extends org.telegram.ui.ActionBar.h5 {
    public boolean M0;
    public final /* synthetic */ fo N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(fo foVar, Activity activity) {
        super(activity);
        this.N0 = foVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            fo foVar = this.N0;
            foVar.G2 = dp;
            NumberTextView numberTextView = foVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
