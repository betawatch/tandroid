package lf;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import hg.j1;
import org.telegram.ui.cp0;
import org.telegram.ui.w3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class q0 {
    public static final j1 a = new j1(2);
    public static final j1 b = new j1(3);
    public static Path c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, cp0 cp0Var, w3 w3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = cp0Var.getOutlineProvider();
        if (canvas.isHardwareAccelerated() || Build.VERSION.SDK_INT < 24 || !cp0Var.getClipToOutline() || outlineProvider == null) {
            w3Var.run(canvas);
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
        outlineProvider.getOutline(cp0Var, outline);
        path2.rewind();
        if (outline.isEmpty() || !outline.getRect(rect)) {
            w3Var.run(canvas);
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
        w3Var.run(canvas);
        canvas.restoreToCount(save);
    }
}
