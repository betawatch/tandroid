package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class fa {
    public final long a;
    public final int b;

    public fa(TLRPC.Message message) {
        long B0 = zi.B0(message);
        int i3 = message.id;
        this.a = B0;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fa.class == obj.getClass()) {
            fa faVar = (fa) obj;
            if (this.a == faVar.a && this.b == faVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
