// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
