package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ma {
    public final long a;
    public final int b;

    public ma(TLRPC.Message message) {
        long B0 = jj.B0(message);
        int i10 = message.id;
        this.a = B0;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ma.class == obj.getClass()) {
            ma maVar = (ma) obj;
            if (this.a == maVar.a && this.b == maVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
