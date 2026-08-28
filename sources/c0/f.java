package c0;

import f7.k0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends k0 {
    @Override // f7.k0
    public final boolean a(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.b != dVar) {
                    return false;
                }
                hVar.b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f7.k0
    public final boolean b(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.a != obj) {
                    return false;
                }
                hVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f7.k0
    public final boolean c(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.c != gVar) {
                    return false;
                }
                hVar.c = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f7.k0
    public final void d(g gVar, g gVar2) {
        gVar.b = gVar2;
    }

    @Override // f7.k0
    public final void e(g gVar, Thread thread) {
        gVar.a = thread;
    }
}
