package ia;

import android.util.Log;
import h7.k6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z extends tc.i implements ad.q {
    public int a;
    public /* synthetic */ ld.c b;
    public /* synthetic */ Throwable c;

    @Override // ad.q
    public final Object a(Object obj, Object obj2, tc.c cVar) {
        z zVar = new z(3, cVar);
        zVar.b = (ld.c) obj;
        zVar.c = (Throwable) obj2;
        return zVar.invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            k6.b(obj);
            ld.c cVar = this.b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.c);
            n1.b bVar = new n1.b(true);
            this.b = null;
            this.a = 1;
            if (cVar.c(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k6.b(obj);
        }
        return pc.i.a;
    }
}
