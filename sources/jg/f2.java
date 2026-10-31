package jg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class f2 extends View {
    public Bitmap a;
    public Paint b;
    public Paint c;
    public Paint d;
    public float e;
    public float f;
    public Path h;
    public Rect n;
    public RectF r;
    public int s;
    public boolean w;
    public q0.a x;
    public float y;

    public final void a(boolean z10) {
        if (this.w) {
            return;
        }
        this.w = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(gr.f);
        duration.addUpdateListener(new bg.k(this, 5));
        duration.addListener(new eg.m(1, this, z10));
        duration.start();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ig.j) this).D.o1.c();
        this.a.recycle();
        this.a = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        Rect rect = this.n;
        Paint paint = this.b;
        RectF rectF = this.r;
        Path path = this.h;
        super.onDraw(canvas);
        float min = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.e * getWidth();
        float height = this.f * getHeight();
        int round = Math.round(this.e * this.a.getWidth());
        int round2 = Math.round(this.f * this.a.getHeight());
        int pixel = this.a.getPixel(Utilities.j(round, r11.getWidth() - 1, 0), Utilities.j(round2, this.a.getHeight() - 1, 0));
        this.s = pixel;
        Paint paint2 = this.d;
        paint2.setColor(pixel);
        float f10 = this.y;
        if (f10 == 0.0f || f10 == 1.0f) {
            i10 = round;
            f7 = 1.0f;
            canvas.save();
        } else {
            RectF rectF2 = org.telegram.messenger.i0.P;
            f7 = 1.0f;
            i10 = round;
            rectF2.set(width - min, height - min, width + min, height + min);
            canvas.saveLayerAlpha(rectF2, (int) (this.y * 255.0f), 31);
        }
        float f11 = (this.y * 0.5f) + 0.5f;
        canvas.scale(f11, f11, width, height);
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, min, direction);
        canvas.clipPath(path);
        int round3 = Math.round(3.5f);
        rect.set(i10 - round3, round2 - round3, i10 + round3, round2 + round3);
        rectF.set(width - min, height - min, width + min, height + min);
        canvas.drawBitmap(this.a, rect, rectF, (Paint) null);
        float strokeWidth = min - (paint2.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth, paint2);
        float strokeWidth2 = (strokeWidth - (paint2.getStrokeWidth() / 2.0f)) - (paint.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth2, paint);
        float strokeWidth3 = strokeWidth2 - (paint.getStrokeWidth() / 2.0f);
        path.rewind();
        path.addCircle(width, height, strokeWidth3, direction);
        canvas.clipPath(path);
        float f12 = (strokeWidth3 * 2.0f) / 8.0f;
        path.rewind();
        for (float f13 = -3.5f; f13 < 4.5f; f13 += f7) {
            float f14 = (f13 * f12) + width;
            path.moveTo(f14, height - strokeWidth3);
            path.lineTo(f14, height + strokeWidth3);
        }
        for (float f15 = -3.5f; f15 < 4.5f; f15 += f7) {
            float f16 = (f15 * f12) + height;
            path.moveTo(width - strokeWidth3, f16);
            path.lineTo(width + strokeWidth3, f16);
        }
        canvas.drawPath(path, this.c);
        float f17 = f12 / 2.0f;
        rectF.set(width - f17, height - f17, width + f17, height + f17);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7), paint);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == 0 || i11 == 0 || i12 == 0 || i13 == 0 || !isLaidOut()) {
            return;
        }
        this.e = (i12 * this.e) / i10;
        this.f = (i13 * this.f) / i11;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e = motionEvent.getX() / getWidth();
            this.f = motionEvent.getY() / getHeight();
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if (actionMasked == 1) {
            a(true);
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return true;
            }
            a(false);
            return true;
        }
        this.e = motionEvent.getX() / getWidth();
        this.f = motionEvent.getY() / getHeight();
        invalidate();
        return true;
    }

    public void setColorListener(q0.a aVar) {
        this.x = aVar;
    }
}
