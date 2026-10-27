package k9;

import a8.pd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f extends pd {
    @Override // a8.pd
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

    @Override // a8.pd
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

    @Override // a8.pd
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

    @Override // a8.pd
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

    @Override // a8.pd
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

    @Override // a8.pd
    public final void f(n nVar, n nVar2) {
        nVar.b = nVar2;
    }

    @Override // a8.pd
    public final void g(n nVar, Thread thread) {
        nVar.a = thread;
    }
}
