// default package

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class gy2 {
    public static final Collection a;

    static {
        try {
            byte b = 1;
            Iterator it = Arrays.asList(new dl()).iterator();
            it.getClass();
            a = u6a.a(new cu2(new v6a(it, b)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
