package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ng0 extends Drawable {
    public final Paint a;
    public final int b;
    public boolean c;
    public float d;
    public long e;
    public View f;
    public int g = 255;
    public float h = 300.0f;

    public ng0(int i10) {
        this.b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z4, boolean z10) {
        if (this.c != z4) {
            this.c = z4;
            if (!z10) {
                this.d = z4 ? 1.0f : 0.0f;
            }
            this.e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        de0 de0Var;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j10 = currentAnimationTimeMillis - this.e;
        this.e = currentAnimationTimeMillis;
        if (j10 > 18) {
            j10 = 16;
        }
        boolean z4 = this.c;
        if (z4) {
            float f10 = this.d;
            if (f10 < 1.0f) {
                float f11 = (j10 / this.h) + f10;
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
                i10 = this.g;
                if (i10 != 255) {
                    canvas.save();
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10, 31);
                }
                canvas2.translate(e2.c.w(1.0f, this.d, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                float f12 = this.d * 500.0f;
                float interpolation = f12 >= 100.0f ? mr.j.getInterpolation(f12 / 100.0f) * (-5.0f) : f12 < 484.0f ? (mr.j.getInterpolation((f12 - 100.0f) / 384.0f) * 95.0f) - 5.0f : 90.0f;
                int i11 = this.b;
                canvas2.scale((i11 * 1.45f) / AndroidUtilities.dp(28.0f), (i11 * 1.5f) / AndroidUtilities.dp(28.0f));
                canvas2.rotate(interpolation);
                de0Var = org.telegram.ui.ActionBar.j6.x3;
                if (de0Var != null) {
                    Paint paint = this.a;
                    de0Var.b(canvas2, paint, f12);
                    canvas2.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.j6.x3.b(canvas2, paint, f12);
                }
                canvas2.restore();
            }
        }
        if (!z4) {
            float f13 = this.d;
            if (f13 > 0.0f) {
                float f14 = f13 - (j10 / this.h);
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
        i10 = this.g;
        if (i10 != 255) {
        }
        canvas2.translate(e2.c.w(1.0f, this.d, AndroidUtilities.dp(1.0f), bounds2.centerX()), bounds2.centerY());
        float f122 = this.d * 500.0f;
        if (f122 >= 100.0f) {
        }
        int i112 = this.b;
        canvas2.scale((i112 * 1.45f) / AndroidUtilities.dp(28.0f), (i112 * 1.5f) / AndroidUtilities.dp(28.0f));
        canvas2.rotate(interpolation);
        de0Var = org.telegram.ui.ActionBar.j6.x3;
        if (de0Var != null) {
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
    public final void setAlpha(int i10) {
        this.g = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
