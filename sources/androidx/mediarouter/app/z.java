package androidx.mediarouter.app;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
