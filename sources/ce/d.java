package ce;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d implements k {
    public final c[] a;

    public d(c[] cVarArr) {
        this.a = cVarArr;
    }

    @Override // ce.k
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.a) {
            p0 p0Var = cVar.f;
            if (p0Var == null) {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
            p0Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
