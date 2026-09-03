package androidx.emoji2.text;

import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
