package androidx.emoji2.text;

import a8.t6;
import ab.b0;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e extends t6 {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // a8.t6
    public final void a(Throwable th2) {
        ((l) this.a.b).d(th2);
    }

    @Override // a8.t6
    public final void b(b0 b0Var) {
        f fVar = this.a;
        fVar.c = b0Var;
        fVar.a = new wf.b((b0) fVar.c, new nb.a(3), ((l) fVar.b).h);
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
