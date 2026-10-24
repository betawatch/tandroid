package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class li extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ sn t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, sn snVar) {
        super(activity, g6Var, false);
        this.t2 = snVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        sn snVar = this.t2;
        Z(snVar.d1.getY() + y3, snVar.j1.getBackgroundSizeY());
    }
}
