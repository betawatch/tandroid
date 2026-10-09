package androidx.mediarouter.app;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
