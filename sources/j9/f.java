package j9;

import v7.p8;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
