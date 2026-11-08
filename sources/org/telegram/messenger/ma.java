package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class ma {
    public final long a;
    public final int b;

    public ma(TLRPC.Message message) {
        long B0 = ij.B0(message);
        int i7 = message.id;
        this.a = B0;
        this.b = i7;
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
