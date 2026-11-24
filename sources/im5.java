// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class im5 {
    public static final im5 b;
    public final float a;

    static {
        xk4 xk4Var = new xk4();
        xk4Var.a = 0.5f;
        b = new im5(xk4Var);
    }

    public im5(xk4 xk4Var) {
        this.a = xk4Var.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof im5) {
            return im5.class.equals(im5.class) && Float.compare(this.a, ((im5) obj).a) == 0 && fse.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{im5.class, Float.valueOf(this.a), null});
    }
}
