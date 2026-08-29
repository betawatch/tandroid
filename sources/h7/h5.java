package h7;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class h5 {
    public b4.c a(b4.e eVar) {
        ByteBuffer byteBuffer = eVar.b;
        byteBuffer.getClass();
        f5.a.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.isDecodeOnly()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    public abstract b4.c b(b4.e eVar, ByteBuffer byteBuffer);
}
