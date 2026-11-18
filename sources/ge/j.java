package ge;

import zd.b0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class j extends i {
    public final Runnable c;

    public j(long j3, boolean z10, Runnable runnable) {
        super(j3, z10);
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
