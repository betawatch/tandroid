package bb;

import android.util.Log;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
