package bb;

import android.util.Log;
import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c extends ld.j implements p {
    public /* synthetic */ Object a;

    @Override // ld.a
    public final jd.c create(Object obj, jd.c cVar) {
        c cVar2 = new c(2, cVar);
        cVar2.a = obj;
        return cVar2;
    }

    @Override // sd.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((String) obj, (jd.c) obj2);
        hd.i iVar = hd.i.a;
        cVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        kd.a aVar = kd.a.a;
        a8.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.a));
        return hd.i.a;
    }
}
