package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ki extends org.telegram.ui.Components.to {
    public final /* synthetic */ sn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(sn snVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, i10, document, g6Var);
        this.M = snVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        sn snVar = this.M;
        float y10 = snVar.d1.getY() + y3;
        this.J = snVar.j1.getBackgroundSizeY();
        this.I = y10;
    }
}
