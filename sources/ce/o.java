package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class o implements d {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final kd.j d;

    public o(kotlin.jvm.internal.o oVar, d dVar, ka.b bVar) {
        this.b = oVar;
        this.c = dVar;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    @Override // ce.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, id.c cVar) {
        n nVar;
        int i7;
        o oVar;
        switch (this.a) {
            case 0:
                if (cVar instanceof n) {
                    nVar = (n) cVar;
                    int i10 = nVar.e;
                    if ((i10 & TLObject.FLAG_31) != 0) {
                        nVar.e = i10 - TLObject.FLAG_31;
                        Object obj2 = nVar.c;
                        jd.a aVar = jd.a.a;
                        i7 = nVar.e;
                        gd.k kVar = gd.k.a;
                        if (i7 != 0) {
                            af.b.c(obj2);
                            if (((kotlin.jvm.internal.o) this.b).a) {
                                d dVar = (d) this.c;
                                nVar.e = 1;
                                if (dVar.a(obj, nVar) == aVar) {
                                    return aVar;
                                }
                                return kVar;
                            }
                            ka.b bVar = (ka.b) this.d;
                            nVar.a = this;
                            nVar.b = obj;
                            nVar.e = 2;
                            obj2 = bVar.invoke(obj, nVar);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            oVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return kVar;
                        }
                        if (i7 != 1) {
                            if (i7 == 2) {
                                obj = nVar.b;
                                oVar = nVar.a;
                                af.b.c(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((kotlin.jvm.internal.o) oVar.b).a = true;
                                    d dVar2 = (d) oVar.c;
                                    nVar.a = null;
                                    nVar.b = null;
                                    nVar.e = 3;
                                    if (dVar2.a(obj, nVar) == aVar) {
                                        return aVar;
                                    }
                                }
                                return kVar;
                            }
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        af.b.c(obj2);
                        return kVar;
                    }
                }
                nVar = new n(this, cVar);
                Object obj22 = nVar.c;
                jd.a aVar2 = jd.a.a;
                i7 = nVar.e;
                gd.k kVar2 = gd.k.a;
                if (i7 != 0) {
                }
            default:
                Object a10 = de.g.a((id.h) this.b, obj, this.c, (be.l) this.d, cVar);
                return a10 == jd.a.a ? a10 : gd.k.a;
        }
    }

    public o(d dVar, id.h hVar) {
        this.b = hVar;
        this.c = ee.a.k(hVar);
        this.d = new be.l(dVar, (id.c) null, 3);
    }
}
