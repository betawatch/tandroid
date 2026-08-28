package af;

import android.app.PictureInPictureParams;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final Rect a = new Rect();
    public final Point b = new Point();

    public final PictureInPictureParams.Builder a() {
        int i9;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        Point point = this.b;
        int i10 = point.x;
        if (i10 <= 0 || (i9 = point.y) <= 0) {
            builder.setAspectRatio(null);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(null);
            }
        } else {
            double d = i10 / i9;
            Rational rational = d < 0.45d ? new Rational(45, 100) : d > 2.35d ? new Rational(235, 100) : new Rational(point.x, point.y);
            builder.setAspectRatio(rational);
            if (Build.VERSION.SDK_INT >= 33) {
                builder.setExpandedAspectRatio(rational);
            }
        }
        Rect rect = this.a;
        if (rect.isEmpty()) {
            builder.setSourceRectHint(null);
            return builder;
        }
        builder.setSourceRectHint(rect);
        return builder;
    }

    public final boolean b() {
        if (this.a.isEmpty()) {
            return false;
        }
        Point point = this.b;
        return point.x > 0 && point.y > 0;
    }

    public final boolean c(int i9, int i10) {
        Point point = this.b;
        if (point.x == i9 && point.y == i10) {
            return false;
        }
        point.set(i9, i10);
        return true;
    }
}
