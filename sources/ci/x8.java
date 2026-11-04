package ci;

import j$.util.Objects;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x8 {
    public final long a;
    public final int b;

    public x8(long j10, int i3) {
        this.a = j10;
        this.b = i3;
    }

    public static x8 a(int i3, long j10) {
        return new x8(j10, i3);
    }

    public static x8 b(zi ziVar) {
        if (ziVar == null) {
            return null;
        }
        TLRPC.Message message = ziVar.k;
        return (message == null || !(message.isThreadMessage || ziVar.l3()) || ziVar.k.fwd_from == null) ? new x8(zi.B0(ziVar.k), ziVar.f1()) : new x8(ziVar.Z0(), ziVar.k.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x8) {
            x8 x8Var = (x8) obj;
            if (x8Var.a == this.a && x8Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
