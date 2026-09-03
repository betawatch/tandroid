package o2;

import androidx.biometric.e0;
import java.lang.reflect.InvocationTargetException;
import k7.h0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class m {
    public static final o a;

    static {
        o eVar;
        try {
            eVar = new e0((WebViewProviderFactoryBoundaryInterface) ee.b.a(WebViewProviderFactoryBoundaryInterface.class, h0.a()), 23);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        a = eVar;
    }
}
