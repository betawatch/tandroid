// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class o7f {
    public final String a;
    public final String b;
    public final boolean c;

    public o7f(String str, String str2, boolean z) {
        xve.f(str);
        this.a = str;
        xve.f(str2);
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7f)) {
            return false;
        }
        o7f o7fVar = (o7f) obj;
        return vue.a(this.a, o7fVar.a) && vue.a(this.b, o7fVar.b) && vue.a(null, null) && this.c == o7fVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        xve.h(null);
        throw null;
    }
}
