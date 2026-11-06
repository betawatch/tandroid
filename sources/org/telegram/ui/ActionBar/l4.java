package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l4 extends ActionBarLayout {
    public final /* synthetic */ l2.y y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(Activity activity, l2.y yVar) {
        super(activity, false);
        this.y1 = yVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.q4
    public final v2 getBottomSheet() {
        return ((v2[]) this.y1.b)[0];
    }
}
