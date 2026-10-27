package c0;

import a8.v9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f extends v9 {
    @Override // a8.v9
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

    @Override // a8.v9
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

    @Override // a8.v9
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

    @Override // a8.v9
    public final void d(g gVar, g gVar2) {
        gVar.b = gVar2;
    }

    @Override // a8.v9
    public final void e(g gVar, Thread thread) {
        gVar.a = thread;
    }
}
