package androidx.mediarouter.app;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class y {
    public final Object a;
    public final int b;

    public y(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else {
            if (!(obj instanceof s4.v)) {
                throw new IllegalArgumentException();
            }
            this.b = 2;
        }
    }
}
