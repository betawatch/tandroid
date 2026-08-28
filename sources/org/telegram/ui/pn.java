package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pn extends org.telegram.ui.ActionBar.h5 {
    public boolean I0;
    public final /* synthetic */ qn J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(qn qnVar, Activity activity) {
        super(activity);
        this.J0 = qnVar;
        this.I0 = true;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void d(int i9) {
        super.d(i9);
        if (this.I0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            qn qnVar = this.J0;
            qnVar.C2 = dp;
            NumberTextView numberTextView = qnVar.B2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
