package md;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class f {
    public static final Collection a;

    static {
        try {
            Iterator it = Arrays.asList(new id.b()).iterator();
            kotlin.jvm.internal.i.e(it, "<this>");
            a = ed.d.a(new ed.a(new ed.e(it, 1)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
