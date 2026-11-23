package gb;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c0 {
    public static final b0 Companion = new b0();
    public final int a;
    public final String b;

    public /* synthetic */ c0(int i7, int i10, String str) {
        if (3 != (i7 & 3)) {
            oe.k.a(i7, 3, a0.a.d());
            throw null;
        }
        this.a = i10;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.a == c0Var.a && kotlin.jvm.internal.j.a(this.b, c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.a + ", uuid=" + this.b + ')';
    }

    public c0(int i7, String uuid) {
        kotlin.jvm.internal.j.e(uuid, "uuid");
        this.a = i7;
        this.b = uuid;
    }
}
