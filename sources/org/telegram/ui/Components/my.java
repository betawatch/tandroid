package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class my extends org.telegram.ui.Cells.d8 {
    public final /* synthetic */ int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, z10);
        this.O = i10;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.O) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(82.0f), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(82.0f), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(82.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(82.0f), TLObject.FLAG_30));
                break;
        }
    }
}
