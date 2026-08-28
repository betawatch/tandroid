package m;

import android.graphics.Path;
import android.graphics.Rect;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f3 {
    public boolean a;
    public boolean b;
    public Object c = new Path();
    public Object d = new Rect();

    public boolean a(Rect rect, boolean z10, boolean z11) {
        Rect rect2 = (Rect) this.d;
        boolean z12 = (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.a == z11 && this.b == z10 && z11 && z10) ? false : true;
        this.a = z11;
        this.b = z10;
        rect2.set(rect);
        return z12;
    }
}
