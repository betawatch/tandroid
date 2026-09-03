package o2;

import androidx.biometric.f0;
import java.lang.reflect.InvocationTargetException;
import k7.i0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class l {
    public static final n a;

    static {
        n eVar;
        try {
            eVar = new f0((WebViewProviderFactoryBoundaryInterface) ee.b.a(WebViewProviderFactoryBoundaryInterface.class, i0.a()), 21);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
        a = eVar;
    }
}
