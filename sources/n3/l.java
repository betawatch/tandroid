package n3;

import java.util.ArrayDeque;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class l implements e {
    public final gg.h a;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final i[] e;
    public final j[] f;
    public int g;
    public int h;
    public i i;
    public g j;
    public boolean k;
    public boolean l;
    public int m;

    public l(i[] iVarArr, j[] jVarArr) {
        this.e = iVarArr;
        this.g = iVarArr.length;
        for (int i10 = 0; i10 < this.g; i10++) {
            this.e[i10] = e();
        }
        this.f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f[i11] = f();
        }
        gg.h hVar = new gg.h(this);
        this.a = hVar;
        hVar.start();
    }

    @Override // n3.e
    public final Object b() {
        synchronized (this.b) {
            try {
                g gVar = this.j;
                if (gVar != null) {
                    throw gVar;
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

    @Override // n3.e
    public final Object c() {
        i iVar;
        synchronized (this.b) {
            try {
                g gVar = this.j;
                if (gVar != null) {
                    throw gVar;
                }
                h5.a.i(this.i == null);
                int i10 = this.g;
                if (i10 == 0) {
                    iVar = null;
                } else {
                    i[] iVarArr = this.e;
                    int i11 = i10 - 1;
                    this.g = i11;
                    iVar = iVarArr[i11];
                }
                this.i = iVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override // n3.e
    public final void d(Object obj) {
        i iVar = (i) obj;
        synchronized (this.b) {
            try {
                g gVar = this.j;
                if (gVar != null) {
                    throw gVar;
                }
                h5.a.f(iVar == this.i);
                this.c.addLast(iVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract i e();

    public abstract j f();

    @Override // n3.e
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                i iVar = this.i;
                if (iVar != null) {
                    iVar.b();
                    i[] iVarArr = this.e;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    iVarArr[i10] = iVar;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    i iVar2 = (i) this.c.removeFirst();
                    iVar2.b();
                    i[] iVarArr2 = this.e;
                    int i11 = this.g;
                    this.g = i11 + 1;
                    iVarArr2[i11] = iVar2;
                }
                while (!this.d.isEmpty()) {
                    ((j) this.d.removeFirst()).i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract g g(Throwable th2);

    public abstract g h(i iVar, j jVar, boolean z4);

    public final boolean i() {
        g g10;
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
            i iVar = (i) this.c.removeFirst();
            j[] jVarArr = this.f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z4 = this.k;
            this.k = false;
            if (iVar.e(4)) {
                jVar.a(4);
            } else {
                if (iVar.e(TLObject.FLAG_31)) {
                    jVar.a(TLObject.FLAG_31);
                }
                if (iVar.e(TLObject.FLAG_27)) {
                    jVar.a(TLObject.FLAG_27);
                }
                try {
                    g10 = h(iVar, jVar, z4);
                } catch (OutOfMemoryError e6) {
                    g10 = g(e6);
                } catch (RuntimeException e10) {
                    g10 = g(e10);
                }
                if (g10 != null) {
                    synchronized (this.b) {
                        this.j = g10;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        jVar.i();
                    } else if (jVar.e(TLObject.FLAG_31)) {
                        this.m++;
                        jVar.i();
                    } else {
                        jVar.d = this.m;
                        this.m = 0;
                        this.d.addLast(jVar);
                    }
                    iVar.b();
                    i[] iVarArr = this.e;
                    int i11 = this.g;
                    this.g = i11 + 1;
                    iVarArr[i11] = iVar;
                } finally {
                }
            }
            return true;
        }
    }

    public final void j(j jVar) {
        synchronized (this.b) {
            jVar.b();
            j[] jVarArr = this.f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // n3.e
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
