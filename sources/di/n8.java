package di;

import j$.util.Objects;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n8 {
    public final long a;
    public final int b;

    public n8(long j3, int i7) {
        this.a = j3;
        this.b = i7;
    }

    public static n8 a(int i7, long j3) {
        return new n8(j3, i7);
    }

    public static n8 b(gj gjVar) {
        if (gjVar == null) {
            return null;
        }
        TLRPC.Message message = gjVar.k;
        return (message == null || !(message.isThreadMessage || gjVar.k3()) || gjVar.k.fwd_from == null) ? new n8(gj.B0(gjVar.k), gjVar.e1()) : new n8(gjVar.Z0(), gjVar.k.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n8) {
            n8 n8Var = (n8) obj;
            if (n8Var.a == this.a && n8Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
