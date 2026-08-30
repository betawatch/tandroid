package o2;

import java.lang.reflect.InvocationTargetException;
import k7.h0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class l {
    public static final n a;

    static {
        n eVar;
        try {
            eVar = new o((WebViewProviderFactoryBoundaryInterface) ee.b.a(WebViewProviderFactoryBoundaryInterface.class, h0.a()), 0);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        a = eVar;
    }
}
