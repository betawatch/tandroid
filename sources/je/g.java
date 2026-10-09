package je;

import k1.a0;
import sd.l;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    @Override // sd.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((i) this.c).b();
                return hd.i.a;
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((a0) this.c).f.d(new k1.g(th2));
                }
                Object obj2 = a0.s;
                a0 a0Var = (a0) this.c;
                synchronized (obj2) {
                    a0.r.remove(a0Var.b().getAbsolutePath());
                }
                return hd.i.a;
        }
    }
}
