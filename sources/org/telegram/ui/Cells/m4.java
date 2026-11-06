package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class m4 extends TextView {
    public boolean a;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth(), getHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(48.0f) + 1);
    }

    public void setNeedDivider(boolean z9) {
        this.a = z9;
    }
}
