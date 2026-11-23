package androidx.emoji2.text;

import a8.u6;
import ab.c0;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class e extends u6 {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // a8.u6
    public final void a(Throwable th2) {
        ((l) this.a.b).d(th2);
    }

    @Override // a8.u6
    public final void b(c0 c0Var) {
        f fVar = this.a;
        fVar.c = c0Var;
        fVar.a = new wf.b((c0) fVar.c, new pb.b(3), ((l) fVar.b).h);
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
