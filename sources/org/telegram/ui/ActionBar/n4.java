package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n4 extends ActionBarLayout {
    public final /* synthetic */ p z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(Activity activity, p pVar) {
        super(activity, false);
        this.z1 = pVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.s4
    public final x2 getBottomSheet() {
        return ((x2[]) this.z1.b)[0];
    }
}
