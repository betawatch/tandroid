package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ci extends org.telegram.ui.Components.on {
    public final /* synthetic */ cn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(cn cnVar, Activity activity, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, i7, document, h6Var);
        this.M = cnVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        float y10 = getY();
        cn cnVar = this.M;
        float y11 = cnVar.f1.getY() + y10;
        this.J = cnVar.l1.getBackgroundSizeY();
        this.I = y11;
    }
}
