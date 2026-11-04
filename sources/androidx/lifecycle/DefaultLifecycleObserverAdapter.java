package androidx.lifecycle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        int i3 = f.a[mVar.ordinal()];
        e eVar = this.a;
        switch (i3) {
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
