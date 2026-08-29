package androidx.mediarouter.app;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x {
    public final Object a;
    public final int b;

    public x(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else {
            if (!(obj instanceof c2.b0)) {
                throw new IllegalArgumentException();
            }
            this.b = 2;
        }
    }
}
