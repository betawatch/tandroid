package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class cj {
    public final int a;
    public final long b;

    public cj(int i7, long j3) {
        this.a = i7;
        this.b = j3;
    }

    public static cj a(Object obj) {
        if (obj instanceof org.telegram.messenger.d5) {
            return new cj(2, ((org.telegram.messenger.d5) obj).a);
        }
        if (obj instanceof TLRPC.User) {
            return new cj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cj.class != obj.getClass()) {
            return false;
        }
        cj cjVar = (cj) obj;
        return this.b == cjVar.b && this.a == cjVar.a;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.a), Long.valueOf(this.b));
    }
}
