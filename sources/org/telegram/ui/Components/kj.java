package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kj {
    public final int a;
    public final long b;

    public kj(int i7, long j3) {
        this.a = i7;
        this.b = j3;
    }

    public static kj a(Object obj) {
        if (obj instanceof org.telegram.messenger.f5) {
            return new kj(2, ((org.telegram.messenger.f5) obj).a);
        }
        if (obj instanceof TLRPC.User) {
            return new kj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kj.class != obj.getClass()) {
            return false;
        }
        kj kjVar = (kj) obj;
        return this.b == kjVar.b && this.a == kjVar.a;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.a), Long.valueOf(this.b));
    }
}
