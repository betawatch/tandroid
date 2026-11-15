package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j4 extends ActionBarLayout {
    public final /* synthetic */ z z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Activity activity, z zVar) {
        super(activity, false);
        this.z1 = zVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.o4
    public final u2 getBottomSheet() {
        return ((u2[]) this.z1.b)[0];
    }
}
