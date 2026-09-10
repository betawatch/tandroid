package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class co extends org.telegram.ui.ActionBar.l5 {
    public boolean M0;
    public final /* synthetic */ eo N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(eo eoVar, Activity activity) {
        super(activity);
        this.N0 = eoVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.l5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            eo eoVar = this.N0;
            eoVar.G2 = dp;
            NumberTextView numberTextView = eoVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
