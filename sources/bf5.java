// default package

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bf5 {
    public final long a;
    public final int b;

    public bf5(TLRPC.Message message) {
        long B0 = r47.B0(message);
        int i = message.id;
        this.a = B0;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bf5.class == obj.getClass()) {
            bf5 bf5Var = (bf5) obj;
            if (this.a == bf5Var.a && this.b == bf5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
