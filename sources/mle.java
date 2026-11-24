// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
