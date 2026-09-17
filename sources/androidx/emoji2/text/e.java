package androidx.emoji2.text;

import java.util.ArrayList;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class e extends v7.w {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // v7.w
    public final void a(Throwable th2) {
        ((l) this.a.b).d(th2);
    }

    @Override // v7.w
    public final void b(com.google.firebase.messaging.s sVar) {
        f fVar = this.a;
        fVar.c = sVar;
        fVar.a = new pf.b((com.google.firebase.messaging.s) fVar.c, new t7.u(2), ((l) fVar.b).h);
        l lVar = (l) fVar.b;
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
