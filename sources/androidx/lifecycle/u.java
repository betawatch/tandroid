package androidx.lifecycle;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class u {
    public n a;
    public r b;

    public final void a(t tVar, m mVar) {
        n a10 = mVar.a();
        n state1 = this.a;
        kotlin.jvm.internal.j.e(state1, "state1");
        if (a10.compareTo(state1) < 0) {
            state1 = a10;
        }
        this.a = state1;
        this.b.d(tVar, mVar);
        this.a = a10;
    }
}
