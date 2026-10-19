package androidx.mediarouter.app;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class y {
    public final Object a;
    public final int b;

    public y(Object obj) {
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
