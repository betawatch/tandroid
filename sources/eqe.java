// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
