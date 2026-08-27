package ka;

import ad.p;
import android.util.Log;
import h7.k6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends tc.i implements p {
    public /* synthetic */ Object a;

    @Override // tc.a
    public final rc.c create(Object obj, rc.c cVar) {
        c cVar2 = new c(2, cVar);
        cVar2.a = obj;
        return cVar2;
    }

    @Override // ad.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((String) obj, (rc.c) obj2);
        pc.i iVar = pc.i.a;
        cVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.a;
        k6.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.a));
        return pc.i.a;
    }
}
