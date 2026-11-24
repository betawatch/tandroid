// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class one {
    public static final Object a(lj7 lj7Var, ni8 ni8Var, Serializable serializable) {
        lj7Var.getClass();
        ni8Var.getClass();
        Object obj = lj7Var.a.get(ni8Var);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
        }
        return obj == null ? serializable : obj;
    }
}
