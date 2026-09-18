package mc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class m extends b {
    public int d;

    @Override // mc.b
    public final void b(ByteBuffer byteBuffer) {
        this.d = e5.b.a(byteBuffer.get());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m.class == obj.getClass() && this.d == ((m) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "SLConfigDescriptor{predefined=" + this.d + '}';
    }
}
