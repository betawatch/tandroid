package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class uv0 extends org.telegram.ui.Cells.z7 {
    public final /* synthetic */ vv0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv0(vv0 vv0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.O = vv0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        vv0 vv0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(vv0Var.r.F1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(vv0Var.r.F1, TLObject.FLAG_30));
    }
}
