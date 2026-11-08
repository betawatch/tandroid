package androidx.lifecycle;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
