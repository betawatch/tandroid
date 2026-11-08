package bg;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.r3;
import org.telegram.ui.wl0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class u0 {
    public static final q0 a = new q0(0);
    public static final q0 b = new q0(1);
    public static Path c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, wl0 wl0Var, r3 r3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = wl0Var.getOutlineProvider();
        if (canvas.isHardwareAccelerated() || Build.VERSION.SDK_INT < 24 || !wl0Var.getClipToOutline() || outlineProvider == null) {
            r3Var.a(canvas);
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (c == null) {
                c = new Path();
                d = new Outline();
                e = new Rect();
            }
            path = c;
            outline = d;
            rect = e;
            outline.setEmpty();
            rect.setEmpty();
        } else {
            path = new Path();
            outline = new Outline();
            rect = new Rect();
        }
        Path path2 = path;
        outlineProvider.getOutline(wl0Var, outline);
        path2.rewind();
        if (outline.isEmpty() || !outline.getRect(rect)) {
            r3Var.a(canvas);
            return;
        }
        float radius = outline.getRadius();
        if (radius > 0.0f) {
            path2.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, radius, radius, Path.Direction.CW);
        } else {
            path2.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        }
        int save = canvas.save();
        canvas.clipPath(path2);
        r3Var.a(canvas);
        canvas.restoreToCount(save);
    }
}
