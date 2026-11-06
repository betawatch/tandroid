package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
