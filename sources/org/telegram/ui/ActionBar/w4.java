package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w4 extends ActionBarLayout {
    public final /* synthetic */ n o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(Activity activity, n nVar) {
        super(activity, false);
        this.o1 = nVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.b5
    public final e3 getBottomSheet() {
        return ((e3[]) this.o1.b)[0];
    }
}
