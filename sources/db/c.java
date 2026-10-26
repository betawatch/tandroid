package db;

import a8.jd;
import android.util.Log;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c extends nd.i implements p {
    public /* synthetic */ Object a;

    @Override // nd.a
    public final ld.c create(Object obj, ld.c cVar) {
        c cVar2 = new c(2, cVar);
        cVar2.a = obj;
        return cVar2;
    }

    @Override // ud.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((String) obj, (ld.c) obj2);
        jd.i iVar = jd.i.a;
        cVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.a;
        jd.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.a));
        return jd.i.a;
    }
}
