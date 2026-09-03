package androidx.mediarouter.app;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a0 {
    public final Object a;
    public final int b;

    public a0(Object obj) {
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
