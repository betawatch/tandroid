package androidx.emoji2.text;

import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends g7.u {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // g7.u
    public final void a(Throwable th) {
        ((l) this.a.c).d(th);
    }

    @Override // g7.u
    public final void b(com.google.firebase.messaging.t tVar) {
        f fVar = this.a;
        fVar.b = tVar;
        fVar.a = new xe.b((com.google.firebase.messaging.t) fVar.b, new xa.a(1), ((l) fVar.c).h);
        l lVar = (l) fVar.c;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        lVar.a.writeLock().lock();
        try {
            lVar.c = 1;
            arrayList.addAll(lVar.b);
            lVar.b.clear();
            lVar.a.writeLock().unlock();
            lVar.d.post(new j(arrayList, lVar.c, (Throwable) null));
        } catch (Throwable th) {
            lVar.a.writeLock().unlock();
            throw th;
        }
    }
}
