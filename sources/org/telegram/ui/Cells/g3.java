package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g3 extends View {
    public boolean a;
    public final Paint b;
    public final org.telegram.ui.ActionBar.p6 c;

    public g3(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.b = new Paint();
        this.c = p6Var;
        setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.a;
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        Paint paint = this.b;
        if (z10) {
            paint.setColor(i0.b.f(0.2f, -16777216, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ih, p6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d7, p6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.a = z10;
    }
}
