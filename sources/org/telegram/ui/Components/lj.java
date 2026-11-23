package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class lj {
    public final int a;
    public final long b;

    public lj(int i7, long j3) {
        this.a = i7;
        this.b = j3;
    }

    public static lj a(Object obj) {
        if (obj instanceof org.telegram.messenger.f5) {
            return new lj(2, ((org.telegram.messenger.f5) obj).a);
        }
        if (obj instanceof TLRPC.User) {
            return new lj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lj.class != obj.getClass()) {
            return false;
        }
        lj ljVar = (lj) obj;
        return this.b == ljVar.b && this.a == ljVar.a;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.a), Long.valueOf(this.b));
    }
}
