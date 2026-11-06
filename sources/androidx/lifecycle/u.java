package androidx.lifecycle;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
