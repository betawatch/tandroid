package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class jj {
    public final int a;
    public final long b;

    public jj(int i7, long j3) {
        this.a = i7;
        this.b = j3;
    }

    public static jj a(Object obj) {
        if (obj instanceof org.telegram.messenger.f5) {
            return new jj(2, ((org.telegram.messenger.f5) obj).a);
        }
        if (obj instanceof TLRPC.User) {
            return new jj(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jj.class != obj.getClass()) {
            return false;
        }
        jj jjVar = (jj) obj;
        return this.b == jjVar.b && this.a == jjVar.a;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.a), Long.valueOf(this.b));
    }
}
