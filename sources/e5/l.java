package e5;

import a8.z9;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class l {
    public static final n a;

    static {
        n eVar;
        try {
            eVar = new cb.c((WebViewProviderFactoryBoundaryInterface) af.b.b(WebViewProviderFactoryBoundaryInterface.class, z9.a()), 18);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        a = eVar;
    }
}
