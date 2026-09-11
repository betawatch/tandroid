package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
