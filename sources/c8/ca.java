package c8;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class ca {
    public e2.q0 a(o3.a aVar) {
        ByteBuffer byteBuffer = aVar.c;
        byteBuffer.getClass();
        a8.ia.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(aVar, byteBuffer);
    }

    public abstract e2.q0 b(o3.a aVar, ByteBuffer byteBuffer);
}
