package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c3 extends View {
    public boolean a;
    public final Paint b;
    public final org.telegram.ui.ActionBar.e6 c;

    public c3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = new Paint();
        this.c = e6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        Paint paint = this.b;
        if (z10) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ug, e6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d7, e6Var));
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
