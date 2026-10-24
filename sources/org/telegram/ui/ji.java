package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ji extends org.telegram.ui.Components.to {
    public final /* synthetic */ sn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(sn snVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.g6 g6Var) {
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
