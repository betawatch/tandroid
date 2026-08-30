package k1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.k implements dd.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, int i10) {
        super(1);
        this.b = i10;
        this.c = obj;
    }

    @Override // dd.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((d0) this.c).f.d(new h(th2));
                }
                Object obj2 = d0.s;
                d0 d0Var = (d0) this.c;
                synchronized (obj2) {
                    d0.r.remove(d0Var.b().getAbsolutePath());
                }
                return sc.i.a;
            default:
                ((ud.h) this.c).b();
                return sc.i.a;
        }
    }
}
