package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements r {
    public final s a;
    public final b b;

    public ReflectiveGenericLifecycleObserver(s sVar) {
        this.a = sVar;
        d dVar = d.c;
        Class<?> cls = sVar.getClass();
        b bVar = (b) dVar.a.get(cls);
        this.b = bVar == null ? dVar.a(cls, null) : bVar;
    }

    @Override // androidx.lifecycle.r
    public final void d(t tVar, m mVar) {
        HashMap hashMap = this.b.a;
        List list = (List) hashMap.get(mVar);
        s sVar = this.a;
        b.a(list, tVar, mVar, sVar);
        b.a((List) hashMap.get(m.ON_ANY), tVar, mVar, sVar);
    }
}
