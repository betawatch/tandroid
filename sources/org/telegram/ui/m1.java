package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m1 extends View {
    public final RectF a;

    public m1(Context context) {
        super(context);
        this.a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        float L = org.telegram.messenger.i0.L(10.0f);
        RectF rectF = this.a;
        rectF.set(measuredWidth, org.telegram.messenger.i0.L(8.0f), measuredWidth * 2, L);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), h4.s1);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(18.0f));
    }
}
