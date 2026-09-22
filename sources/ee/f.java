package ee;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
