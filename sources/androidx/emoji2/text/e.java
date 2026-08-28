package androidx.emoji2.text;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends f7.w {
    public final /* synthetic */ a9.c a;

    public e(a9.c cVar) {
        this.a = cVar;
    }

    @Override // f7.w
    public final void a(Throwable th) {
        ((k) this.a.a).d(th);
    }

    @Override // f7.w
    public final void b(com.google.firebase.messaging.t tVar) {
        a9.c cVar = this.a;
        cVar.c = tVar;
        cVar.b = new we.b((com.google.firebase.messaging.t) cVar.c, new d7.u(2), ((k) cVar.a).h);
        k kVar = (k) cVar.a;
        kVar.getClass();
        ArrayList arrayList = new ArrayList();
        kVar.a.writeLock().lock();
        try {
            kVar.c = 1;
            arrayList.addAll(kVar.b);
            kVar.b.clear();
            kVar.a.writeLock().unlock();
            kVar.d.post(new i(arrayList, kVar.c, (Throwable) null));
        } catch (Throwable th) {
            kVar.a.writeLock().unlock();
            throw th;
        }
    }
}
