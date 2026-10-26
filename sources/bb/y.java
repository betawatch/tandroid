package bb;

import a8.jd;
import android.util.Log;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class y extends nd.i implements ud.q {
    public int a;
    public /* synthetic */ fe.c b;
    public /* synthetic */ Throwable c;

    @Override // ud.q
    public final Object a(Object obj, Object obj2, nd.c cVar) {
        y yVar = new y(3, cVar);
        yVar.b = (fe.c) obj;
        yVar.c = (Throwable) obj2;
        return yVar.invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            jd.b(obj);
            fe.c cVar = this.b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.c);
            n1.b bVar = new n1.b(true);
            this.b = null;
            this.a = 1;
            if (cVar.b(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jd.b(obj);
        }
        return jd.i.a;
    }
}
