package lc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final int b;
    public transient String c;

    public a(String str, int i10) {
        this.a = str;
        this.b = i10;
    }

    public final String toString() {
        if (this.c == null) {
            this.c = String.format("%s:%d", this.a, Integer.valueOf(this.b));
        }
        return this.c;
    }
}
