package ld;

import kd.o;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b {
    public o[] a;
    public int b;
    public int c;

    public final void a(o oVar) {
        synchronized (this) {
            try {
                int i9 = this.b - 1;
                this.b = i9;
                if (i9 == 0) {
                    this.c = 0;
                }
                kotlin.jvm.internal.i.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                oVar.a.set(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
