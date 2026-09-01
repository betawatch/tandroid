package j7;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
