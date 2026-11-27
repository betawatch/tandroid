// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fc7 {
    public long a;
    public long b;
    public byte[] c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof fc7)) {
            return false;
        }
        fc7 fc7Var = (fc7) obj;
        return this.a == fc7Var.a && this.b == fc7Var.b && Arrays.equals(this.c, fc7Var.c);
    }
}
