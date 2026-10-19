package fe;

import ee.o;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class b {
    public o[] a;
    public int b;
    public int c;

    public final void b(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.b - 1;
                this.b = i10;
                if (i10 == 0) {
                    this.c = 0;
                }
                kotlin.jvm.internal.i.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                oVar.a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
