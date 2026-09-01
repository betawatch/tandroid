package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class g {
    public static final int a;
    public static final a0.g b;
    public static final Object c;

    static {
        new ArrayDeque();
        a = -100;
        b = new a0.g(0);
        c = new Object();
    }

    public static void b(q qVar) {
        synchronized (c) {
            try {
                a0.g gVar = b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    g gVar2 = (g) ((WeakReference) bVar.next()).get();
                    if (gVar2 == qVar || gVar2 == null) {
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
