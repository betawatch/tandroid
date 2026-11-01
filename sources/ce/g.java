package ce;

import k1.z;
import ld.l;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.j implements l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i10) {
        super(1);
        this.b = i10;
        this.c = obj;
    }

    @Override // ld.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((i) this.c).b();
                return ad.j.a;
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((z) this.c).f.d(new k1.g(th2));
                }
                Object obj2 = z.s;
                z zVar = (z) this.c;
                synchronized (obj2) {
                    z.r.remove(zVar.b().getAbsolutePath());
                }
                return ad.j.a;
        }
    }
}
