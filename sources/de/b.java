package de;

import ce.p;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class b {
    public p[] a;
    public int b;
    public int c;

    public final void b(p pVar) {
        synchronized (this) {
            try {
                int i10 = this.b - 1;
                this.b = i10;
                if (i10 == 0) {
                    this.c = 0;
                }
                kotlin.jvm.internal.i.c(pVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                pVar.a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
