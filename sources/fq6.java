// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fq6 {
    public final boolean a;
    public final String b;
    public final String c;

    public fq6(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fq6.class != obj.getClass()) {
            return false;
        }
        fq6 fq6Var = (fq6) obj;
        return this.a == fq6Var.a && Objects.equals(this.b, fq6Var.b) && Objects.equals(this.c, fq6Var.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }
}
