package ae;

import b8.ib;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q implements zd.c {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final hd.j d;

    public q(kotlin.jvm.internal.o oVar, zd.c cVar, ja.b bVar) {
        this.b = oVar;
        this.c = cVar;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    @Override // zd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, fd.c cVar) {
        zd.m mVar;
        int i3;
        q qVar;
        switch (this.a) {
            case 0:
                Object a10 = i.a((fd.h) this.b, obj, this.c, (d) this.d, cVar);
                return a10 == gd.a.a ? a10 : dd.k.a;
            default:
                if (cVar instanceof zd.m) {
                    mVar = (zd.m) cVar;
                    int i10 = mVar.e;
                    if ((i10 & TLObject.FLAG_31) != 0) {
                        mVar.e = i10 - TLObject.FLAG_31;
                        Object obj2 = mVar.c;
                        gd.a aVar = gd.a.a;
                        i3 = mVar.e;
                        dd.k kVar = dd.k.a;
                        if (i3 != 0) {
                            ib.b(obj2);
                            if (((kotlin.jvm.internal.o) this.b).a) {
                                zd.c cVar2 = (zd.c) this.c;
                                mVar.e = 1;
                                if (cVar2.b(obj, mVar) == aVar) {
                                    return aVar;
                                }
                                return kVar;
                            }
                            ja.b bVar = (ja.b) this.d;
                            mVar.a = this;
                            mVar.b = obj;
                            mVar.e = 2;
                            obj2 = bVar.invoke(obj, mVar);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            qVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return kVar;
                        }
                        if (i3 != 1) {
                            if (i3 == 2) {
                                obj = mVar.b;
                                qVar = mVar.a;
                                ib.b(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((kotlin.jvm.internal.o) qVar.b).a = true;
                                    zd.c cVar3 = (zd.c) qVar.c;
                                    mVar.a = null;
                                    mVar.b = null;
                                    mVar.e = 3;
                                    if (cVar3.b(obj, mVar) == aVar) {
                                        return aVar;
                                    }
                                }
                                return kVar;
                            }
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        ib.b(obj2);
                        return kVar;
                    }
                }
                mVar = new zd.m(this, cVar);
                Object obj22 = mVar.c;
                gd.a aVar2 = gd.a.a;
                i3 = mVar.e;
                dd.k kVar2 = dd.k.a;
                if (i3 != 0) {
                }
        }
    }

    public q(zd.c cVar, fd.h hVar) {
        this.b = hVar;
        this.c = be.a.k(hVar);
        this.d = new d(cVar, (fd.c) null, 2);
    }
}
