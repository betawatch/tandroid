// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class d86 {
    public final Object a;
    public n31 b = new n31();
    public boolean c;
    public boolean d;

    public d86(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d86.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((d86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
