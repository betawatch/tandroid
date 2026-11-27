// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class h83 extends yfb implements ur4 {
    public Throwable a;
    public byte b;
    public final /* synthetic */ o83 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h83(o83 o83Var, zw2 zw2Var) {
        super(1, zw2Var);
        this.c = o83Var;
    }

    @Override // qf0
    public final zw2 create(zw2 zw2Var) {
        return new h83(this.c, zw2Var);
    }

    @Override // ur4
    public final Object invoke(Object obj) {
        return ((h83) create((zw2) obj)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r7 != r4) goto L14;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        i0b i0bVar;
        byte b = this.b;
        o83 o83Var = this.c;
        vx2 vx2Var = vx2.a;
        try {
        } catch (Throwable th2) {
            nr5 c = o83Var.c();
            this.a = th2;
            this.b = (byte) 2;
            Object b2 = c.b(this);
            if (b2 != vx2Var) {
                obj = b2;
                th = th2;
            }
            return vx2Var;
        }
        if (b == 0) {
            ixe.b(obj);
            this.b = (byte) 1;
            obj = o83Var.h(true, this);
        } else {
            if (b != 1) {
                if (b != 2) {
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = this.a;
                ixe.b(obj);
                i0bVar = new a59(((Number) obj).intValue(), th);
                return new rx7(i0bVar, Boolean.TRUE);
            }
            ixe.b(obj);
        }
        i0bVar = (i0b) obj;
        return new rx7(i0bVar, Boolean.TRUE);
    }
}
