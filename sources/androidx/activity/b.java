package androidx.activity;

import android.window.BackEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public b(BackEvent backEvent) {
        a aVar = a.a;
        float d = aVar.d(backEvent);
        float e = aVar.e(backEvent);
        float b10 = aVar.b(backEvent);
        int c3 = aVar.c(backEvent);
        this.a = d;
        this.b = e;
        this.c = b10;
        this.d = c3;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
