// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class eqe {
    public static final Object a(rj7 rj7Var, zj8 zj8Var, Serializable serializable) {
        rj7Var.getClass();
        zj8Var.getClass();
        Object obj = rj7Var.a.get(zj8Var);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
        }
        return obj == null ? serializable : obj;
    }
}
