package e5;

import a8.y9;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class l {
    public static final n a;

    static {
        n eVar;
        try {
            eVar = new ob.c((WebViewProviderFactoryBoundaryInterface) af.b.a(WebViewProviderFactoryBoundaryInterface.class, y9.a()), 17);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        a = eVar;
    }
}
