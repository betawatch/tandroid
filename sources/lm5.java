// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lm5 {
    public static final lm5 b;
    public final float a;

    static {
        xk4 xk4Var = new xk4();
        xk4Var.a = 0.5f;
        b = new lm5(xk4Var);
    }

    public lm5(xk4 xk4Var) {
        this.a = xk4Var.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm5) {
            return lm5.class.equals(lm5.class) && Float.compare(this.a, ((lm5) obj).a) == 0 && vue.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{lm5.class, Float.valueOf(this.a), null});
    }
}
