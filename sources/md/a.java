package md;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class a {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        i.b(methods);
        int length = methods.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methods[i10];
            if (i.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                i.d(parameterTypes, "getParameterTypes(...)");
                if (i.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        a = method;
        int length2 = methods.length;
        for (int i11 = 0; i11 < length2 && !i.a(methods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}
