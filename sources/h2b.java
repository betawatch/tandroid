// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
