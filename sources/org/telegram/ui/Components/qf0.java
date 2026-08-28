package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qf0 extends Drawable {
    public final Paint a;
    public final int b;
    public boolean c;
    public float d;
    public long e;
    public View f;
    public int g = 255;
    public float h = 300.0f;

    public qf0(int i9) {
        this.b = AndroidUtilities.dp(i9);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.c != z10) {
            this.c = z10;
            if (!z11) {
                this.d = z10 ? 1.0f : 0.0f;
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
        int i9;
        Canvas canvas2;
        fd0 fd0Var;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j10 = currentAnimationTimeMillis - this.e;
        this.e = currentAnimationTimeMillis;
        if (j10 > 18) {
            j10 = 16;
        }
        boolean z10 = this.c;
        if (z10) {
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
                i9 = this.g;
                if (i9 != 255) {
                    canvas.save();
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i9, 31);
                }
                canvas2.translate(e2.c.z(1.0f, this.d, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                float f12 = this.d * 500.0f;
                float interpolation = f12 >= 100.0f ? gr.j.getInterpolation(f12 / 100.0f) * (-5.0f) : f12 < 484.0f ? (gr.j.getInterpolation((f12 - 100.0f) / 384.0f) * 95.0f) - 5.0f : 90.0f;
                int i10 = this.b;
                canvas2.scale((i10 * 1.45f) / AndroidUtilities.dp(28.0f), (i10 * 1.5f) / AndroidUtilities.dp(28.0f));
                canvas2.rotate(interpolation);
                fd0Var = org.telegram.ui.ActionBar.f6.x3;
                if (fd0Var != null) {
                    Paint paint = this.a;
                    fd0Var.b(canvas2, paint, f12);
                    canvas2.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.f6.x3.b(canvas2, paint, f12);
                }
                canvas2.restore();
            }
        }
        if (!z10) {
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
        i9 = this.g;
        if (i9 != 255) {
        }
        canvas2.translate(e2.c.z(1.0f, this.d, AndroidUtilities.dp(1.0f), bounds2.centerX()), bounds2.centerY());
        float f122 = this.d * 500.0f;
        if (f122 >= 100.0f) {
        }
        int i102 = this.b;
        canvas2.scale((i102 * 1.45f) / AndroidUtilities.dp(28.0f), (i102 * 1.5f) / AndroidUtilities.dp(28.0f));
        canvas2.rotate(interpolation);
        fd0Var = org.telegram.ui.ActionBar.f6.x3;
        if (fd0Var != null) {
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
    public final void setAlpha(int i9) {
        this.g = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
