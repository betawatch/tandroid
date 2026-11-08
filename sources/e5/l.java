package e5;

import a8.w9;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class l {
    public static final n a;

    static {
        n eVar;
        try {
            eVar = new d6.i((WebViewProviderFactoryBoundaryInterface) af.b.a(WebViewProviderFactoryBoundaryInterface.class, w9.a()), 20);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        a = eVar;
    }
}
