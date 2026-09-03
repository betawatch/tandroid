package a4;

import h5.w;
import r3.m;
import r3.v;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class j {
    public v b;
    public m c;
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
    public af.c j = new af.c((char) 0, 1);

    public void a(long j10) {
        this.g = j10;
    }

    public abstract long b(w wVar);

    public abstract boolean c(w wVar, long j10, af.c cVar);

    public void d(boolean z4) {
        if (z4) {
            this.j = new af.c((char) 0, 1);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
