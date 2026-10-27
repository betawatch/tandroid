package c5;

import a8.x9;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class n {
    public static final p a;

    static {
        p fVar;
        try {
            fVar = new a4.l((WebViewProviderFactoryBoundaryInterface) ve.b.a(WebViewProviderFactoryBoundaryInterface.class, x9.a()), 8);
        } catch (ClassNotFoundException unused) {
            fVar = new f();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        a = fVar;
    }
}
