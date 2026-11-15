package a4;

import f3.i0;
import f3.q;
import h2.x;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class j {
    public i0 b;
    public q c;
    public h d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final f a = new f();
    public q4.q j = new q4.q(1, false);

    public void a(long j3) {
        this.g = j3;
    }

    public abstract long b(x xVar);

    public abstract boolean c(x xVar, long j3, q4.q qVar);

    public void d(boolean z10) {
        if (z10) {
            this.j = new q4.q(1, false);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
