package bg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.l6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class c0 extends Drawable {
    public static final PathInterpolator i = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    public final Interpolator a;
    public final GradientDrawable b;
    public final int e;
    public final int[] f;
    public int g;
    public final Paint c = new Paint(1);
    public final Rect d = new Rect();
    public int h = qs.e4;

    public c0(int i7) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        this.a = i;
        this.f = new int[8];
        this.e = i7;
        if (i7 == 1) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        } else if (i7 == 2) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (i7 == 4) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        } else if (i7 == 8) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        }
        b(0);
    }

    public static void a(Interpolator interpolator, int i7, int[] iArr) {
        int length = iArr.length - 1;
        int alpha = Color.alpha(i7);
        for (int i10 = length; i10 >= 0; i10--) {
            iArr[i10] = i0.a.o(i7, (int) (interpolator.getInterpolation((length - i10) / length) * alpha));
        }
    }

    public final void b(int i7) {
        if (this.g == i7) {
            return;
        }
        this.g = i7;
        Interpolator interpolator = this.a;
        int[] iArr = this.f;
        a(interpolator, i7, iArr);
        this.b.setColors(iArr);
        this.c.setColor(l6.r1(this.h / 255.0f, this.g));
    }

    public final void c(int i7, int i10) {
        Rect rect = this.d;
        if (rect.left == 0 && rect.top == i7 && rect.right == 0 && rect.bottom == i10) {
            return;
        }
        rect.set(0, i7, 0, i10);
        onBoundsChange(getBounds());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        GradientDrawable gradientDrawable;
        int i7;
        int i10;
        int i11;
        int i12;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            Paint paint = this.c;
            Rect rect = this.d;
            int i13 = this.e;
            if (i13 == 1 && (i12 = rect.left) > 0) {
                canvas2 = canvas;
                canvas2.drawRect(bounds.left, bounds.top, Math.min(bounds.right, r2 + i12), bounds.bottom, paint);
            } else if (i13 == 2 && (i11 = rect.top) > 0) {
                float f10 = bounds.left;
                int i14 = bounds.top;
                float f11 = i14;
                float f12 = bounds.right;
                float min = Math.min(bounds.bottom, i14 + i11);
                canvas2 = canvas;
                canvas2.drawRect(f10, f11, f12, min, paint);
            } else if (i13 == 4 && (i10 = rect.right) > 0) {
                canvas2 = canvas;
                canvas2.drawRect(Math.max(bounds.left, bounds.right - i10), bounds.top, bounds.right, bounds.bottom, paint);
            } else if (i13 == 8 && (i7 = rect.bottom) > 0) {
                canvas2 = canvas;
                canvas2.drawRect(bounds.left, Math.max(bounds.top, bounds.bottom - i7), bounds.right, bounds.bottom, paint);
            }
            gradientDrawable = this.b;
            if (gradientDrawable.getBounds().isEmpty()) {
                gradientDrawable.draw(canvas2);
                return;
            }
            return;
        }
        canvas2 = canvas;
        gradientDrawable = this.b;
        if (gradientDrawable.getBounds().isEmpty()) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int i7 = rect.left;
        Rect rect2 = this.d;
        this.b.setBounds(i7 + rect2.left, rect.top + rect2.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.h = i7;
        this.b.setAlpha(i7);
        this.c.setColor(l6.r1(this.h / 255.0f, this.g));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}
