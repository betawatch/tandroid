package androidx.emoji2.text;

import a8.i1;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e extends i1 {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // a8.i1
    public final void a(Throwable th2) {
        ((l) this.a.b).d(th2);
    }

    @Override // a8.i1
    public final void b(com.google.firebase.messaging.q qVar) {
        f fVar = this.a;
        fVar.c = qVar;
        fVar.a = new n4.s((com.google.firebase.messaging.q) fVar.c, new pa.d(), ((l) fVar.b).h);
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
