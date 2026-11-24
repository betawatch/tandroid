// default package

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class f8a extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ h8a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8a(h8a h8aVar, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = h8aVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        h8a h8aVar = this.c;
        switch (b) {
            case 0:
                return new f8a(h8aVar, fw2Var, (byte) 0);
            default:
                return new f8a(h8aVar, fw2Var, (byte) 1);
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        ax2 ax2Var = (ax2) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
        }
        return ((f8a) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        h8a h8aVar = this.c;
        bx2 bx2Var = bx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    qse.b(obj);
                    hk4 data = h8aVar.b.getData();
                    final AtomicReference atomicReference = h8aVar.c;
                    ik4 ik4Var = new ik4() { // from class: e8a
                        @Override // ik4
                        public final Object c(Object obj2, fw2 fw2Var) {
                            atomicReference.set((t5a) obj2);
                            return g5c.a;
                        }

                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof ik4) && (obj2 instanceof e8a)) {
                                return new fa(atomicReference).equals(new fa(atomicReference));
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return ((((((((((AtomicReference.class.hashCode() + ((atomicReference != null ? r1.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + 1237) * 31) + 2) * 31) + 2;
                        }
                    };
                    this.b = true;
                    if (data.h(ik4Var, this) == bx2Var) {
                        return bx2Var;
                    }
                } else {
                    if (!z) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qse.b(obj);
                }
                return g5c.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        qse.b(obj);
                        return obj;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                hk4 data2 = h8aVar.b.getData();
                this.b = true;
                Object a = khe.a(data2, this);
                return a == bx2Var ? bx2Var : a;
        }
    }
}
