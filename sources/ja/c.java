package ja;

import android.util.Log;
import g7.y5;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends sc.i implements p {
    public /* synthetic */ Object a;

    @Override // sc.a
    public final qc.c create(Object obj, qc.c cVar) {
        c cVar2 = new c(2, cVar);
        cVar2.a = obj;
        return cVar2;
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((String) obj, (qc.c) obj2);
        oc.i iVar = oc.i.a;
        cVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        rc.a aVar = rc.a.a;
        y5.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.a));
        return oc.i.a;
    }
}
