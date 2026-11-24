// default package

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class nuc {
    public static final puc a;

    static {
        puc vi2Var;
        try {
            vi2Var = new v39((WebViewProviderFactoryBoundaryInterface) hy0.a(WebViewProviderFactoryBoundaryInterface.class, eye.a()), (byte) 20);
        } catch (ClassNotFoundException unused) {
            vi2Var = new vi2((byte) 2);
        } catch (IllegalAccessException e) {
            e = e;
            sdb.b(e);
            return;
        } catch (NoSuchMethodException e2) {
            e = e2;
            sdb.b(e);
            return;
        } catch (InvocationTargetException e3) {
            e = e3;
            sdb.b(e);
            return;
        }
        a = vi2Var;
    }
}
