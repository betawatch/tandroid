// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class h80 extends jy2 {
    public final String a;
    public final byte[] b;

    public h80(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jy2)) {
            return false;
        }
        jy2 jy2Var = (jy2) obj;
        h80 h80Var = (h80) jy2Var;
        if (!this.a.equals(h80Var.a)) {
            return false;
        }
        if (jy2Var instanceof h80) {
            h80Var = (h80) jy2Var;
        }
        return Arrays.equals(this.b, h80Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
