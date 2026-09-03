package j7;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class d7 {
    public e4.c a(e4.e eVar) {
        ByteBuffer byteBuffer = eVar.d;
        byteBuffer.getClass();
        h5.a.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.e(TLObject.FLAG_31)) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    public abstract e4.c b(e4.e eVar, ByteBuffer byteBuffer);
}
