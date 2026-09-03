package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a5 extends ActionBarLayout {
    public final /* synthetic */ n p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Activity activity, n nVar) {
        super(activity, false);
        this.p1 = nVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.f5
    public final h3 getBottomSheet() {
        return ((h3[]) this.p1.b)[0];
    }
}
