package androidx.emoji2.text;

import java.util.ArrayList;
import n4.y;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class e extends v7.x {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // v7.x
    public final void a(Throwable th2) {
        ((l) this.a.b).d(th2);
    }

    @Override // v7.x
    public final void b(com.google.firebase.messaging.s sVar) {
        f fVar = this.a;
        fVar.c = sVar;
        fVar.a = new y((com.google.firebase.messaging.s) fVar.c, new rb.a(2), ((l) fVar.b).h);
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
