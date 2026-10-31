package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k00 extends Drawable {
    public final /* synthetic */ int a;
    public final Drawable b;
    public final Paint c;
    public final Paint d;
    public boolean e;
    public final Object f;

    public k00(Context context) {
        this.a = 1;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f = new t5(new eb0(this, 2), 200L, gr.g, 0);
        this.b = i0.a.f(context, R.drawable.filled_sound_on);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.566f));
        paint.setColor(-1);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStrokeWidth(org.telegram.messenger.i0.N(4.5f));
        paint2.setColor(-65536);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
    }

    public int b(float f7) {
        return org.telegram.messenger.i0.W1(f7, getBounds().left, getBounds().right);
    }

    public int c(float f7) {
        return org.telegram.messenger.i0.W1(f7, getBounds().top, getBounds().bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Path path = (Path) this.f;
                Drawable drawable = this.b;
                if (path == null) {
                    drawable.setBounds(getBounds());
                    drawable.draw(canvas);
                    break;
                } else {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, org.telegram.messenger.zs.e4);
                    drawable.setBounds(getBounds());
                    drawable.draw(canvas);
                    boolean z10 = this.e;
                    Paint paint = this.c;
                    if (z10) {
                        path.rewind();
                        path.moveTo(b(0.4871f), c(0.6025f));
                        path.lineTo(b(0.8974f), c(0.6025f));
                        path.lineTo(b(1.0f), c(0.7564f));
                        path.lineTo(b(0.8974f), c(0.9102f));
                        path.lineTo(b(0.4871f), c(0.9102f));
                        path.close();
                        this.e = false;
                        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
                    }
                    canvas.drawPath(path, paint);
                    canvas.drawPath(path, this.d);
                    canvas.restore();
                    break;
                }
            default:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, org.telegram.messenger.zs.e4, 31);
                Drawable drawable2 = this.b;
                drawable2.setBounds(bounds);
                drawable2.draw(canvas);
                float d = ((t5) this.f).d(this.e);
                if (d > 0.0f) {
                    float N = org.telegram.messenger.i0.N(0.783f);
                    float centerX = (bounds.centerX() - org.telegram.messenger.i0.L(9.0f)) + N;
                    float centerY = (bounds.centerY() - org.telegram.messenger.i0.L(9.0f)) + N;
                    float L = (org.telegram.messenger.i0.L(9.0f) + bounds.centerX()) - N;
                    float L2 = (org.telegram.messenger.i0.L(9.0f) + bounds.centerY()) - N;
                    if (this.e) {
                        centerX = org.telegram.messenger.i0.T1(L, centerX, d);
                        centerY = org.telegram.messenger.i0.T1(L2, centerY, d);
                    } else {
                        L = org.telegram.messenger.i0.T1(centerX, L, d);
                        L2 = org.telegram.messenger.i0.T1(centerY, L2, d);
                    }
                    float f7 = centerX;
                    float f10 = centerY;
                    float f11 = L2;
                    float f12 = L;
                    canvas.drawLine(f7, f10, f12, f11, this.d);
                    int min = (int) (Math.min(1.0f, d * 10.0f) * 255.0f);
                    Paint paint2 = this.c;
                    paint2.setAlpha(min);
                    canvas.drawLine(f7, f10, f12, f11, paint2);
                }
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return this.b.getIntrinsicHeight();
            default:
                return org.telegram.messenger.i0.L(24.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return this.b.getIntrinsicWidth();
            default:
                return org.telegram.messenger.i0.L(24.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return this.b.getOpacity();
            default:
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i10);
                break;
            default:
                this.b.setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.setBounds(i10, i11, i12, i13);
                this.e = true;
                break;
            default:
                super.setBounds(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.b.setColorFilter(colorFilter);
                break;
        }
    }

    public k00(Context context, int i10, int i11) {
        this.a = 0;
        this.e = true;
        this.b = context.getResources().getDrawable(i10);
        if (i11 >= 0) {
            this.f = new Path();
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(1.0f)));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL);
            int[] iArr = org.telegram.ui.ActionBar.t6.r8;
            paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, iArr[i11 % iArr.length], false));
            paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(1.0f)));
            return;
        }
        this.f = null;
        this.c = null;
        this.d = null;
    }

    private final void a(ColorFilter colorFilter) {
    }
}
