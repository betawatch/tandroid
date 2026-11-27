// default package

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class dzc {
    public static final fzc a;

    static {
        fzc rj2Var;
        try {
            rj2Var = new k09((WebViewProviderFactoryBoundaryInterface) py0.a(WebViewProviderFactoryBoundaryInterface.class, x2f.a()), (byte) 20);
        } catch (ClassNotFoundException unused) {
            rj2Var = new rj2((byte) 2);
        } catch (IllegalAccessException e) {
            e = e;
            grb.m(e);
            return;
        } catch (NoSuchMethodException e2) {
            e = e2;
            grb.m(e);
            return;
        } catch (InvocationTargetException e3) {
            e = e3;
            grb.m(e);
            return;
        }
        a = rj2Var;
    }
}
