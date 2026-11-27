// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class io8 {
    public static final ho8 Companion = new ho8();
    public final int a;
    public final String b;

    public /* synthetic */ io8(int i, int i2, String str) {
        if (3 != (i & 3)) {
            sve.a(i, 3, go8.a.d());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io8)) {
            return false;
        }
        io8 io8Var = (io8) obj;
        return this.a == io8Var.a && ur5.a(this.b, io8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.a + ", uuid=" + this.b + ')';
    }

    public io8(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
