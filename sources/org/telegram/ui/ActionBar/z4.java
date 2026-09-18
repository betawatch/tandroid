package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class z4 extends ActionBarLayout {
    public final /* synthetic */ p s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(Activity activity, p pVar) {
        super(activity, false);
        this.s1 = pVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.e5
    public final g3 getBottomSheet() {
        return ((g3[]) this.s1.b)[0];
    }
}
