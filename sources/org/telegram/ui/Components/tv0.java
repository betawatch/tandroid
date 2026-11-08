package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class tv0 extends org.telegram.ui.Cells.z7 {
    public final /* synthetic */ uv0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv0(uv0 uv0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.O = uv0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        uv0 uv0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(uv0Var.r.F1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(uv0Var.r.F1, TLObject.FLAG_30));
    }
}
