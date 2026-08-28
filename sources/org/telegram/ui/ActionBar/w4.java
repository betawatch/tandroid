package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w4 extends ActionBarLayout {
    public final /* synthetic */ n o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(Activity activity, n nVar) {
        super(activity, false);
        this.o1 = nVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.b5
    public final f3 getBottomSheet() {
        return ((f3[]) this.o1.b)[0];
    }
}
