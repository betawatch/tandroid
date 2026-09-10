package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ga1 extends org.telegram.ui.Components.vl0 {
    public int X2;
    public final /* synthetic */ fb1 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga1(fb1 fb1Var, Context context) {
        super(context, null);
        this.Y2 = fb1Var;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        ka1 ka1Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (ka1Var = this.Y2.X) != null) {
            ka1Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
