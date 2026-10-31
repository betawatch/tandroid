package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v4 extends FrameLayout {
    public final int a;

    public v4(Context context) {
        this(context, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(54.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30));
    }

    public v4(Context context, int i10, int i11) {
        super(context);
        this.a = i11;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setSize(i10);
        addView(radialProgressView, w7.b6.e(-2, -2, 17));
    }
}
