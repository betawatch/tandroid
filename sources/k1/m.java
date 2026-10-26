package k1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
