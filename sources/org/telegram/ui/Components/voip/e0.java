package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.o30;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e0 extends ImageView {
    public final /* synthetic */ o30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(o30 o30Var, Context context) {
        super(context);
        this.a = o30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        o30 o30Var = this.a;
        o30Var.f0.invalidate();
        o30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
