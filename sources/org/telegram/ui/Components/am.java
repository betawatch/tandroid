package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class am extends q8 {
    public final /* synthetic */ bm E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(bm bmVar, Context context) {
        super(context);
        this.E = bmVar;
    }

    @Override // org.telegram.ui.Components.q8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        bm bmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(bmVar.w.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(bmVar.w.K0, TLObject.FLAG_30));
    }
}
