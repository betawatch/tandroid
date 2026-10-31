package bb;

import android.util.Log;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y extends ed.j implements ld.q {
    public int a;
    public /* synthetic */ wd.c b;
    public /* synthetic */ Throwable c;

    @Override // ld.q
    public final Object a(Object obj, Object obj2, ed.c cVar) {
        y yVar = new y(3, cVar);
        yVar.b = (wd.c) obj;
        yVar.c = (Throwable) obj2;
        return yVar.invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        dd.a aVar = dd.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            l9.b.b(obj);
            wd.c cVar = this.b;
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
            l9.b.b(obj);
        }
        return ad.j.a;
    }
}
