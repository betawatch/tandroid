package jf;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class r {
    public static final Rect a = new Rect();

    static {
        new RectF();
    }

    public static void a(Canvas canvas, Drawable drawable, float f9, float f10, float f11) {
        float dpf2 = f9 - AndroidUtilities.dpf2(36.0f);
        float dpf22 = f10 - AndroidUtilities.dpf2(36.0f);
        float dpf23 = f11 / AndroidUtilities.dpf2(72.0f);
        d(drawable, AndroidUtilities.dpf2(9.66f) + dpf2, AndroidUtilities.dpf2(4.66f) + dpf22, 53);
        canvas.save();
        canvas.scale(dpf23, dpf23, f9, f10);
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void b(Canvas canvas, Drawable drawable, float f9) {
        if (drawable == null || f9 == 0.0f) {
            return;
        }
        if (f9 == 1.0f) {
            drawable.draw(canvas);
            return;
        }
        canvas.save();
        canvas.scale(f9, f9, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void c(Rect rect, float f9, float f10, int i10, int i11, int i12) {
        int i13 = i12 & 7;
        int round = i13 != 3 ? i13 != 5 ? Math.round(f9 - (i10 / 2.0f)) : Math.round(f9 - i10) : Math.round(f9);
        int i14 = i12 & 112;
        int round2 = i14 != 48 ? i14 != 80 ? Math.round(f10 - (i11 / 2.0f)) : Math.round(f10 - i11) : Math.round(f10);
        rect.set(round, round2, i10 + round, i11 + round2);
    }

    public static void d(Drawable drawable, float f9, float f10, int i10) {
        if (drawable == null) {
            return;
        }
        e(drawable, f9, f10, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), i10);
    }

    public static void e(Drawable drawable, float f9, float f10, int i10, int i11, int i12) {
        if (drawable != null) {
            Rect rect = a;
            c(rect, f9, f10, i10, i11, i12);
            drawable.setBounds(rect);
        }
    }

    public static void f(ImageReceiver imageReceiver, float f9, float f10, int i10, int i11) {
        if (imageReceiver != null) {
            Rect rect = a;
            c(rect, f9, f10, i10, i11, 17);
            imageReceiver.setImageCoords(rect);
        }
    }

    public static void g(NinePatchDrawable ninePatchDrawable, int i10, int i11, int i12, int i13) {
        Rect rect = a;
        if (ninePatchDrawable.getPadding(rect)) {
            ninePatchDrawable.setBounds(i10 - rect.left, i11 - rect.top, i12 + rect.right, i13 + rect.bottom);
        } else {
            ninePatchDrawable.setBounds(i10, i11, i12, i13);
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
