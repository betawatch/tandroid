// default package

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class a22 {
    public final int a;
    public final long b;

    public a22(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static a22 a(Object obj) {
        if (obj instanceof nu2) {
            return new a22(2, ((nu2) obj).a);
        }
        if (obj instanceof TLRPC.User) {
            return new a22(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a22.class != obj.getClass()) {
            return false;
        }
        a22 a22Var = (a22) obj;
        return this.b == a22Var.b && this.a == a22Var.a;
    }

    public final int hashCode() {
        return Objects.hash(ug8.b(this.a), Long.valueOf(this.b));
    }
}
