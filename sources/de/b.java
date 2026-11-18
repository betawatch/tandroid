package de;

import ce.y;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class b {
    public y[] a;
    public int b;
    public int c;

    public final void b(y yVar) {
        synchronized (this) {
            try {
                int i7 = this.b - 1;
                this.b = i7;
                if (i7 == 0) {
                    this.c = 0;
                }
                kotlin.jvm.internal.j.c(yVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                yVar.a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
