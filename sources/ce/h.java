package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class h implements c {
    public final /* synthetic */ ia.d a;
    public final /* synthetic */ m1.n b;

    public h(ia.d dVar, m1.n nVar) {
        this.a = dVar;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(d dVar, kd.c cVar) {
        g gVar;
        jd.a aVar;
        int i7;
        h hVar;
        z zVar;
        m1.n nVar;
        de.h hVar2;
        Throwable th2;
        de.h hVar3;
        m1.n nVar2;
        try {
            if (cVar instanceof g) {
                gVar = (g) cVar;
                int i10 = gVar.b;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    gVar.b = i10 - TLObject.FLAG_31;
                    Object obj = gVar.a;
                    aVar = jd.a.a;
                    i7 = gVar.b;
                    if (i7 != 0) {
                        af.b.c(obj);
                        try {
                            ia.d dVar2 = this.a;
                            gVar.d = this;
                            gVar.e = dVar;
                            gVar.b = 1;
                            if (dVar2.G(dVar, gVar) != aVar) {
                                hVar = this;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            hVar = this;
                            zVar = new z(th);
                            nVar = hVar.b;
                            gVar.d = th;
                            gVar.e = null;
                            gVar.b = 2;
                            if (x.a(zVar, nVar, th, gVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                        return aVar;
                    }
                    if (i7 != 1) {
                        if (i7 == 2) {
                            Throwable th4 = (Throwable) gVar.d;
                            af.b.c(obj);
                            throw th4;
                        }
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        hVar3 = (de.h) gVar.d;
                        try {
                            af.b.c(obj);
                            hVar3.releaseIntercepted();
                            return gd.k.a;
                        } catch (Throwable th5) {
                            th2 = th5;
                            hVar3.releaseIntercepted();
                            throw th2;
                        }
                    }
                    dVar = gVar.e;
                    hVar = (h) gVar.d;
                    try {
                        af.b.c(obj);
                    } catch (Throwable th6) {
                        th = th6;
                        zVar = new z(th);
                        nVar = hVar.b;
                        gVar.d = th;
                        gVar.e = null;
                        gVar.b = 2;
                        if (x.a(zVar, nVar, th, gVar) != aVar) {
                        }
                    }
                    hVar2 = new de.h(dVar, gVar.getContext());
                    nVar2 = hVar.b;
                    gVar.d = hVar2;
                    gVar.e = null;
                    gVar.b = 3;
                    if (nVar2.b(hVar2, null, gVar) != aVar) {
                        hVar3 = hVar2;
                        hVar3.releaseIntercepted();
                        return gd.k.a;
                    }
                    return aVar;
                }
            }
            nVar2 = hVar.b;
            gVar.d = hVar2;
            gVar.e = null;
            gVar.b = 3;
            if (nVar2.b(hVar2, null, gVar) != aVar) {
            }
            return aVar;
        } catch (Throwable th7) {
            th2 = th7;
            hVar3 = hVar2;
            hVar3.releaseIntercepted();
            throw th2;
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.a;
        aVar = jd.a.a;
        i7 = gVar.b;
        if (i7 != 0) {
        }
        hVar2 = new de.h(dVar, gVar.getContext());
    }
}
