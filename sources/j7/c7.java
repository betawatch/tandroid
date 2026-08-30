package j7;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class c7 {
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
