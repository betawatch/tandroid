package androidx.mediarouter.app;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
