// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
