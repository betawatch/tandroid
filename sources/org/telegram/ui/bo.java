package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class bo extends org.telegram.ui.ActionBar.j5 {
    public boolean M0;
    public final /* synthetic */ co N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(co coVar, Activity activity) {
        super(activity);
        this.N0 = coVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            co coVar = this.N0;
            coVar.G2 = dp;
            NumberTextView numberTextView = coVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
