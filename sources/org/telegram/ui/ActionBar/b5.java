package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class b5 extends ActionBarLayout {
    public final /* synthetic */ n y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(Activity activity, n nVar) {
        super(activity, false);
        this.y1 = nVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.h5
    public final h3 getBottomSheet() {
        return ((h3[]) this.y1.b)[0];
    }
}
