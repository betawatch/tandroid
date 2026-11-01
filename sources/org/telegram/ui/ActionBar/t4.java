package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t4 extends ActionBarLayout {
    public final /* synthetic */ mg.l y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(Activity activity, mg.l lVar) {
        super(activity, false);
        this.y1 = lVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.z4
    public final z2 getBottomSheet() {
        return ((z2[]) this.y1.b)[0];
    }
}
