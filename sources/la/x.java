package la;

import android.util.Log;
import k7.q7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
            q7.b(obj);
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
            q7.b(obj);
        }
        return sc.i.a;
    }
}
