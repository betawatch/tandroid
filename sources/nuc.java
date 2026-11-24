// default package

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class nuc {
    public static final puc a;

    static {
        puc vi2Var;
        try {
            vi2Var = new v39((WebViewProviderFactoryBoundaryInterface) hy0.a(WebViewProviderFactoryBoundaryInterface.class, eye.a()), (byte) 20);
        } catch (ClassNotFoundException unused) {
            vi2Var = new vi2((byte) 2);
        } catch (IllegalAccessException e) {
            e = e;
            sdb.b(e);
            return;
        } catch (NoSuchMethodException e2) {
            e = e2;
            sdb.b(e);
            return;
        } catch (InvocationTargetException e3) {
            e = e3;
            sdb.b(e);
            return;
        }
        a = vi2Var;
    }
}
