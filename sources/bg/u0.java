package bg;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.r3;
import org.telegram.ui.zl0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class u0 {
    public static final q0 a = new q0(0);
    public static final q0 b = new q0(1);
    public static Path c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, zl0 zl0Var, r3 r3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = zl0Var.getOutlineProvider();
        if (canvas.isHardwareAccelerated() || Build.VERSION.SDK_INT < 24 || !zl0Var.getClipToOutline() || outlineProvider == null) {
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
        outlineProvider.getOutline(zl0Var, outline);
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
