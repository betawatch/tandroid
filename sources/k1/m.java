package k1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.j implements zc.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i9) {
        super(1);
        this.b = i9;
        this.c = obj;
    }

    @Override // zc.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((z) this.c).f.d(new g(th));
                }
                Object obj2 = z.s;
                z zVar = (z) this.c;
                synchronized (obj2) {
                    z.r.remove(zVar.b().getAbsolutePath());
                }
                return oc.i.a;
            default:
                ((qd.h) this.c).b();
                return oc.i.a;
        }
    }
}
