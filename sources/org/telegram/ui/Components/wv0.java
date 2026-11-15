package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wv0 extends org.telegram.ui.Cells.y7 {
    public final /* synthetic */ xv0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.P = xv0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        xv0 xv0Var = this.P;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(xv0Var.r.J1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(xv0Var.r.J1, TLObject.FLAG_30));
    }
}
