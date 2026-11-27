// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fa4 {
    public final Long a;
    public final int b;
    public final String c;

    public fa4(Long l, int i, String str) {
        this.a = l;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fa4) && obj.toString().equals(toString());
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
