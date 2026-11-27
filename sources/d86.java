// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
