// default package

import android.window.BackEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fd0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public fd0(BackEvent backEvent) {
        xn xnVar = xn.a;
        float d = xnVar.d(backEvent);
        float e = xnVar.e(backEvent);
        float b = xnVar.b(backEvent);
        int c = xnVar.c(backEvent);
        this.a = d;
        this.b = e;
        this.c = b;
        this.d = c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
