package androidx.activity;

import android.window.BackEvent;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public b(BackEvent backEvent) {
        a aVar = a.a;
        float d = aVar.d(backEvent);
        float e7 = aVar.e(backEvent);
        float b10 = aVar.b(backEvent);
        int c10 = aVar.c(backEvent);
        this.a = d;
        this.b = e7;
        this.c = b10;
        this.d = c10;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
