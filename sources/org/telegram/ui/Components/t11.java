package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t11 extends View implements org.telegram.ui.ActionBar.c6 {
    public int a;
    public float b;
    public final Paint c;
    public final Paint d;
    public Drawable e;
    public boolean f;
    public int h;
    public final RectF n;

    public t11(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f = true;
        this.h = 0;
        this.n = new RectF();
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false);
        this.a = x02;
        paint.setColor(x02);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.f) {
            float L = org.telegram.messenger.g0.L(((this.h == 0 ? this.b : 1.0f) * 26.0f) + 6.0f);
            float width = getWidth();
            float height = getHeight();
            RectF rectF = this.n;
            rectF.set(0.0f, 0.0f, width, height);
            canvas2.drawRoundRect(rectF, L, L, this.c);
        }
        int i7 = this.h;
        Paint paint = this.d;
        if (i7 == 0) {
            float max = (Math.max(0.4f, this.b) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float A = (org.telegram.messenger.camera.q.A(21.0f, 2, getWidth()) * max) + org.telegram.messenger.g0.L(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(org.telegram.messenger.g0.L(21.0f), height2, A, height2, paint);
                double L2 = org.telegram.messenger.g0.L(9.0f) * max;
                float cos = (float) (A - (Math.cos(0.7853981633974483d) * L2));
                float sin = (float) (Math.sin(0.7853981633974483d) * L2);
                canvas2 = canvas;
                canvas2.drawLine(A, height2, cos, height2 - sin, paint);
                canvas2.drawLine(A, height2, cos, height2 + sin, paint);
            } else {
                canvas2 = canvas;
            }
        } else if (i7 == 1) {
            float L3 = org.telegram.messenger.g0.L(21.0f);
            float width2 = getWidth() - org.telegram.messenger.g0.L(21.0f);
            float height3 = getHeight() / 2.0f;
            canvas2.save();
            canvas2.translate((-org.telegram.messenger.g0.L(2.0f)) * this.b, 0.0f);
            canvas2.rotate(this.b * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.drawLine(L3 + ((width2 - L3) * this.b), height3, width2, height3, paint);
            int L4 = org.telegram.messenger.g0.L((this.b * (-1.0f)) + 9.0f);
            int L5 = org.telegram.messenger.g0.L((this.b * 7.0f) + 9.0f);
            double d = width2;
            double d2 = L4;
            double d10 = height3;
            canvas.drawLine(width2, height3, (float) (d - (Math.cos(0.7853981633974483d) * d2)), (float) ((Math.sin(0.7853981633974483d) * d2) + d10), paint);
            double d11 = L5;
            canvas2 = canvas;
            canvas2.drawLine(width2, height3, (float) (d - (Math.cos(0.7853981633974483d) * d11)), (float) (d10 - (Math.sin(0.7853981633974483d) * d11)), paint);
            canvas.restore();
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.e.setHotspotBounds(0, 0, getWidth(), getHeight());
            this.e.draw(canvas2);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.c.setColor(i7);
        invalidate();
    }

    public void setColor(int i7) {
        this.d.setColor(i7);
        invalidate();
    }

    public void setDrawBackground(boolean z9) {
        this.f = z9;
    }

    public void setProgress(float f10) {
        this.b = f10;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    public void setTransformType(int i7) {
        this.h = i7;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        Paint paint = this.c;
        try {
            if (paint.getColor() == this.a) {
                this.a = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false);
                int color = paint.getColor();
                int i7 = this.a;
                if (color != i7) {
                    paint.setColor(i7);
                    invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        Drawable drawable2 = this.e;
        return drawable2 != null && drawable == drawable2;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
