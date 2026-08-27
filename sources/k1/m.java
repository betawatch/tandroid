package k1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.k implements ad.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i10) {
        super(1);
        this.b = i10;
        this.c = obj;
    }

    @Override // ad.l
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
                return pc.i.a;
            default:
                ((rd.h) this.c).b();
                return pc.i.a;
        }
    }
}
