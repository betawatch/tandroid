package androidx.activity;

import android.window.BackEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public b(BackEvent backEvent) {
        a aVar = a.a;
        float d = aVar.d(backEvent);
        float e6 = aVar.e(backEvent);
        float b10 = aVar.b(backEvent);
        int c3 = aVar.c(backEvent);
        this.a = d;
        this.b = e6;
        this.c = b10;
        this.d = c3;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
