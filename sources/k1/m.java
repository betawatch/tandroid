package k1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.j implements ud.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i10) {
        super(1);
        this.b = i10;
        this.c = obj;
    }

    @Override // ud.l
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
                    z.r.remove(zVar.b().getAbsolutePath());
                }
                return jd.i.a;
            default:
                ((le.h) this.c).b();
                return jd.i.a;
        }
    }
}
