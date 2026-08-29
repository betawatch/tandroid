package androidx.emoji2.text;

import h7.e0;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends e0 {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // h7.e0
    public final void a(Throwable th2) {
        ((l) this.a.c).d(th2);
    }

    @Override // h7.e0
    public final void b(com.google.firebase.messaging.s sVar) {
        f fVar = this.a;
        fVar.b = sVar;
        com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) fVar.b;
        new ya.a(2);
        d dVar = ((l) fVar.c).h;
        ze.b bVar = new ze.b();
        bVar.a = sVar2;
        bVar.b = dVar;
        fVar.a = bVar;
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
