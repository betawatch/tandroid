package af;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        } catch (InvocationTargetException e10) {
            throw e10.getTargetException();
        } catch (ReflectiveOperationException e11) {
            throw new RuntimeException("Reflection failed for method " + method, e11);
        }
    }
}
