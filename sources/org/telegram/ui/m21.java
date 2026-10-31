package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m21 extends FrameLayout {
    public FrameLayout a;
    public org.telegram.ui.Cells.y3 b;
    public kg.x0 c;
    public String d;
    public ValueAnimator e;
    public float f;
    public Boolean h;
    public ValueAnimator n;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.i0.L(44.0f), TLObject.FLAG_30));
    }
}
