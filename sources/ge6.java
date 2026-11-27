// default package

import java.util.logging.Logger;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class ge6 {
    public static ge6 a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            String simpleName = cls.getSimpleName();
            fk fkVar = new fk((byte) 0);
            fkVar.b = simpleName;
            return fkVar;
        }
        String simpleName2 = cls.getSimpleName();
        fk fkVar2 = new fk((byte) 1);
        fkVar2.b = Logger.getLogger(simpleName2);
        return fkVar2;
    }

    public abstract void b(String str);
}
