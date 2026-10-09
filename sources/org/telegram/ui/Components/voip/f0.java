package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.y30;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f0 extends ImageView {
    public final /* synthetic */ y30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(y30 y30Var, Context context) {
        super(context);
        this.a = y30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        y30 y30Var = this.a;
        y30Var.f0.invalidate();
        y30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
