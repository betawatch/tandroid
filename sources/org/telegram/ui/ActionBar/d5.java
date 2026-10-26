package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d5 extends ActionBarLayout {
    public final /* synthetic */ p y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(Activity activity, p pVar) {
        super(activity, false);
        this.y1 = pVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.j5
    public final k3 getBottomSheet() {
        return ((k3[]) this.y1.b)[0];
    }
}
