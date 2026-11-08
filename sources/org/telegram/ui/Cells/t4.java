package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t4 extends FrameLayout {
    public final int a;

    public t4(Context context) {
        this(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(54.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30));
    }

    public t4(Context context, int i7, int i10) {
        super(context);
        this.a = i10;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setSize(i7);
        addView(radialProgressView, c8.ha.e(-2, -2, 17));
    }
}
