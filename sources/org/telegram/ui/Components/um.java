package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class um extends j9 {
    public final /* synthetic */ vm E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um(vm vmVar, Context context) {
        super(context);
        this.E = vmVar;
    }

    @Override // org.telegram.ui.Components.j9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        vm vmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(vmVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(vmVar.v.K0, TLObject.FLAG_30));
    }
}
