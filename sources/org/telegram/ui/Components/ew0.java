package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ew0 extends org.telegram.ui.Cells.z7 {
    public final /* synthetic */ fw0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew0(fw0 fw0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, false);
        this.P = fw0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        fw0 fw0Var = this.P;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(fw0Var.r.J1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(fw0Var.r.J1, TLObject.FLAG_30));
    }
}
