package c8;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
