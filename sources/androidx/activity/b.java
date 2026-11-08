package androidx.activity;

import android.window.BackEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public b(BackEvent backEvent) {
        a aVar = a.a;
        float d = aVar.d(backEvent);
        float e10 = aVar.e(backEvent);
        float b10 = aVar.b(backEvent);
        int c10 = aVar.c(backEvent);
        this.a = d;
        this.b = e10;
        this.c = b10;
        this.d = c10;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
