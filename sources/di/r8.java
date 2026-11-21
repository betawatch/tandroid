package di;

import j$.util.Objects;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r8 {
    public final long a;
    public final int b;

    public r8(long j3, int i7) {
        this.a = j3;
        this.b = i7;
    }

    public static r8 a(int i7, long j3) {
        return new r8(j3, i7);
    }

    public static r8 b(fj fjVar) {
        if (fjVar == null) {
            return null;
        }
        TLRPC.Message message = fjVar.k;
        return (message == null || !(message.isThreadMessage || fjVar.k3()) || fjVar.k.fwd_from == null) ? new r8(fj.B0(fjVar.k), fjVar.e1()) : new r8(fjVar.Z0(), fjVar.k.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r8) {
            r8 r8Var = (r8) obj;
            if (r8Var.a == this.a && r8Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
