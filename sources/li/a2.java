package li;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class a2 extends Drawable implements Drawable.Callback {
    public final Drawable a;
    public final Paint b;
    public final Path c;
    public final RectF d;
    public final Outline e;
    public boolean f;
    public final boolean h;
    public boolean n;

    public a2(Drawable drawable) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        this.d = new RectF();
        this.e = new Outline();
        this.f = true;
        this.a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        this.h = true;
        a(m6.I.q());
    }

    public final void a(boolean z9) {
        this.n = z9;
        this.b.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, org.telegram.messenger.g0.L(4.0f), m6.r1(z9 ? 0.3f : 0.1f, -16777216));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float radius;
        if (this.h && this.n != m6.I.q()) {
            a(!this.n);
        }
        boolean z9 = this.f;
        Drawable drawable = this.a;
        Path path = this.c;
        if (z9) {
            Outline outline = this.e;
            path.reset();
            Rect bounds = getBounds();
            RectF rectF = this.d;
            rectF.set(bounds);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    drawable.getOutline(outline);
                    radius = outline.getRadius();
                } catch (Throwable unused) {
                }
                if (radius <= 0.0f) {
                    path.addRoundRect(rectF, radius, radius, Path.Direction.CW);
                } else {
                    path.addRect(rectF, Path.Direction.CW);
                }
                this.f = false;
            }
            radius = -1.0f;
            if (radius <= 0.0f) {
            }
            this.f = false;
        }
        canvas.drawPath(path, this.b);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
        this.f = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.a.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        this.a.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        this.a.setHotspotBounds(i7, i10, i11, i12);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
