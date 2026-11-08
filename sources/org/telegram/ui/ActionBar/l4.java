package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
