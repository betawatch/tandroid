package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class la {
    public final long a;
    public final int b;

    public la(TLRPC.Message message) {
        long B0 = gj.B0(message);
        int i7 = message.id;
        this.a = B0;
        this.b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && la.class == obj.getClass()) {
            la laVar = (la) obj;
            if (this.a == laVar.a && this.b == laVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
