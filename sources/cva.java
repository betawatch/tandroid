// default package

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cva {
    public final long a;
    public final int b;

    public cva(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static cva a(int i, long j) {
        return new cva(j, i);
    }

    public static cva b(k47 k47Var) {
        if (k47Var == null) {
            return null;
        }
        TLRPC.Message message = k47Var.k;
        return (message == null || !(message.isThreadMessage || k47Var.k3()) || k47Var.k.fwd_from == null) ? new cva(k47.B0(k47Var.k), k47Var.e1()) : new cva(k47Var.Z0(), k47Var.k.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cva) {
            cva cvaVar = (cva) obj;
            if (cvaVar.a == this.a && cvaVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
