package b5;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v7.h0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class n {
    public static final p a;

    static {
        p fVar;
        try {
            fVar = new xa.c((WebViewProviderFactoryBoundaryInterface) se.b.a(WebViewProviderFactoryBoundaryInterface.class, h0.a()), 6);
        } catch (ClassNotFoundException unused) {
            fVar = new f();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
        a = fVar;
    }
}
