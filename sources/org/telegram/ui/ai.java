package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ai extends org.telegram.ui.Components.pn {
    public final /* synthetic */ an M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(an anVar, Activity activity, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, i7, document, f6Var);
        this.M = anVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        float y10 = getY();
        an anVar = this.M;
        float y11 = anVar.f1.getY() + y10;
        this.J = anVar.l1.getBackgroundSizeY();
        this.I = y11;
    }
}
