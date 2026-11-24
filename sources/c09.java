// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c09 extends Drawable {
    public final View a;
    public final Paint b;
    public final Path c;
    public int d;
    public boolean e;
    public final ln f;

    public c09(View view) {
        Paint paint = new Paint(1);
        this.b = paint;
        Path path = new Path();
        this.c = path;
        this.d = nm7.d4;
        this.a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gm.L(1.0f));
        this.f = new ln(view, 0L, 350L, d53.h);
        float N = gm.N(4.66f);
        float N2 = gm.N(2.16f);
        path.rewind();
        path.moveTo(N / 2.0f, 0.0f);
        float f = (-N) / 2.0f;
        path.lineTo(f, 0.0f);
        float f2 = f + N2;
        path.lineTo(f2, -N2);
        path.moveTo(f, 0.0f);
        path.lineTo(f2, N2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        float d = this.f.d(this.e);
        float N = gm.N(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(N, N);
        canvas.rotate(45.0f);
        canvas.scale(gm.R1(-1.0f, 1.0f, d), 1.0f);
        Path path = this.c;
        Paint paint = this.b;
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f = -N;
        canvas.translate(f, f);
        canvas.rotate(225.0f);
        canvas.scale(gm.R1(-1.0f, 1.0f, d), 1.0f);
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i;
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
