package androidx.mediarouter.app;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
