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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class RadioButton extends View {
    public static Paint s;
    public static Paint v;
    public static Paint w;
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
        this.h = AndroidUtilities.dp(16.0f);
        if (s == null) {
            Paint paint = new Paint(1);
            s = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            s.setStyle(Paint.Style.STROKE);
            w = new Paint(1);
            Paint paint2 = new Paint(1);
            v = paint2;
            paint2.setColor(0);
            v.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    public final void a(boolean z4, boolean z10) {
        if (z4 == this.f) {
            return;
        }
        this.f = z4;
        if (this.e && z10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z4 ? 1.0f : 0.0f);
            this.d = ofFloat;
            ofFloat.setDuration(200L);
            this.d.start();
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setProgress(z4 ? 1.0f : 0.0f);
    }

    public final void b(int i10, int i11) {
        this.b = i10;
        this.a = i11;
        invalidate();
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
            w.setColor(this.b);
            f10 = this.c / 0.5f;
        } else {
            f10 = 2.0f - (f11 / 0.5f);
            float f12 = 1.0f - f10;
            int rgb = Color.rgb(Color.red(this.b) + ((int) ((Color.red(this.a) - r4) * f12)), Color.green(this.b) + ((int) ((Color.green(this.a) - r7) * f12)), Color.blue(this.b) + ((int) ((Color.blue(this.a) - r9) * f12)));
            s.setColor(rgb);
            w.setColor(rgb);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f13 = (this.h / 2) - ((f10 + 1.0f) * AndroidUtilities.density);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13, s);
        if (this.r == null) {
            if (this.c <= 0.5f) {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f13 - AndroidUtilities.dp(1.0f), w);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f10) * (f13 - AndroidUtilities.dp(1.0f)), v);
            } else {
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, e2.c.w(f13 - AndroidUtilities.dp(1.0f), this.h / 4, f10, this.h / 4), w);
            }
        }
        canvas.restore();
        if (this.r != null) {
            int d = i0.a.d(Utilities.clamp(this.c, 1.0f, 0.0f), this.b, this.a);
            if (this.n != d) {
                Drawable drawable = this.r;
                this.n = d;
                drawable.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            this.r.setBounds((int) ((getWidth() / 2.0f) - (this.r.getIntrinsicWidth() / 2.0f)), (int) ((getHeight() / 2.0f) - (this.r.getIntrinsicHeight() / 2.0f)), (int) ((this.r.getIntrinsicWidth() / 2.0f) + (getWidth() / 2.0f)), (int) ((this.r.getIntrinsicHeight() / 2.0f) + (getHeight() / 2.0f)));
            this.r.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.b = i10;
        invalidate();
    }

    public void setCheckedColor(int i10) {
        this.a = i10;
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

    public void setSize(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
    }
}
