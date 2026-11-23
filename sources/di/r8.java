package di;

import j$.util.Objects;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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

    public static r8 b(gj gjVar) {
        if (gjVar == null) {
            return null;
        }
        TLRPC.Message message = gjVar.k;
        return (message == null || !(message.isThreadMessage || gjVar.k3()) || gjVar.k.fwd_from == null) ? new r8(gj.B0(gjVar.k), gjVar.e1()) : new r8(gjVar.Z0(), gjVar.k.fwd_from.saved_from_msg_id);
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
