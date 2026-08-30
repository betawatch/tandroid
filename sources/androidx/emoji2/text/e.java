package androidx.emoji2.text;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e extends j7.s {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // j7.s
    public final void a(Throwable th2) {
        ((l) this.a.c).d(th2);
    }

    @Override // j7.s
    public final void b(com.google.firebase.messaging.r rVar) {
        f fVar = this.a;
        fVar.b = rVar;
        fVar.a = new bf.b((com.google.firebase.messaging.r) fVar.b, new ab.a(2), ((l) fVar.c).h);
        l lVar = (l) fVar.c;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        lVar.a.writeLock().lock();
        try {
            lVar.c = 1;
            arrayList.addAll(lVar.b);
            lVar.b.clear();
            lVar.a.writeLock().unlock();
            lVar.d.post(new j(arrayList, lVar.c, (Throwable) null));
        } catch (Throwable th2) {
            lVar.a.writeLock().unlock();
            throw th2;
        }
    }
}
