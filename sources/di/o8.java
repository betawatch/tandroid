package di;

import j$.util.Objects;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o8 {
    public final long a;
    public final int b;

    public o8(long j3, int i7) {
        this.a = j3;
        this.b = i7;
    }

    public static o8 a(int i7, long j3) {
        return new o8(j3, i7);
    }

    public static o8 b(gj gjVar) {
        if (gjVar == null) {
            return null;
        }
        TLRPC.Message message = gjVar.k;
        return (message == null || !(message.isThreadMessage || gjVar.k3()) || gjVar.k.fwd_from == null) ? new o8(gj.B0(gjVar.k), gjVar.e1()) : new o8(gjVar.Z0(), gjVar.k.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o8) {
            o8 o8Var = (o8) obj;
            if (o8Var.a == this.a && o8Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
