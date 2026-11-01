package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class na {
    public final long a;
    public final int b;

    public na(TLRPC.Message message) {
        long B0 = kj.B0(message);
        int i10 = message.id;
        this.a = B0;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && na.class == obj.getClass()) {
            na naVar = (na) obj;
            if (this.a == naVar.a && this.b == naVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
