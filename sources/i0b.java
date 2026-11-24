// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i0b {
    public final String a;
    public final String b;
    public final j0b c;

    public i0b(String str, String str2, j0b j0bVar) {
        this.a = str;
        this.b = str2;
        this.c = j0bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0b)) {
            return false;
        }
        i0b i0bVar = (i0b) obj;
        return this.a.equals(i0bVar.a) && this.b.equals(i0bVar.b) && this.c.equals(i0bVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
