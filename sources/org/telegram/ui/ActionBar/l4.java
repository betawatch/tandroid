package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l4 extends ActionBarLayout {
    public final /* synthetic */ l5.b z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(Activity activity, l5.b bVar) {
        super(activity, false);
        this.z1 = bVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.q4
    public final t2 getBottomSheet() {
        return ((t2[]) this.z1.b)[0];
    }
}
