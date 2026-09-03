package androidx.mediarouter.app;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
