package db;

import android.util.Log;
import ld.p;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends ed.j implements p {
    public /* synthetic */ Object a;

    @Override // ed.a
    public final cd.c create(Object obj, cd.c cVar) {
        c cVar2 = new c(2, cVar);
        cVar2.a = obj;
        return cVar2;
    }

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((String) obj, (cd.c) obj2);
        ad.j jVar = ad.j.a;
        cVar.invokeSuspend(jVar);
        return jVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        dd.a aVar = dd.a.a;
        l9.b.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.a));
        return ad.j.a;
    }
}
