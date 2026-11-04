package l1;

import java.io.File;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.k implements od.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, int i3) {
        super(1);
        this.b = i3;
        this.c = obj;
    }

    @Override // od.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                b0 b0Var = (b0) this.c;
                if (th2 != null) {
                    b0Var.h.t2(new l0(th2));
                }
                if (b0Var.j.b != dd.j.a) {
                    ((i0) b0Var.j.getValue()).close();
                }
                return dd.k.a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return new t0(((be.c) this.c).a, it);
        }
    }
}
