// default package

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class agc {
    public static final xj a = new xj(21);
    public static final xj b = new xj(22);
    public static Path c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, r28 r28Var, ci7 ci7Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = r28Var.getOutlineProvider();
        if (canvas.isHardwareAccelerated() || Build.VERSION.SDK_INT < 24 || !r28Var.getClipToOutline() || outlineProvider == null) {
            ci7Var.a(canvas);
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
        outlineProvider.getOutline(r28Var, outline);
        path2.rewind();
        if (outline.isEmpty() || !outline.getRect(rect)) {
            ci7Var.a(canvas);
            return;
        }
        float radius = outline.getRadius();
        float f = rect.left;
        float f2 = rect.top;
        if (radius > 0.0f) {
            path2.addRoundRect(f, f2, rect.right, rect.bottom, radius, radius, Path.Direction.CW);
        } else {
            path2.addRect(f, f2, rect.right, rect.bottom, Path.Direction.CW);
        }
        int save = canvas.save();
        canvas.clipPath(path2);
        ci7Var.a(canvas);
        canvas.restoreToCount(save);
    }
}
