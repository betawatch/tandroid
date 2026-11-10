package androidx.mediarouter.app;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
