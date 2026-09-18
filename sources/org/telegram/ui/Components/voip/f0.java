package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f0 extends ImageView {
    public final /* synthetic */ c40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c40 c40Var, Context context) {
        super(context);
        this.a = c40Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        c40 c40Var = this.a;
        c40Var.f0.invalidate();
        c40Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
