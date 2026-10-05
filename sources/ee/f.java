package ee;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class f {
    public static final Collection a;

    static {
        try {
            Iterator it = Arrays.asList(new ae.b()).iterator();
            kotlin.jvm.internal.i.e(it, "<this>");
            a = wd.d.a(new wd.a(new wd.e(it, 1)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
