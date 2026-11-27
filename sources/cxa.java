// default package

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cxa {
    public final long a;
    public final int b;

    public cxa(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static cxa a(int i, long j) {
        return new cxa(j, i);
    }

    public static cxa b(r47 r47Var) {
        if (r47Var == null) {
            return null;
        }
        TLRPC.Message message = r47Var.k;
        return (message == null || !(message.isThreadMessage || r47Var.k3()) || r47Var.k.fwd_from == null) ? new cxa(r47.B0(r47Var.k), r47Var.e1()) : new cxa(r47Var.Z0(), r47Var.k.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cxa) {
            cxa cxaVar = (cxa) obj;
            if (cxaVar.a == this.a && cxaVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
