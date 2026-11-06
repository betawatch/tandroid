package androidx.lifecycle;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int i7 = f.a[mVar.ordinal()];
        e eVar = this.a;
        switch (i7) {
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
