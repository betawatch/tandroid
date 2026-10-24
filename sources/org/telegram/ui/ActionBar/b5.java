package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
