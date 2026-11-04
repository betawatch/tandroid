package db;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 {
    public static final z Companion = new z();
    public final int a;
    public final String b;

    public /* synthetic */ a0(int i3, int i10, String str) {
        if (3 != (i3 & 3)) {
            le.k.a(i3, 3, y.a.d());
            throw null;
        }
        this.a = i10;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a == a0Var.a && kotlin.jvm.internal.j.a(this.b, a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.a + ", uuid=" + this.b + ')';
    }

    public a0(int i3, String uuid) {
        kotlin.jvm.internal.j.e(uuid, "uuid");
        this.a = i3;
        this.b = uuid;
    }
}
