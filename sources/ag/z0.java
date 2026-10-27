package ag;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.ip0;
import org.telegram.ui.t3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class z0 {
    public static final v0 a = new v0(0);
    public static final v0 b = new v0(1);
    public static Path c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, ip0 ip0Var, t3 t3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = ip0Var.getOutlineProvider();
        if (canvas.isHardwareAccelerated() || Build.VERSION.SDK_INT < 24 || !ip0Var.getClipToOutline() || outlineProvider == null) {
            t3Var.run(canvas);
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
        outlineProvider.getOutline(ip0Var, outline);
        path2.rewind();
        if (outline.isEmpty() || !outline.getRect(rect)) {
            t3Var.run(canvas);
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
        t3Var.run(canvas);
        canvas.restoreToCount(save);
    }
}
