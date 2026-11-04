package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class RadioButton extends View {
    public static Paint s;
    public static Paint w;
    public static Paint x;
    public int a;
    public int b;
    public float c;
    public ObjectAnimator d;
    public boolean e;
    public boolean f;
    public int h;
    public int n;
    public Drawable r;

    public RadioButton(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(16.0f);
        if (s == null) {
            Paint paint = new Paint(1);
            s = paint;
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            s.setStyle(Paint.Style.STROKE);
            x = new Paint(1);
            Paint paint2 = new Paint(1);
            w = paint2;
            paint2.setColor(0);
            w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f) {
            return;
        }
        this.f = z10;
        if (this.e && z11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
            this.d = ofFloat;
            ofFloat.setDuration(200L);
            this.d.start();
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setProgress(z10 ? 1.0f : 0.0f);
    }

    public final void b(int i3, int i10) {
        this.b = i3;
        this.a = i10;
        invalidate();
    }

    public int getCheckedColor() {
        return this.a;
    }

    public int getColor() {
        return this.b;
    }

    public float getProgress() {
        return this.c;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = this.c;
        if (f11 <= 0.5f) {
            s.setColor(this.b);
            x.setColor(this.b);
            f10 = this.c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            float f12 = 1.0f - f10;
            int rgb = Color.rgb(Color.red(this.b) + ((int) ((Color.red(this.a) - r2) * f12)), Color.green(this.b) + ((int) ((Color.green(this.a) - r7) * f12)), Color.blue(this.b) + ((int) ((Color.blue(this.a) - r9) * f12)));
            s.setColor(rgb);
            x.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.hs.e4, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * org.telegram.messenger.g0.p);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, s);
        if (this.r == null) {
            if (this.c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - org.telegram.messenger.g0.L(1.0f), x);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - org.telegram.messenger.g0.L(1.0f)), w);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, com.google.android.recaptcha.internal.a.y(f13 - org.telegram.messenger.g0.L(1.0f), this.h / 4, f10, this.h / 4), x);
            }
        }
        canvas.restore();
        if (this.r != null) {
            int f14 = i0.a.f(Utilities.i(this.c, 1.0f, 0.0f), this.b, this.a);
            if (this.n != f14) {
                Drawable drawable = this.r;
                this.n = f14;
                drawable.setColorFilter(new PorterDuffColorFilter(f14, PorterDuff.Mode.SRC_IN));
            }
            this.r.setBounds((int) ((getWidth() / 2.0f) - (this.r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.r.getIntrinsicHeight() / 2.0f)), (int) ((this.r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.r.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        this.b = i3;
        invalidate();
    }

    public void setCheckedColor(int i3) {
        this.a = i3;
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        this.n = 0;
        this.r = drawable;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.c == f10) {
            return;
        }
        this.c = f10;
        invalidate();
    }

    public void setSize(int i3) {
        if (this.h == i3) {
            return;
        }
        this.h = i3;
    }
}
