package ae;

import zd.w;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b {
    public w[] a;
    public int b;
    public int c;

    public final void a(w wVar) {
        synchronized (this) {
            try {
                int i3 = this.b - 1;
                this.b = i3;
                if (i3 == 0) {
                    this.c = 0;
                }
                kotlin.jvm.internal.j.c(wVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                wVar.a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
