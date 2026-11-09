package de;

import ce.y;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
