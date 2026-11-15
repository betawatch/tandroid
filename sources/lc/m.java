package lc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class m extends b {
    public int d;

    @Override // lc.b
    public final void b(ByteBuffer byteBuffer) {
        this.d = h5.b.a(byteBuffer.get());
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
