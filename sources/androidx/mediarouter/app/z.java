package androidx.mediarouter.app;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class z {
    public final Object a;
    public final int b;

    public z(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else {
            if (!(obj instanceof p4.v)) {
                throw new IllegalArgumentException();
            }
            this.b = 2;
        }
    }
}
