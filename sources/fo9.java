// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fo9 extends rf0 {
    public int d;

    @Override // rf0
    public final void b(ByteBuffer byteBuffer) {
        this.d = hle.a(byteBuffer.get());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fo9.class == obj.getClass() && this.d == ((fo9) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "SLConfigDescriptor{predefined=" + this.d + '}';
    }
}
