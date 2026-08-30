package androidx.mediarouter.app;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a0 {
    public final Object a;
    public final int b;

    public a0(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else {
            if (!(obj instanceof c2.a0)) {
                throw new IllegalArgumentException();
            }
            this.b = 2;
        }
    }
}
