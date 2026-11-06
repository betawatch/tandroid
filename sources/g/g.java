package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    public static void b(s sVar) {
        synchronized (c) {
            try {
                a0.g gVar = b;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    g gVar2 = (g) ((WeakReference) bVar.next()).get();
                    if (gVar2 == sVar || gVar2 == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract boolean c(int i7);
}
