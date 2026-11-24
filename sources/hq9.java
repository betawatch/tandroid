// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hq9 extends rg0 {
    public int d;

    @Override // rg0
    public final void b(ByteBuffer byteBuffer) {
        this.d = jne.a(byteBuffer.get());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hq9.class == obj.getClass() && this.d == ((hq9) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "SLConfigDescriptor{predefined=" + this.d + '}';
    }
}
