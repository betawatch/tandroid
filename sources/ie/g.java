package ie;

import k1.a0;
import rd.l;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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

    @Override // rd.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((i) this.c).b();
                return gd.i.a;
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((a0) this.c).f.d(new k1.g(th2));
                }
                Object obj2 = a0.s;
                a0 a0Var = (a0) this.c;
                synchronized (obj2) {
                    a0.r.remove(a0Var.c().getAbsolutePath());
                }
                return gd.i.a;
        }
    }
}
