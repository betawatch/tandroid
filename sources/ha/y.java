package ha;

import android.util.Log;
import g7.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y extends sc.i implements zc.q {
    public int a;
    public /* synthetic */ kd.c b;
    public /* synthetic */ Throwable c;

    @Override // zc.q
    public final Object a(Object obj, Object obj2, sc.c cVar) {
        y yVar = new y(3, cVar);
        yVar.b = (kd.c) obj;
        yVar.c = (Throwable) obj2;
        return yVar.invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        rc.a aVar = rc.a.a;
        int i9 = this.a;
        if (i9 == 0) {
            y5.b(obj);
            kd.c cVar = this.b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.c);
            n1.b bVar = new n1.b(true);
            this.b = null;
            this.a = 1;
            if (cVar.c(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.b(obj);
        }
        return oc.i.a;
    }
}
