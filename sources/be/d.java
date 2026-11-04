package be;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d {
    public static final Collection a;

    static {
        try {
            Iterator it = Arrays.asList(new xd.b()).iterator();
            kotlin.jvm.internal.j.e(it, "<this>");
            a = td.d.a(new td.a(new td.e(it, 1)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
