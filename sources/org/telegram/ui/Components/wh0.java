package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wh0 extends ck0 {
    public final /* synthetic */ ei0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh0(ei0 ei0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f3 = ei0Var;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        ei0 ei0Var = this.f3;
        y90 y90Var = ei0Var.K;
        if (y90Var != null) {
            y90Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        ei0Var.j();
    }
}
