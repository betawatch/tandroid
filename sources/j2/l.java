package j2;

import b8.zb;
import java.util.ArrayDeque;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class l implements e {
    public final k a;
    public final h[] e;
    public final j[] f;
    public int g;
    public int h;
    public h i;
    public f j;
    public boolean k;
    public boolean l;
    public int m;
    public final Object b = new Object();
    public long n = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public l(h[] hVarArr, j[] jVarArr) {
        this.e = hVarArr;
        this.g = hVarArr.length;
        for (int i3 = 0; i3 < this.g; i3++) {
            this.e[i3] = f();
        }
        this.f = jVarArr;
        this.h = jVarArr.length;
        for (int i10 = 0; i10 < this.h; i10++) {
            this.f[i10] = g();
        }
        k kVar = new k(this);
        this.a = kVar;
        kVar.start();
    }

    @Override // j2.e
    public final void a(long j10) {
        boolean z10;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length && !this.k) {
                    z10 = false;
                    zb.p(z10);
                    this.n = j10;
                }
                z10 = true;
                zb.p(z10);
                this.n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j2.e
    public final Object d() {
        h hVar;
        synchronized (this.b) {
            try {
                f fVar = this.j;
                if (fVar != null) {
                    throw fVar;
                }
                zb.p(this.i == null);
                int i3 = this.g;
                if (i3 == 0) {
                    hVar = null;
                } else {
                    h[] hVarArr = this.e;
                    int i10 = i3 - 1;
                    this.g = i10;
                    hVar = hVarArr[i10];
                }
                this.i = hVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public abstract h f();

    @Override // j2.e
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                h hVar = this.i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    hVarArr[i3] = hVar;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    h hVar2 = (h) this.c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    hVarArr2[i10] = hVar2;
                }
                while (!this.d.isEmpty()) {
                    ((j) this.d.removeFirst()).release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract j g();

    public abstract f h(Throwable th2);

    public abstract f i(h hVar, j jVar, boolean z10);

    public final boolean j() {
        f h;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            h hVar = (h) this.c.removeFirst();
            j[] jVarArr = this.f;
            int i3 = this.h - 1;
            this.h = i3;
            j jVar = jVarArr[i3];
            boolean z10 = this.k;
            this.k = false;
            if (hVar.isEndOfStream()) {
                jVar.addFlag(4);
            } else {
                jVar.timeUs = hVar.e;
                if (hVar.isFirstSample()) {
                    jVar.addFlag(TLObject.FLAG_27);
                }
                if (!l(hVar.e)) {
                    jVar.shouldBeSkipped = true;
                }
                try {
                    h = i(hVar, jVar, z10);
                } catch (OutOfMemoryError e10) {
                    h = h(e10);
                } catch (RuntimeException e11) {
                    h = h(e11);
                }
                if (h != null) {
                    synchronized (this.b) {
                        this.j = h;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.m;
                        this.m = 0;
                        this.d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    hVarArr[i10] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // j2.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final j c() {
        synchronized (this.b) {
            try {
                f fVar = this.j;
                if (fVar != null) {
                    throw fVar;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (j) this.d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean l(long j10) {
        boolean z10;
        synchronized (this.b) {
            long j11 = this.n;
            z10 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z10;
    }

    @Override // j2.e
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void e(h hVar) {
        synchronized (this.b) {
            try {
                f fVar = this.j;
                if (fVar != null) {
                    throw fVar;
                }
                zb.f(hVar == this.i);
                this.c.addLast(hVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(j jVar) {
        synchronized (this.b) {
            jVar.clear();
            j[] jVarArr = this.f;
            int i3 = this.h;
            this.h = i3 + 1;
            jVarArr[i3] = jVar;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    public final void o(int i3) {
        int i10 = this.g;
        h[] hVarArr = this.e;
        zb.p(i10 == hVarArr.length);
        for (h hVar : hVarArr) {
            hVar.b(i3);
        }
    }

    @Override // j2.e
    public void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
