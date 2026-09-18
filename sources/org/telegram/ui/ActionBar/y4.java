package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
