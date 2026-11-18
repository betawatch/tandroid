package g;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    public static void c(s sVar) {
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

    public abstract boolean d(int i7);
}
