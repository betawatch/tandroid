package androidx.emoji2.text;

import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e extends j7.t {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // j7.t
    public final void a(Throwable th2) {
        ((l) this.a.c).d(th2);
    }

    @Override // j7.t
    public final void b(com.google.firebase.messaging.s sVar) {
        f fVar = this.a;
        fVar.b = sVar;
        fVar.a = new bf.b((com.google.firebase.messaging.s) fVar.b, new ab.a(2), ((l) fVar.c).h);
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
