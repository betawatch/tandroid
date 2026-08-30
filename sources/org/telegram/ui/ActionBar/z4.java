package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z4 extends ActionBarLayout {
    public final /* synthetic */ n p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(Activity activity, n nVar) {
        super(activity, false);
        this.p1 = nVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.e5
    public final g3 getBottomSheet() {
        return ((g3[]) this.p1.b)[0];
    }
}
