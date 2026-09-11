package bb;

import android.util.Log;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class d extends kd.j implements p {
    public /* synthetic */ Object a;

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        d dVar = new d(2, cVar);
        dVar.a = obj;
        return dVar;
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) create((String) obj, (id.c) obj2);
        gd.i iVar = gd.i.a;
        dVar.invokeSuspend(iVar);
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
