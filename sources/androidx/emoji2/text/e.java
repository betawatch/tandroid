package androidx.emoji2.text;

import b8.w0;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends w0 {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // b8.w0
    public final void a(Throwable th2) {
        ((l) this.a.b).d(th2);
    }

    @Override // b8.w0
    public final void b(ui.f fVar) {
        f fVar2 = this.a;
        fVar2.c = fVar;
        ui.f fVar3 = (ui.f) fVar2.c;
        new nb.a(2);
        d dVar = ((l) fVar2.b).h;
        p4.q qVar = new p4.q();
        qVar.a = fVar3;
        qVar.b = dVar;
        fVar2.a = qVar;
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
