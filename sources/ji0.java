// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ji0 extends wl5 {
    public final byte[] b;

    public ji0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ji0.class != obj.getClass()) {
            return false;
        }
        ji0 ji0Var = (ji0) obj;
        return this.a.equals(ji0Var.a) && Arrays.equals(this.b, ji0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + bs2.j(527, 31, this.a);
    }
}
