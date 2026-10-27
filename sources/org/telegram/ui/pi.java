package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ wn t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(Activity activity, org.telegram.ui.ActionBar.u6 u6Var, wn wnVar) {
        super(activity, u6Var, false);
        this.t2 = wnVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        wn wnVar = this.t2;
        Y(wnVar.d1.getY() + y3, wnVar.j1.getBackgroundSizeY());
    }
}
