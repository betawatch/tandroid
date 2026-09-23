package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class f0 extends ImageView {
    public final /* synthetic */ x30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(x30 x30Var, Context context) {
        super(context);
        this.a = x30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        x30 x30Var = this.a;
        x30Var.f0.invalidate();
        x30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
