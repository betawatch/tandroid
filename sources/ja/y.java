package ja;

import android.util.Log;
import i7.c7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y extends uc.i implements bd.q {
    public int a;
    public /* synthetic */ md.c b;
    public /* synthetic */ Throwable c;

    @Override // bd.q
    public final Object b(Object obj, Object obj2, uc.c cVar) {
        y yVar = new y(3, cVar);
        yVar.b = (md.c) obj;
        yVar.c = (Throwable) obj2;
        return yVar.invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            c7.b(obj);
            md.c cVar = this.b;
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
            c7.b(obj);
        }
        return qc.i.a;
    }
}
