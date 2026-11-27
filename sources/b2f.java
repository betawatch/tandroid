// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class b2f {
    public final Float a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2f) {
            return vue.a(null, null) && vue.a(this.a, ((b2f) obj).a) && vue.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.a, null});
    }
}
