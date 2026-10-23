package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.k30;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class e0 extends ImageView {
    public final /* synthetic */ k30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k30 k30Var, Context context) {
        super(context);
        this.a = k30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        k30 k30Var = this.a;
        k30Var.f0.invalidate();
        k30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
