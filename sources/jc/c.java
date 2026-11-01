package jc;

import java.util.logging.Logger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class c {
    public static c a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            String simpleName = cls.getSimpleName();
            a aVar = new a(0);
            aVar.b = simpleName;
            return aVar;
        }
        String simpleName2 = cls.getSimpleName();
        a aVar2 = new a(1);
        aVar2.b = Logger.getLogger(simpleName2);
        return aVar2;
    }

    public abstract void b(String str);
}
