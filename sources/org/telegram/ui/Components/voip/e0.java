package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.h30;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class e0 extends ImageView {
    public final /* synthetic */ h30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h30 h30Var, Context context) {
        super(context);
        this.a = h30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        h30 h30Var = this.a;
        h30Var.f0.invalidate();
        h30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
