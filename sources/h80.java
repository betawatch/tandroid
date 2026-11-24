// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
