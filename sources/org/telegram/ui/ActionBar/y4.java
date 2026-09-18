package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class y4 extends ActionBarLayout {
    public final /* synthetic */ p s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(Activity activity, p pVar) {
        super(activity, false);
        this.s1 = pVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.d5
    public final f3 getBottomSheet() {
        return ((f3[]) this.s1.b)[0];
    }
}
