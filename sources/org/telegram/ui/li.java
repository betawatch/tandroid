package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class li extends org.telegram.ui.Components.vo {
    public final /* synthetic */ un M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(un unVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, i10, document, u6Var);
        this.M = unVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        un unVar = this.M;
        float y10 = unVar.d1.getY() + y3;
        this.J = unVar.j1.getBackgroundSizeY();
        this.I = y10;
    }
}
