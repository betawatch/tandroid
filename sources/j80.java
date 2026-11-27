// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class j80 extends ez2 {
    public final String a;
    public final byte[] b;

    public j80(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ez2)) {
            return false;
        }
        ez2 ez2Var = (ez2) obj;
        j80 j80Var = (j80) ez2Var;
        if (!this.a.equals(j80Var.a)) {
            return false;
        }
        if (ez2Var instanceof j80) {
            j80Var = (j80) ez2Var;
        }
        return Arrays.equals(this.b, j80Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
