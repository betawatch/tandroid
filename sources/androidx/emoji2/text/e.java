package androidx.emoji2.text;

import java.util.ArrayList;
import n4.y;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
    public final void b(com.google.firebase.messaging.t tVar) {
        f fVar = this.a;
        fVar.c = tVar;
        fVar.a = new y((com.google.firebase.messaging.t) fVar.c, new rb.a(2), ((l) fVar.b).h);
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
