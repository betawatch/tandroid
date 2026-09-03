package j7;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class c7 {
    public e4.c a(e4.e eVar) {
        ByteBuffer byteBuffer = eVar.d;
        byteBuffer.getClass();
        h5.a.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.d(TLObject.FLAG_31)) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    public abstract e4.c b(e4.e eVar, ByteBuffer byteBuffer);
}
