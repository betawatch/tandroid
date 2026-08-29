package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w4 extends ActionBarLayout {
    public final /* synthetic */ o o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(Activity activity, o oVar) {
        super(activity, false);
        this.o1 = oVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.b5
    public final f3 getBottomSheet() {
        return ((f3[]) this.o1.b)[0];
    }
}
