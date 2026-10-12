package j9;

import v7.p8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class f extends p8 {
    @Override // v7.p8
    public final boolean a(o oVar, c cVar, c cVar2) {
        synchronized (oVar) {
            try {
                if (oVar.b != cVar) {
                    return false;
                }
                oVar.b = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.p8
    public final boolean b(o oVar, Object obj, Object obj2) {
        synchronized (oVar) {
            try {
                if (oVar.a != obj) {
                    return false;
                }
                oVar.a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.p8
    public final boolean c(o oVar, n nVar, n nVar2) {
        synchronized (oVar) {
            try {
                if (oVar.c != nVar) {
                    return false;
                }
                oVar.c = nVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.p8
    public final c d(o oVar) {
        c cVar;
        c cVar2 = c.d;
        synchronized (oVar) {
            try {
                cVar = oVar.b;
                if (cVar != cVar2) {
                    oVar.b = cVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // v7.p8
    public final n e(o oVar) {
        n nVar;
        n nVar2 = n.c;
        synchronized (oVar) {
            try {
                nVar = oVar.c;
                if (nVar != nVar2) {
                    oVar.c = nVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override // v7.p8
    public final void f(n nVar, n nVar2) {
        nVar.b = nVar2;
    }

    @Override // v7.p8
    public final void g(n nVar, Thread thread) {
        nVar.a = thread;
    }
}
