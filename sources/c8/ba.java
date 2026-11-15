package c8;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class ba {
    public e2.q0 a(o3.a aVar) {
        ByteBuffer byteBuffer = aVar.c;
        byteBuffer.getClass();
        a8.ja.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(aVar, byteBuffer);
    }

    public abstract e2.q0 b(o3.a aVar, ByteBuffer byteBuffer);
}
