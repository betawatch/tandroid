// default package

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m32 {
    public final int a;
    public final long b;

    public m32(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static m32 a(Object obj) {
        if (obj instanceof yv2) {
            return new m32(2, ((yv2) obj).a);
        }
        if (obj instanceof TLRPC.User) {
            return new m32(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m32.class != obj.getClass()) {
            return false;
        }
        m32 m32Var = (m32) obj;
        return this.b == m32Var.b && this.a == m32Var.a;
    }

    public final int hashCode() {
        return Objects.hash(wi8.b(this.a), Long.valueOf(this.b));
    }
}
