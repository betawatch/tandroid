package la;

import android.util.Log;
import bd.p;
import i7.c7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends uc.i implements p {
    public /* synthetic */ Object a;

    @Override // uc.a
    public final sc.c create(Object obj, sc.c cVar) {
        c cVar2 = new c(2, cVar);
        cVar2.a = obj;
        return cVar2;
    }

    @Override // bd.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((String) obj, (sc.c) obj2);
        qc.i iVar = qc.i.a;
        cVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        c7.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.a));
        return qc.i.a;
    }
}
