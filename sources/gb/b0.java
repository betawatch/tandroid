package gb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b0 {
    public static final a0 Companion = new a0();
    public final int a;
    public final String b;

    public /* synthetic */ b0(int i7, int i10, String str) {
        if (3 != (i7 & 3)) {
            oe.k.a(i7, 3, z.a.d());
            throw null;
        }
        this.a = i10;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.a == b0Var.a && kotlin.jvm.internal.j.a(this.b, b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.a + ", uuid=" + this.b + ')';
    }

    public b0(int i7, String uuid) {
        kotlin.jvm.internal.j.e(uuid, "uuid");
        this.a = i7;
        this.b = uuid;
    }
}
