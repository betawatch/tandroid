// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aq3 extends View {
    public boolean a;
    public final Paint b;
    public final ylb c;

    public aq3(Context context, ylb ylbVar) {
        super(context);
        this.b = new Paint();
        this.c = ylbVar;
        setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.a;
        ylb ylbVar = this.c;
        Paint paint = this.b;
        if (z) {
            paint.setColor(on2.f(0.2f, -16777216, cmb.v0(cmb.kh, ylbVar)));
        } else {
            paint.setColor(cmb.v0(cmb.c7, ylbVar));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z) {
        this.a = z;
    }
}
