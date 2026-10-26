package c5;

import a8.x9;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
