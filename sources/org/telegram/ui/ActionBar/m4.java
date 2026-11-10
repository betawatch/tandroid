package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m4 extends ActionBarLayout {
    public final /* synthetic */ l2.x y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(Activity activity, l2.x xVar) {
        super(activity, false);
        this.y1 = xVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.r4
    public final w2 getBottomSheet() {
        return ((w2[]) this.y1.b)[0];
    }
}
