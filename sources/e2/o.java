package e2;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class o {
    public final Object a;
    public b2.p b = new b2.p();
    public boolean c;
    public boolean d;

    public o(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
