package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class rg0 extends Drawable {
    public final View a;
    public final Paint b;
    public final Path c;
    public int d;
    public boolean e;
    public final w5 f;

    public rg0(View view) {
        Paint paint = new Paint(1);
        this.b = paint;
        Path path = new Path();
        this.c = path;
        this.d = org.telegram.messenger.qs.e4;
        this.a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f = new w5(view, 0L, 350L, xq.h);
        float N = org.telegram.messenger.g0.N(4.66f);
        float N2 = org.telegram.messenger.g0.N(2.16f);
        path.rewind();
        path.moveTo(N / 2.0f, 0.0f);
        float f10 = (-N) / 2.0f;
        path.lineTo(f10, 0.0f);
        float f11 = f10 + N2;
        path.lineTo(f11, -N2);
        path.moveTo(f10, 0.0f);
        path.lineTo(f11, N2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        float d = this.f.d(this.e);
        float N = org.telegram.messenger.g0.N(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(N, N);
        canvas.rotate(45.0f);
        canvas.scale(org.telegram.messenger.g0.T1(-1.0f, 1.0f, d), 1.0f);
        Path path = this.c;
        Paint paint = this.b;
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f10 = -N;
        canvas.translate(f10, f10);
        canvas.rotate(225.0f);
        canvas.scale(org.telegram.messenger.g0.T1(-1.0f, 1.0f, d), 1.0f);
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.d = i7;
        this.b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
