package m1;

import java.io.File;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.k implements rd.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, int i7) {
        super(1);
        this.b = i7;
        this.c = obj;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                b0 b0Var = (b0) this.c;
                if (th2 != null) {
                    b0Var.h.h2(new l0(th2));
                }
                if (b0Var.j.b != gd.j.a) {
                    ((i0) b0Var.j.getValue()).close();
                }
                return gd.k.a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return new t0(((ee.c) this.c).a, it);
        }
    }
}
