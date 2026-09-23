package bb;

import android.util.Log;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class c extends kd.j implements p {
    public /* synthetic */ Object a;

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        c cVar2 = new c(2, cVar);
        cVar2.a = obj;
        return cVar2;
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((String) obj, (id.c) obj2);
        gd.i iVar = gd.i.a;
        cVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        t7.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.a));
        return gd.i.a;
    }
}
