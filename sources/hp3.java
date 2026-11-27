// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hp3 extends View {
    public boolean a;
    public final Paint b;
    public final vnb c;

    public hp3(Context context, vnb vnbVar) {
        super(context);
        this.b = new Paint();
        this.c = vnbVar;
        setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.a;
        vnb vnbVar = this.c;
        Paint paint = this.b;
        if (z) {
            paint.setColor(vm2.f(0.2f, -16777216, aob.v0(aob.lh, vnbVar)));
        } else {
            paint.setColor(aob.v0(aob.d7, vnbVar));
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
