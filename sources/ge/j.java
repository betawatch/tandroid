package ge;

import zd.b0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class j extends i {
    public final Runnable c;

    public j(long j3, boolean z9, Runnable runnable) {
        super(j3, z9);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(b0.j(runnable));
        sb2.append(", ");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.b ? "Blocking" : "Non-blocking");
        sb2.append(']');
        return sb2.toString();
    }
}
