package e5;

import a8.w9;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
