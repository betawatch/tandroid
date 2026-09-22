package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ao extends org.telegram.ui.ActionBar.j5 {
    public boolean M0;
    public final /* synthetic */ bo N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(bo boVar, Activity activity) {
        super(activity);
        this.N0 = boVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            bo boVar = this.N0;
            boVar.G2 = dp;
            NumberTextView numberTextView = boVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
