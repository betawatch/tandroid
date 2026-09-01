package d4;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g extends n3.i {
    public long s;
    public int v;
    public int w;

    @Override // n3.i, n3.a
    public final void b() {
        super.b();
        this.v = 0;
    }

    public final boolean m(n3.i iVar) {
        ByteBuffer byteBuffer;
        h5.a.f(!iVar.e(TLObject.FLAG_30));
        h5.a.f(!iVar.e(TLObject.FLAG_28));
        h5.a.f(!iVar.e(4));
        int i10 = this.v;
        if (i10 > 0) {
            if (i10 >= this.w || iVar.e(TLObject.FLAG_31) != e(TLObject.FLAG_31)) {
                return false;
            }
            ByteBuffer byteBuffer2 = iVar.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.v;
        this.v = i11 + 1;
        if (i11 == 0) {
            this.f = iVar.f;
            if (iVar.e(1)) {
                this.b = 1;
            }
        }
        if (iVar.e(TLObject.FLAG_31)) {
            this.b = TLObject.FLAG_31;
        }
        ByteBuffer byteBuffer3 = iVar.d;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.s = iVar.f;
        return true;
    }
}
