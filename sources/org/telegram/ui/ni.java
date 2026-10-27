package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ni extends org.telegram.ui.Components.vo {
    public final /* synthetic */ wn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(wn wnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, i10, document, u6Var);
        this.M = wnVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        wn wnVar = this.M;
        float y10 = wnVar.d1.getY() + y3;
        this.J = wnVar.j1.getBackgroundSizeY();
        this.I = y10;
    }
}
