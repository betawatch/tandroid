package c0;

import v7.d5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class f extends d5 {
    @Override // v7.d5
    public final boolean a(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.b != dVar) {
                    return false;
                }
                hVar.b = dVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.d5
    public final boolean b(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.a != obj) {
                    return false;
                }
                hVar.a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.d5
    public final boolean c(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.c != gVar) {
                    return false;
                }
                hVar.c = gVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.d5
    public final void d(g gVar, g gVar2) {
        gVar.b = gVar2;
    }

    @Override // v7.d5
    public final void e(g gVar, Thread thread) {
        gVar.a = thread;
    }
}
