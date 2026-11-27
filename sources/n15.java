// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n15 extends Drawable {
    public static final PathInterpolator i = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    public final PathInterpolator a;
    public final GradientDrawable b;
    public final byte e;
    public final int[] f;
    public int g;
    public final Paint c = new Paint(1);
    public final Rect d = new Rect();
    public int h = jn7.d4;

    /* JADX WARN: Multi-variable type inference failed */
    public n15(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        this.a = i;
        this.f = new int[8];
        this.e = i2;
        if (i2 == 1) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        } else if (i2 == 2) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (i2 == 4) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        } else if (i2 == 8) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        }
        b(0);
    }

    public static void a(PathInterpolator pathInterpolator, int i2, int[] iArr) {
        int length = iArr.length - 1;
        int alpha = Color.alpha(i2);
        for (int i3 = length; i3 >= 0; i3--) {
            iArr[i3] = vm2.o(i2, (int) (pathInterpolator.getInterpolation((length - i3) / length) * alpha));
        }
    }

    public final void b(int i2) {
        if (this.g == i2) {
            return;
        }
        this.g = i2;
        PathInterpolator pathInterpolator = this.a;
        int[] iArr = this.f;
        a(pathInterpolator, i2, iArr);
        this.b.setColors(iArr);
        this.c.setColor(aob.p1(this.h / 255.0f, this.g));
    }

    public final void c(int i2, int i3) {
        Rect rect = this.d;
        if (rect.left == 0 && rect.top == i2 && rect.right == 0 && rect.bottom == i3) {
            return;
        }
        rect.set(0, i2, 0, i3);
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
        int i2;
        int i3;
        int i4;
        int i5;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            Paint paint = this.c;
            Rect rect = this.d;
            byte b = this.e;
            if (b == 1 && (i5 = rect.left) > 0) {
                canvas2 = canvas;
                canvas2.drawRect(bounds.left, bounds.top, Math.min(bounds.right, r2 + i5), bounds.bottom, paint);
            } else if (b == 2 && (i4 = rect.top) > 0) {
                float f = bounds.left;
                int i6 = bounds.top;
                float f2 = i6;
                float f3 = bounds.right;
                float min = Math.min(bounds.bottom, i6 + i4);
                canvas2 = canvas;
                canvas2.drawRect(f, f2, f3, min, paint);
            } else if (b == 4 && (i3 = rect.right) > 0) {
                canvas2 = canvas;
                canvas2.drawRect(Math.max(bounds.left, bounds.right - i3), bounds.top, bounds.right, bounds.bottom, paint);
            } else if (b == 8 && (i2 = rect.bottom) > 0) {
                canvas2 = canvas;
                canvas2.drawRect(bounds.left, Math.max(bounds.top, bounds.bottom - i2), bounds.right, bounds.bottom, paint);
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
        int i2 = rect.left;
        Rect rect2 = this.d;
        this.b.setBounds(i2 + rect2.left, rect.top + rect2.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.h = i2;
        this.b.setAlpha(i2);
        this.c.setColor(aob.p1(this.h / 255.0f, this.g));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}
