package h2;

import java.util.ArrayDeque;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        for (int i10 = 0; i10 < this.g; i10++) {
            this.e[i10] = f();
        }
        this.f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f[i11] = g();
        }
        k kVar = new k(this);
        this.a = kVar;
        kVar.start();
    }

    @Override // h2.e
    public final void a(long j3) {
        boolean z10;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length && !this.k) {
                    z10 = false;
                    e2.d.g(z10);
                    this.n = j3;
                }
                z10 = true;
                e2.d.g(z10);
                this.n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h2.e
    public final Object d() {
        h hVar;
        synchronized (this.b) {
            try {
                f fVar = this.j;
                if (fVar != null) {
                    throw fVar;
                }
                e2.d.g(this.i == null);
                int i10 = this.g;
                if (i10 == 0) {
                    hVar = null;
                } else {
                    h[] hVarArr = this.e;
                    int i11 = i10 - 1;
                    this.g = i11;
                    hVar = hVarArr[i11];
                }
                this.i = hVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public abstract h f();

    @Override // h2.e
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                h hVar = this.i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.e;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    hVarArr[i10] = hVar;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    h hVar2 = (h) this.c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.e;
                    int i11 = this.g;
                    this.g = i11 + 1;
                    hVarArr2[i11] = hVar2;
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
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
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
                } catch (OutOfMemoryError e7) {
                    h = h(e7);
                } catch (RuntimeException e10) {
                    h = h(e10);
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
                    int i11 = this.g;
                    this.g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // h2.e
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

    public final boolean l(long j3) {
        boolean z10;
        synchronized (this.b) {
            long j10 = this.n;
            z10 = j10 == -9223372036854775807L || j3 >= j10;
        }
        return z10;
    }

    @Override // h2.e
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void e(h hVar) {
        synchronized (this.b) {
            try {
                f fVar = this.j;
                if (fVar != null) {
                    throw fVar;
                }
                e2.d.b(hVar == this.i);
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
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    public final void o(int i10) {
        int i11 = this.g;
        h[] hVarArr = this.e;
        e2.d.g(i11 == hVarArr.length);
        for (h hVar : hVarArr) {
            hVar.b(i10);
        }
    }

    @Override // h2.e
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
