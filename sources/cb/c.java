package cb;

import android.util.Log;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class c extends md.i implements p {
    public /* synthetic */ Object a;

    @Override // md.a
    public final kd.c create(Object obj, kd.c cVar) {
        c cVar2 = new c(2, cVar);
        cVar2.a = obj;
        return cVar2;
    }

    @Override // td.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((String) obj, (kd.c) obj2);
        id.i iVar = id.i.a;
        cVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.a;
        i8.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.a));
        return id.i.a;
    }
}
