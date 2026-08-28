package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hi extends org.telegram.ui.Components.yn {
    public final /* synthetic */ qn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(qn qnVar, Activity activity, int i9, TLRPC.Document document, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, i9, document, b6Var);
        this.I = qnVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        float y10 = getY();
        qn qnVar = this.I;
        float y11 = qnVar.N0.getY() + y10;
        this.F = qnVar.T0.getBackgroundSizeY();
        this.E = y11;
    }
}
