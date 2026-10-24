package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
