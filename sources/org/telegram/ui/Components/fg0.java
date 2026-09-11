package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class fg0 extends Drawable {
    public final Paint a;
    public final int b;
    public boolean c;
    public float d;
    public long e;
    public View f;
    public int g = 255;
    public float h = 300.0f;

    public fg0(int i10) {
        this.b = AndroidUtilities.dp(i10);
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
        int i10;
        Canvas canvas2;
        zd0 zd0Var;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j3 = currentAnimationTimeMillis - this.e;
        this.e = currentAnimationTimeMillis;
        if (j3 > 18) {
            j3 = 16;
        }
        boolean z10 = this.c;
        if (z10) {
            float f7 = this.d;
            if (f7 < 1.0f) {
                float f10 = (j3 / this.h) + f7;
                this.d = f10;
                if (f10 >= 1.0f) {
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
                canvas2.translate(com.google.android.gms.internal.vision.e2.z(1.0f, this.d, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
                float f11 = this.d * 500.0f;
                float interpolation = f11 >= 100.0f ? pr.j.getInterpolation(f11 / 100.0f) * (-5.0f) : f11 < 484.0f ? (pr.j.getInterpolation((f11 - 100.0f) / 384.0f) * 95.0f) - 5.0f : 90.0f;
                int i11 = this.b;
                canvas2.scale((i11 * 1.45f) / AndroidUtilities.dp(28.0f), (i11 * 1.5f) / AndroidUtilities.dp(28.0f));
                canvas2.rotate(interpolation);
                zd0Var = org.telegram.ui.ActionBar.j6.x3;
                if (zd0Var != null) {
                    Paint paint = this.a;
                    zd0Var.b(canvas2, paint, f11);
                    canvas2.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.j6.x3.b(canvas2, paint, f11);
                }
                canvas2.restore();
            }
        }
        if (!z10) {
            float f12 = this.d;
            if (f12 > 0.0f) {
                float f13 = f12 - (j3 / this.h);
                this.d = f13;
                if (f13 <= 0.0f) {
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
        canvas2.translate(com.google.android.gms.internal.vision.e2.z(1.0f, this.d, AndroidUtilities.dp(1.0f), bounds2.centerX()), bounds2.centerY());
        float f112 = this.d * 500.0f;
        if (f112 >= 100.0f) {
        }
        int i112 = this.b;
        canvas2.scale((i112 * 1.45f) / AndroidUtilities.dp(28.0f), (i112 * 1.5f) / AndroidUtilities.dp(28.0f));
        canvas2.rotate(interpolation);
        zd0Var = org.telegram.ui.ActionBar.j6.x3;
        if (zd0Var != null) {
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
