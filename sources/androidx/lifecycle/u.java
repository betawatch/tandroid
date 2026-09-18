package androidx.lifecycle;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class u {
    public n a;
    public r b;

    public final void a(t tVar, m mVar) {
        n a2 = mVar.a();
        n state1 = this.a;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (a2.compareTo(state1) < 0) {
            state1 = a2;
        }
        this.a = state1;
        this.b.d(tVar, mVar);
        this.a = a2;
    }
}
