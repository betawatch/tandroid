// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class mle {
    public static final Object a(ih7 ih7Var, lg8 lg8Var, Serializable serializable) {
        ih7Var.getClass();
        lg8Var.getClass();
        Object obj = ih7Var.a.get(lg8Var);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
        }
        return obj == null ? serializable : obj;
    }
}
