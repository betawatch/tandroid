package androidx.emoji2.text;

import java.util.ArrayList;
import n4.y;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        com.google.firebase.messaging.t tVar2 = (com.google.firebase.messaging.t) fVar.c;
        new rb.a(2);
        d dVar = ((l) fVar.b).h;
        y yVar = new y();
        yVar.a = tVar2;
        yVar.b = dVar;
        fVar.a = yVar;
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
