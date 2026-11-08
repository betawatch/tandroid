package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class he0 extends Drawable {
    public final Paint a;
    public final int b;
    public boolean c;
    public float d;
    public long e;
    public View f;
    public int g = org.telegram.messenger.qs.e4;
    public float h = 300.0f;

    public he0(int i7) {
        this.b = org.telegram.messenger.g0.L(i7);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z9, boolean z10) {
        if (this.c != z9) {
            this.c = z9;
            if (!z10) {
                this.d = z9 ? 1.0f : 0.0f;
            }
            this.e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int i7;
        Canvas canvas2;
        lc0 lc0Var;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j3 = currentAnimationTimeMillis - this.e;
        this.e = currentAnimationTimeMillis;
        if (j3 > 18) {
            j3 = 16;
        }
        boolean z9 = this.c;
        if (z9) {
            float f10 = this.d;
            if (f10 < 1.0f) {
                float f11 = (j3 / this.h) + f10;
                this.d = f11;
                if (f11 >= 1.0f) {
                    this.d = 1.0f;
                } else {
                    View view = this.f;
                    if (view != null) {
                        view.invalidate();
                    }
                    invalidateSelf();
                }
                Rect bounds = getBounds();
                i7 = this.g;
                if (i7 != 255) {
                    canvas.save();
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i7, 31);
                }
                canvas2.translate(com.google.android.recaptcha.internal.a.z(1.0f, this.d, org.telegram.messenger.g0.L(1.0f), bounds.centerX()), bounds.centerY());
                float f12 = this.d * 500.0f;
                float interpolation = f12 >= 100.0f ? xq.j.getInterpolation(f12 / 100.0f) * (-5.0f) : f12 < 484.0f ? (xq.j.getInterpolation((f12 - 100.0f) / 384.0f) * 95.0f) - 5.0f : 90.0f;
                int i10 = this.b;
                canvas2.scale((i10 * 1.45f) / org.telegram.messenger.g0.L(28.0f), (i10 * 1.5f) / org.telegram.messenger.g0.L(28.0f));
                canvas2.rotate(interpolation);
                lc0Var = org.telegram.ui.ActionBar.k6.x3;
                if (lc0Var != null) {
                    Paint paint = this.a;
                    lc0Var.b(canvas2, paint, f12);
                    canvas2.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.k6.x3.b(canvas2, paint, f12);
                }
                canvas2.restore();
            }
        }
        if (!z9) {
            float f13 = this.d;
            if (f13 > 0.0f) {
                float f14 = f13 - (j3 / this.h);
                this.d = f14;
                if (f14 <= 0.0f) {
                    this.d = 0.0f;
                } else {
                    View view2 = this.f;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    invalidateSelf();
                }
            }
        }
        Rect bounds2 = getBounds();
        i7 = this.g;
        if (i7 != 255) {
        }
        canvas2.translate(com.google.android.recaptcha.internal.a.z(1.0f, this.d, org.telegram.messenger.g0.L(1.0f), bounds2.centerX()), bounds2.centerY());
        float f122 = this.d * 500.0f;
        if (f122 >= 100.0f) {
        }
        int i102 = this.b;
        canvas2.scale((i102 * 1.45f) / org.telegram.messenger.g0.L(28.0f), (i102 * 1.5f) / org.telegram.messenger.g0.L(28.0f));
        canvas2.rotate(interpolation);
        lc0Var = org.telegram.ui.ActionBar.k6.x3;
        if (lc0Var != null) {
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.g = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
