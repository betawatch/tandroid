package a4;

import h5.w;
import r3.m;
import r3.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public bf.b j = new bf.b((char) 0, 1);

    public void a(long j10) {
        this.g = j10;
    }

    public abstract long b(w wVar);

    public abstract boolean c(w wVar, long j10, bf.b bVar);

    public void d(boolean z4) {
        if (z4) {
            this.j = new bf.b((char) 0, 1);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
