package m;

import android.graphics.Path;
import android.graphics.Rect;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f3 {
    public boolean a;
    public boolean b;
    public Object c = new Path();
    public Object d = new Rect();

    public boolean a(Rect rect, boolean z4, boolean z10) {
        Rect rect2 = (Rect) this.d;
        boolean z11 = (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.a == z10 && this.b == z4 && z10 && z4) ? false : true;
        this.a = z10;
        this.b = z4;
        rect2.set(rect);
        return z11;
    }
}
