// default package

import android.window.BackEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
