// default package

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class js6 {
    public final boolean a;
    public final String b;
    public final String c;

    public js6(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || js6.class != obj.getClass()) {
            return false;
        }
        js6 js6Var = (js6) obj;
        return this.a == js6Var.a && Objects.equals(this.b, js6Var.b) && Objects.equals(this.c, js6Var.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }
}
