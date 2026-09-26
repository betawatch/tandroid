package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class w4 extends ActionBarLayout {
    public final /* synthetic */ n s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(Activity activity, n nVar) {
        super(activity, false);
        this.s1 = nVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.b5
    public final e3 getBottomSheet() {
        return ((e3[]) this.s1.b)[0];
    }
}
