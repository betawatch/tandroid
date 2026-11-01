package androidx.mediarouter.app;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class y {
    public final Object a;
    public final int b;

    public y(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else {
            if (!(obj instanceof p4.w)) {
                throw new IllegalArgumentException();
            }
            this.b = 2;
        }
    }
}
