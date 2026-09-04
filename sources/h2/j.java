package h2;

import java.util.ArrayDeque;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class j implements d {
    public final i a;
    public final g[] e;
    public final h[] f;
    public int g;
    public int h;
    public g i;
    public e j;
    public boolean k;
    public boolean l;
    public int m;
    public final Object b = new Object();
    public long n = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public j(g[] gVarArr, h[] hVarArr) {
        this.e = gVarArr;
        this.g = gVarArr.length;
        for (int i10 = 0; i10 < this.g; i10++) {
            this.e[i10] = f();
        }
        this.f = hVarArr;
        this.h = hVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f[i11] = g();
        }
        i iVar = new i(this);
        this.a = iVar;
        iVar.start();
    }

    @Override // h2.d
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

    @Override // h2.d
    public final Object d() {
        g gVar;
        synchronized (this.b) {
            try {
                e eVar = this.j;
                if (eVar != null) {
                    throw eVar;
                }
                e2.d.g(this.i == null);
                int i10 = this.g;
                if (i10 == 0) {
                    gVar = null;
                } else {
                    g[] gVarArr = this.e;
                    int i11 = i10 - 1;
                    this.g = i11;
                    gVar = gVarArr[i11];
                }
                this.i = gVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public abstract g f();

    @Override // h2.d
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                g gVar = this.i;
                if (gVar != null) {
                    gVar.i();
                    g[] gVarArr = this.e;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    gVarArr[i10] = gVar;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    g gVar2 = (g) this.c.removeFirst();
                    gVar2.i();
                    g[] gVarArr2 = this.e;
                    int i11 = this.g;
                    this.g = i11 + 1;
                    gVarArr2[i11] = gVar2;
                }
                while (!this.d.isEmpty()) {
                    ((h) this.d.removeFirst()).j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract h g();

    public abstract e h(Throwable th2);

    public abstract e i(g gVar, h hVar, boolean z10);

    public final boolean j() {
        e h;
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
            g gVar = (g) this.c.removeFirst();
            h[] hVarArr = this.f;
            int i10 = this.h - 1;
            this.h = i10;
            h hVar = hVarArr[i10];
            boolean z10 = this.k;
            this.k = false;
            if (gVar.c(4)) {
                hVar.a(4);
            } else {
                hVar.c = gVar.h;
                if (gVar.c(TLObject.FLAG_27)) {
                    hVar.a(TLObject.FLAG_27);
                }
                if (!l(gVar.h)) {
                    hVar.e = true;
                }
                try {
                    h = i(gVar, hVar, z10);
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
                        hVar.j();
                    } else if (hVar.e) {
                        this.m++;
                        hVar.j();
                    } else {
                        hVar.d = this.m;
                        this.m = 0;
                        this.d.addLast(hVar);
                    }
                    gVar.i();
                    g[] gVarArr = this.e;
                    int i11 = this.g;
                    this.g = i11 + 1;
                    gVarArr[i11] = gVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // h2.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final h c() {
        synchronized (this.b) {
            try {
                e eVar = this.j;
                if (eVar != null) {
                    throw eVar;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (h) this.d.removeFirst();
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

    @Override // h2.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void e(g gVar) {
        synchronized (this.b) {
            try {
                e eVar = this.j;
                if (eVar != null) {
                    throw eVar;
                }
                e2.d.b(gVar == this.i);
                this.c.addLast(gVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(h hVar) {
        synchronized (this.b) {
            hVar.i();
            h[] hVarArr = this.f;
            int i10 = this.h;
            this.h = i10 + 1;
            hVarArr[i10] = hVar;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // h2.d
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
