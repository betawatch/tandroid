package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e3 extends View {
    public boolean a;
    public final Paint b;
    public final org.telegram.ui.ActionBar.f6 c;

    public e3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = new Paint();
        this.c = f6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z9 = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        Paint paint = this.b;
        if (z9) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ih, f6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, f6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z9) {
        this.a = z9;
    }
}
