// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
