package androidx.lifecycle;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements r {
    public final e a;
    public final r b;

    public DefaultLifecycleObserverAdapter(e eVar, r rVar) {
        this.a = eVar;
        this.b = rVar;
    }

    @Override // androidx.lifecycle.r
    public final void d(t tVar, m mVar) {
        int i10 = f.a[mVar.ordinal()];
        e eVar = this.a;
        switch (i10) {
            case 1:
                eVar.b(tVar);
                break;
            case 2:
                eVar.i(tVar);
                break;
            case 3:
                eVar.a(tVar);
                break;
            case 4:
                eVar.e(tVar);
                break;
            case 5:
                eVar.f(tVar);
                break;
            case 6:
                eVar.h(tVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        r rVar = this.b;
        if (rVar != null) {
            rVar.d(tVar, mVar);
        }
    }
}
