package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y4 extends ActionBarLayout {
    public final /* synthetic */ n s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(Activity activity, n nVar) {
        super(activity, false);
        this.s1 = nVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.d5
    public final f3 getBottomSheet() {
        return ((f3[]) this.s1.b)[0];
    }
}
