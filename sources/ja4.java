// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ja4 {
    public final Long a;
    public final int b;
    public final String c;

    public ja4(Long l, int i, String str) {
        this.a = l;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ja4) && obj.toString().equals(toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Long l = this.a;
        sb.append(l == null ? "-" : l.toString());
        sb.append("#");
        sb.append(this.b);
        sb.append(" ");
        String str = this.c;
        sb.append(str != null ? str : "-");
        return sb.toString();
    }
}
