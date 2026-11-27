// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class eqe {
    public static final Object a(sj7 sj7Var, zj8 zj8Var, Serializable serializable) {
        sj7Var.getClass();
        zj8Var.getClass();
        Object obj = sj7Var.a.get(zj8Var);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
        }
        return obj == null ? serializable : obj;
    }
}
