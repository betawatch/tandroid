package bi;

import j$.util.Objects;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        return (message == null || !(message.isThreadMessage || ijVar.l3()) || ijVar.k.fwd_from == null) ? new x9(ij.B0(ijVar.k), ijVar.f1()) : new x9(ijVar.Z0(), ijVar.k.fwd_from.saved_from_msg_id);
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
