package ab;

import android.util.Log;
import v7.i8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class y extends md.i implements td.q {
    public int a;
    public /* synthetic */ ee.c b;
    public /* synthetic */ Throwable c;

    @Override // td.q
    public final Object b(Object obj, Object obj2, md.c cVar) {
        y yVar = new y(3, cVar);
        yVar.b = (ee.c) obj;
        yVar.c = (Throwable) obj2;
        return yVar.invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            i8.b(obj);
            ee.c cVar = this.b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.c);
            n1.b bVar = new n1.b(true);
            this.b = null;
            this.a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8.b(obj);
        }
        return id.i.a;
    }
}
