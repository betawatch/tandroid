// default package

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class dzc {
    public static final fzc a;

    static {
        fzc rj2Var;
        try {
            rj2Var = new l09((WebViewProviderFactoryBoundaryInterface) py0.a(WebViewProviderFactoryBoundaryInterface.class, x2f.a()), (byte) 20);
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
