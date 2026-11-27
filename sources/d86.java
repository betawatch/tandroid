// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
