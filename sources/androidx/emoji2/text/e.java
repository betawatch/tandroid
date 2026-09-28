package androidx.emoji2.text;

import java.util.ArrayList;
import v7.y;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class e extends y {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // v7.y
    public final void a(Throwable th2) {
        ((l) this.a.b).d(th2);
    }

    @Override // v7.y
    public final void b(com.google.firebase.messaging.t tVar) {
        f fVar = this.a;
        fVar.c = tVar;
        fVar.a = new n4.y((com.google.firebase.messaging.t) fVar.c, new rb.a(2), ((l) fVar.b).h);
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
