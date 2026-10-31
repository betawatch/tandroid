package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wl extends TextView {
    public float a;
    public boolean b;
    public final /* synthetic */ Paint c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(Context context, Paint paint) {
        super(context);
        this.c = paint;
        this.a = 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.a * 130.0f) + 125.0f);
        Paint paint = this.c;
        paint.setAlpha(i10);
        if (this.b) {
            float f7 = this.a + 0.026666667f;
            this.a = f7;
            if (f7 >= 1.0f) {
                this.a = 1.0f;
                this.b = false;
            }
        } else {
            float f10 = this.a - 0.026666667f;
            this.a = f10;
            if (f10 <= 0.0f) {
                this.a = 0.0f;
                this.b = true;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.i0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.i0.L(4.0f), paint);
        invalidate();
    }
}
