package androidx.activity;

import android.window.BackEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        int c2 = aVar.c(backEvent);
        this.a = d;
        this.b = e10;
        this.c = b10;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
