package la;

import android.util.Log;
import k7.p7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class x extends wc.i implements dd.q {
    public int a;
    public /* synthetic */ od.c b;
    public /* synthetic */ Throwable c;

    @Override // dd.q
    public final Object a(Object obj, Object obj2, wc.c cVar) {
        x xVar = new x(3, cVar);
        xVar.b = (od.c) obj;
        xVar.c = (Throwable) obj2;
        return xVar.invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            p7.b(obj);
            od.c cVar = this.b;
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
            p7.b(obj);
        }
        return sc.i.a;
    }
}
