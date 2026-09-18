package ge;

import zd.e0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class j extends i {
    public final Runnable c;

    public j(Runnable runnable, long j3, com.google.android.gms.internal.cast.a aVar) {
        super(j3, aVar);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.run();
        } finally {
            this.b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.k(runnable));
        sb2.append(", ");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.b);
        sb2.append(']');
        return sb2.toString();
    }
}
