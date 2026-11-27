// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
