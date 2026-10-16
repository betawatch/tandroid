package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
