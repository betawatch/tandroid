// default package

import android.window.BackEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hd0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public hd0(BackEvent backEvent) {
        yn ynVar = yn.a;
        float d = ynVar.d(backEvent);
        float e = ynVar.e(backEvent);
        float b = ynVar.b(backEvent);
        int c = ynVar.c(backEvent);
        this.a = d;
        this.b = e;
        this.c = b;
        this.d = c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
