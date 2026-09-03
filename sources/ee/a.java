package ee;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a implements InvocationHandler {
    public final FeatureFlagHolderBoundaryInterface a;

    public a(FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface) {
        this.a = featureFlagHolderBoundaryInterface;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface = this.a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, featureFlagHolderBoundaryInterface.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(featureFlagHolderBoundaryInterface, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Reflection failed for method " + method, e6);
        }
    }
}
