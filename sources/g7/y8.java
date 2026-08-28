package g7;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class y8 {
    public z3.c a(z3.e eVar) {
        ByteBuffer byteBuffer = eVar.b;
        byteBuffer.getClass();
        d5.a.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.isDecodeOnly()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    public abstract z3.c b(z3.e eVar, ByteBuffer byteBuffer);
}
