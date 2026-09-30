package b5;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v7.j0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class n {
    public static final p a;

    static {
        p fVar;
        try {
            fVar = new a6.i((WebViewProviderFactoryBoundaryInterface) se.b.a(WebViewProviderFactoryBoundaryInterface.class, j0.a()), 7);
        } catch (ClassNotFoundException unused) {
            fVar = new f();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        a = fVar;
    }
}
