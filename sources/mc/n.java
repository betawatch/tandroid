package mc;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class n extends b {
    public ByteBuffer d;

    static {
        Logger.getLogger(n.class.getName());
    }

    @Override // mc.b
    public final void b(ByteBuffer byteBuffer) {
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.a + ", sizeOfInstance=" + this.b + ", data=" + this.d + '}';
    }
}
