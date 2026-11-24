// default package

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class faa extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ haa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ faa(haa haaVar, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = haaVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        haa haaVar = this.c;
        switch (b) {
            case 0:
                return new faa(haaVar, px2Var, (byte) 0);
            default:
                return new faa(haaVar, px2Var, (byte) 1);
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ky2 ky2Var = (ky2) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
        }
        return ((faa) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        haa haaVar = this.c;
        ly2 ly2Var = ly2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    tue.b(obj);
                    im4 data = haaVar.b.getData();
                    final AtomicReference atomicReference = haaVar.c;
                    jm4 jm4Var = new jm4() { // from class: eaa
                        @Override // jm4
                        public final Object c(Object obj2, px2 px2Var) {
                            atomicReference.set((v7a) obj2);
                            return g7c.a;
                        }

                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof jm4) && (obj2 instanceof eaa)) {
                                return new fa(atomicReference).equals(new fa(atomicReference));
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return ((((((((((AtomicReference.class.hashCode() + ((atomicReference != null ? r1.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + 1237) * 31) + 2) * 31) + 2;
                        }
                    };
                    this.b = true;
                    if (data.g(jm4Var, this) == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (!z) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                return g7c.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        tue.b(obj);
                        return obj;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                im4 data2 = haaVar.b.getData();
                this.b = true;
                Object a = lje.a(data2, this);
                return a == ly2Var ? ly2Var : a;
        }
    }
}
