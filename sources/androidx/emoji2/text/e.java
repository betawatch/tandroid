package androidx.emoji2.text;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends v7.t {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // v7.t
    public final void a(Throwable th2) {
        ((l) this.a.b).d(th2);
    }

    @Override // v7.t
    public final void b(ji.f fVar) {
        f fVar2 = this.a;
        fVar2.c = fVar;
        fVar2.a = new hf.b((ji.f) fVar2.c, new hb.a(2), ((l) fVar2.b).h);
        l lVar = (l) fVar2.b;
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
