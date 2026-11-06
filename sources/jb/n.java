package jb;

import ce.x;
import java.util.concurrent.atomic.AtomicReference;
import zd.z;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class n extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.c = pVar;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                return new n(this.c, cVar, 0);
            default:
                return new n(this.c, cVar, 1);
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.a) {
        }
        return ((n) create(zVar, cVar)).invokeSuspend(gd.k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                jd.a aVar = jd.a.a;
                int i7 = this.b;
                if (i7 == 0) {
                    af.b.c(obj);
                    p pVar = this.c;
                    ce.c data = pVar.b.getData();
                    final AtomicReference atomicReference = pVar.c;
                    ce.d dVar = new ce.d() { // from class: jb.m
                        @Override // ce.d
                        public final Object a(Object obj2, id.c cVar) {
                            atomicReference.set((i) obj2);
                            jd.a aVar2 = jd.a.a;
                            return gd.k.a;
                        }

                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof ce.d) && (obj2 instanceof m)) {
                                return new kotlin.jvm.internal.a(atomicReference).equals(new kotlin.jvm.internal.a(atomicReference));
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return ((((((((((AtomicReference.class.hashCode() + ((atomicReference != null ? r0.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + 1237) * 31) + 2) * 31) + 2;
                        }
                    };
                    this.b = 1;
                    if (data.B(dVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                return gd.k.a;
            default:
                jd.a aVar2 = jd.a.a;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                    return obj;
                }
                af.b.c(obj);
                ce.c data2 = this.c.b.getData();
                this.b = 1;
                Object d = x.d(data2, this);
                return d == aVar2 ? aVar2 : d;
        }
    }
}
