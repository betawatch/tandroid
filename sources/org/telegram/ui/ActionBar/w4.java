package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
