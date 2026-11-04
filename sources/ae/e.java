package ae;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements g {
    public final fd.h a;
    public final int b;
    public final yd.a c;
    public final /* synthetic */ int d;
    public final Object e;

    public e(Object obj, fd.h hVar, int i3, yd.a aVar, int i10) {
        this.d = i10;
        this.a = hVar;
        this.b = i3;
        this.c = aVar;
        this.e = obj;
    }

    @Override // zd.b
    public Object U(zd.c cVar, hd.c cVar2) {
        Object a10;
        switch (this.d) {
            case 0:
                int i3 = this.b;
                dd.k kVar = dd.k.a;
                if (i3 == -3) {
                    fd.h context = cVar2.getContext();
                    Boolean bool = Boolean.FALSE;
                    j jVar = new j(10);
                    fd.h hVar = this.a;
                    fd.h plus = !((Boolean) hVar.fold(bool, jVar)).booleanValue() ? context.plus(hVar) : b0.h(context, hVar, false);
                    if (kotlin.jvm.internal.j.a(plus, context)) {
                        a10 = ((zd.b) this.e).U(cVar, cVar2);
                        gd.a aVar = gd.a.a;
                        if (a10 != aVar) {
                            a10 = kVar;
                        }
                        if (a10 != aVar) {
                            return kVar;
                        }
                    } else {
                        fd.d dVar = fd.d.a;
                        if (kotlin.jvm.internal.j.a(plus.get(dVar), context.get(dVar))) {
                            fd.h context2 = cVar2.getContext();
                            if (!(cVar instanceof o)) {
                                cVar = new q(cVar, context2);
                            }
                            a10 = i.a(plus, cVar, be.a.k(plus), new d(this, (fd.c) null, 1), cVar2);
                            if (a10 != gd.a.a) {
                                return kVar;
                            }
                        }
                    }
                    return a10;
                }
                a10 = a(cVar, cVar2);
                if (a10 != gd.a.a) {
                    return kVar;
                }
                return a10;
            default:
                return a(cVar, cVar2);
        }
    }

    public final Object a(zd.c cVar, hd.c cVar2) {
        Object e10 = b0.e(new c(cVar, this, (fd.c) null), cVar2);
        return e10 == gd.a.a ? e10 : dd.k.a;
    }

    public final String b() {
        ArrayList arrayList = new ArrayList(4);
        fd.i iVar = fd.i.a;
        fd.h hVar = this.a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i3 = this.b;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        yd.a aVar = yd.a.a;
        yd.a aVar2 = this.c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + ed.g.g(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // ae.g
    public final zd.b h(fd.h hVar, int i3, yd.a aVar) {
        yd.a aVar2;
        fd.h hVar2 = this.a;
        fd.h plus = hVar.plus(hVar2);
        yd.a aVar3 = yd.a.a;
        yd.a aVar4 = this.c;
        int i10 = this.b;
        if (aVar != aVar3) {
            aVar2 = aVar;
        } else {
            if (i10 != -3) {
                if (i3 != -3) {
                    if (i10 != -2) {
                        if (i3 != -2) {
                            i3 += i10;
                            if (i3 < 0) {
                                i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                        }
                    }
                }
                i3 = i10;
            }
            aVar2 = aVar4;
        }
        int i11 = i3;
        if (kotlin.jvm.internal.j.a(plus, hVar2) && i11 == i10 && aVar2 == aVar4) {
            return this;
        }
        switch (this.d) {
            case 0:
                return new e((zd.b) this.e, plus, i11, aVar2, 0);
            default:
                return new e((c) this.e, plus, i11, aVar2, 1);
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                return ((zd.b) this.e) + " -> " + b();
            default:
                return "block[" + ((c) this.e) + "] -> " + b();
        }
    }
}
