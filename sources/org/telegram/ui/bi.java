package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class bi extends org.telegram.ui.Cells.t0 {
    public final /* synthetic */ an t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, an anVar) {
        super(activity, f6Var, false);
        this.t2 = anVar;
    }

    @Override // org.telegram.ui.Cells.t0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        float y10 = getY();
        an anVar = this.t2;
        i0(anVar.f1.getY() + y10, anVar.l1.getBackgroundSizeY());
    }
}
