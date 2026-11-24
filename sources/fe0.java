// default package

import android.window.BackEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fe0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public fe0(BackEvent backEvent) {
        yo yoVar = yo.a;
        float d = yoVar.d(backEvent);
        float e = yoVar.e(backEvent);
        float b = yoVar.b(backEvent);
        int c = yoVar.c(backEvent);
        this.a = d;
        this.b = e;
        this.c = b;
        this.d = c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
