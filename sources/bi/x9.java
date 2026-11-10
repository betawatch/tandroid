package bi;

import j$.util.Objects;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x9 {
    public final long a;
    public final int b;

    public x9(long j3, int i7) {
        this.a = j3;
        this.b = i7;
    }

    public static x9 a(int i7, long j3) {
        return new x9(j3, i7);
    }

    public static x9 b(ij ijVar) {
        if (ijVar == null) {
            return null;
        }
        TLRPC.Message message = ijVar.k;
        return (message == null || !(message.isThreadMessage || ijVar.k3()) || ijVar.k.fwd_from == null) ? new x9(ij.B0(ijVar.k), ijVar.e1()) : new x9(ijVar.Z0(), ijVar.k.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x9) {
            x9 x9Var = (x9) obj;
            if (x9Var.a == this.a && x9Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
