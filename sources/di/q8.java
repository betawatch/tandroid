package di;

import j$.util.Objects;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q8 {
    public final long a;
    public final int b;

    public q8(long j3, int i7) {
        this.a = j3;
        this.b = i7;
    }

    public static q8 a(int i7, long j3) {
        return new q8(j3, i7);
    }

    public static q8 b(fj fjVar) {
        if (fjVar == null) {
            return null;
        }
        TLRPC.Message message = fjVar.k;
        return (message == null || !(message.isThreadMessage || fjVar.k3()) || fjVar.k.fwd_from == null) ? new q8(fj.B0(fjVar.k), fjVar.e1()) : new q8(fjVar.Z0(), fjVar.k.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q8) {
            q8 q8Var = (q8) obj;
            if (q8Var.a == this.a && q8Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
