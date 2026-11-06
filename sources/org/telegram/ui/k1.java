package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k1 extends View {
    public final RectF a;

    public k1(Context context) {
        super(context);
        this.a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        float L = org.telegram.messenger.g0.L(10.0f);
        RectF rectF = this.a;
        rectF.set(measuredWidth, org.telegram.messenger.g0.L(8.0f), measuredWidth * 2, L);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), g4.s1);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(18.0f));
    }
}
