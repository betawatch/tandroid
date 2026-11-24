// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class kq3 {
    public static final Rect a = new Rect();

    public static void a(Canvas canvas, Drawable drawable, float f, float f2, float f3) {
        float N = f - gl.N(36.0f);
        float N2 = f2 - gl.N(36.0f);
        float N3 = f3 / gl.N(72.0f);
        d(drawable, gl.N(9.66f) + N, gl.N(4.66f) + N2, 53);
        canvas.save();
        canvas.scale(N3, N3, f, f2);
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void b(Canvas canvas, Drawable drawable, float f) {
        if (drawable == null || f == 0.0f) {
            return;
        }
        if (f == 1.0f) {
            drawable.draw(canvas);
            return;
        }
        canvas.save();
        canvas.scale(f, f, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void c(Rect rect, float f, float f2, int i, int i2, int i3) {
        int i4 = i3 & 7;
        int round = i4 != 3 ? i4 != 5 ? Math.round(f - (i / 2.0f)) : Math.round(f - i) : Math.round(f);
        int i5 = i3 & kk7.w1;
        int round2 = i5 != 48 ? i5 != 80 ? Math.round(f2 - (i2 / 2.0f)) : Math.round(f2 - i2) : Math.round(f2);
        rect.set(round, round2, i + round, i2 + round2);
    }

    public static void d(Drawable drawable, float f, float f2, int i) {
        if (drawable == null) {
            return;
        }
        e(drawable, f, f2, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), i);
    }

    public static void e(Drawable drawable, float f, float f2, int i, int i2, int i3) {
        if (drawable != null) {
            Rect rect = a;
            c(rect, f, f2, i, i2, i3);
            drawable.setBounds(rect);
        }
    }

    public static void f(ImageReceiver imageReceiver, float f, float f2, int i, int i2) {
        if (imageReceiver != null) {
            Rect rect = a;
            c(rect, f, f2, i, i2, 17);
            imageReceiver.j0(rect);
        }
    }

    public static void g(Drawable drawable, int i, int i2, int i3, int i4) {
        Rect rect = a;
        if (drawable.getPadding(rect)) {
            drawable.setBounds(i - rect.left, i2 - rect.top, i3 + rect.right, i4 + rect.bottom);
        } else {
            drawable.setBounds(i, i2, i3, i4);
        }
    }

    public static void h(NinePatchDrawable ninePatchDrawable, Rect rect) {
        Rect rect2 = a;
        if (ninePatchDrawable.getPadding(rect2)) {
            ninePatchDrawable.setBounds(rect.left - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        } else {
            ninePatchDrawable.setBounds(rect);
        }
    }
}
