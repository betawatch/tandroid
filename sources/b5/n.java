package b5;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v7.h0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class n {
    public static final p a;

    static {
        p fVar;
        try {
            fVar = new xa.c((WebViewProviderFactoryBoundaryInterface) se.b.a(WebViewProviderFactoryBoundaryInterface.class, h0.a()), 6);
        } catch (ClassNotFoundException unused) {
            fVar = new f();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
        a = fVar;
    }
}
