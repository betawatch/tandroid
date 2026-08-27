package h7;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class p8 {
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
