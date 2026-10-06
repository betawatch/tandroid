package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.a40;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class f0 extends ImageView {
    public final /* synthetic */ a40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a40 a40Var, Context context) {
        super(context);
        this.a = a40Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        a40 a40Var = this.a;
        a40Var.f0.invalidate();
        a40Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
