package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class h {
    public static final int a;
    public static final a0.g b;
    public static final Object c;

    static {
        new ArrayDeque();
        a = -100;
        b = new a0.g(0);
        c = new Object();
    }

    public static void b(s sVar) {
        synchronized (c) {
            try {
                a0.g gVar = b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    h hVar = (h) ((WeakReference) bVar.next()).get();
                    if (hVar == sVar || hVar == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract boolean c(int i10);
}
