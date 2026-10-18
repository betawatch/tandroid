package k1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.j implements td.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i10) {
        super(1);
        this.b = i10;
        this.c = obj;
    }

    @Override // td.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((z) this.c).f.d(new g(th2));
                }
                Object obj2 = z.s;
                z zVar = (z) this.c;
                synchronized (obj2) {
                    z.r.remove(zVar.c().getAbsolutePath());
                }
                return id.i.a;
            default:
                ((ke.h) this.c).b();
                return id.i.a;
        }
    }
}
