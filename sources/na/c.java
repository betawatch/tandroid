package na;

import android.util.Log;
import dd.p;
import k7.p7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c extends wc.i implements p {
    public /* synthetic */ Object a;

    @Override // wc.a
    public final uc.c create(Object obj, uc.c cVar) {
        c cVar2 = new c(2, cVar);
        cVar2.a = obj;
        return cVar2;
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((String) obj, (uc.c) obj2);
        sc.i iVar = sc.i.a;
        cVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.a;
        p7.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.a));
        return sc.i.a;
    }
}
