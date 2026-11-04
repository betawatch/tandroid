package gb;

import b8.ib;
import java.util.concurrent.atomic.AtomicReference;
import wd.z;
import zd.v;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n extends hd.j implements od.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, fd.c cVar, int i3) {
        super(2, cVar);
        this.a = i3;
        this.c = pVar;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.a) {
            case 0:
                return new n(this.c, cVar, 0);
            default:
                return new n(this.c, cVar, 1);
        }
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        fd.c cVar = (fd.c) obj2;
        switch (this.a) {
        }
        return ((n) create(zVar, cVar)).invokeSuspend(dd.k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                gd.a aVar = gd.a.a;
                int i3 = this.b;
                if (i3 == 0) {
                    ib.b(obj);
                    p pVar = this.c;
                    zd.b data = pVar.b.getData();
                    final AtomicReference atomicReference = pVar.c;
                    zd.c cVar = new zd.c() { // from class: gb.m
                        @Override // zd.c
                        public final Object b(Object obj2, fd.c cVar2) {
                            atomicReference.set((i) obj2);
                            gd.a aVar2 = gd.a.a;
                            return dd.k.a;
                        }

                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof zd.c) && (obj2 instanceof m)) {
                                return new kotlin.jvm.internal.a(atomicReference).equals(new kotlin.jvm.internal.a(atomicReference));
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return ((((((((((AtomicReference.class.hashCode() + ((atomicReference != null ? r0.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + 1237) * 31) + 2) * 31) + 2;
                        }
                    };
                    this.b = 1;
                    if (data.U(cVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return dd.k.a;
            default:
                gd.a aVar2 = gd.a.a;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                    return obj;
                }
                ib.b(obj);
                zd.b data2 = this.c.b.getData();
                this.b = 1;
                Object d = v.d(data2, this);
                return d == aVar2 ? aVar2 : d;
        }
    }
}
