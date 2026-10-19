package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class pn extends org.telegram.ui.ActionBar.j5 {
    public boolean M0;
    public final /* synthetic */ qn N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(qn qnVar, Activity activity) {
        super(activity);
        this.N0 = qnVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            qn qnVar = this.N0;
            qnVar.G2 = dp;
            NumberTextView numberTextView = qnVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
