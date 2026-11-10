package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tv0 extends org.telegram.ui.Cells.z7 {
    public final /* synthetic */ uv0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv0(uv0 uv0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, false);
        this.O = uv0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        uv0 uv0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(uv0Var.r.I1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(uv0Var.r.I1, TLObject.FLAG_30));
    }
}
