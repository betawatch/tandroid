package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class e0 extends ImageView {
    public final /* synthetic */ e40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e40 e40Var, Context context) {
        super(context);
        this.a = e40Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        e40 e40Var = this.a;
        e40Var.f0.invalidate();
        e40Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
