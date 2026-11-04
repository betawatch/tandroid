package l1;

import b8.ib;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 extends hd.j implements od.p {
    public kotlin.jvm.internal.p a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kotlin.jvm.internal.p d;
    public final /* synthetic */ b0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kotlin.jvm.internal.p pVar, b0 b0Var, Object obj, boolean z10, fd.c cVar) {
        super(2, cVar);
        this.d = pVar;
        this.e = b0Var;
        this.f = obj;
        this.h = z10;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        a0 a0Var = new a0(this.d, this.e, this.f, this.h, cVar);
        a0Var.c = obj;
        return a0Var;
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((k0) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r6.b(r2, r7) == r0) goto L16;
     */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k0 k0Var;
        kotlin.jvm.internal.p pVar;
        gd.a aVar = gd.a.a;
        int i3 = this.b;
        Object obj2 = this.f;
        b0 b0Var = this.e;
        kotlin.jvm.internal.p pVar2 = this.d;
        if (i3 == 0) {
            ib.b(obj);
            k0 k0Var2 = (k0) this.c;
            m0 g7 = b0Var.g();
            this.c = k0Var2;
            this.a = pVar2;
            this.b = 1;
            Object a10 = g7.a(this);
            if (a10 != aVar) {
                k0Var = k0Var2;
                obj = a10;
                pVar = pVar2;
            }
            return aVar;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.b(obj);
            if (this.h) {
                b0Var.h.t2(new c(obj2, obj2 != null ? obj2.hashCode() : 0, pVar2.a));
            }
            return dd.k.a;
        }
        pVar = this.a;
        k0Var = (k0) this.c;
        ib.b(obj);
        pVar.a = ((Number) obj).intValue();
        this.c = null;
        this.a = null;
        this.b = 2;
    }
}
