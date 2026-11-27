// default package

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class h2b {
    public final String a;
    public final String b;
    public final i2b c;

    public h2b(String str, String str2, i2b i2bVar) {
        this.a = str;
        this.b = str2;
        this.c = i2bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2b)) {
            return false;
        }
        h2b h2bVar = (h2b) obj;
        return this.a.equals(h2bVar.a) && this.b.equals(h2bVar.b) && this.c.equals(h2bVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
