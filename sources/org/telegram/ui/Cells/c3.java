package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c3 extends View {
    public boolean a;
    public final Paint b;
    public final org.telegram.ui.ActionBar.g6 c;

    public c3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.b = new Paint();
        this.c = g6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z4 = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        Paint paint = this.b;
        if (z4) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ug, g6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d7, g6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z4) {
        this.a = z4;
    }
}
