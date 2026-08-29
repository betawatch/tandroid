package a4;

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i extends m3.i {
    public long n;
    public int r;
    public int s;

    @Override // m3.i, m3.a
    public final void clear() {
        super.clear();
        this.r = 0;
    }

    public final boolean d(m3.i iVar) {
        ByteBuffer byteBuffer;
        f5.a.f(!iVar.getFlag(TLObject.FLAG_30));
        f5.a.f(!iVar.hasSupplementalData());
        f5.a.f(!iVar.isEndOfStream());
        int i10 = this.r;
        if (i10 > 0) {
            if (i10 >= this.s || iVar.isDecodeOnly() != isDecodeOnly()) {
                return false;
            }
            ByteBuffer byteBuffer2 = iVar.b;
            if (byteBuffer2 != null && (byteBuffer = this.b) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.r;
        this.r = i11 + 1;
        if (i11 == 0) {
            this.d = iVar.d;
            if (iVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (iVar.isDecodeOnly()) {
            setFlags(TLObject.FLAG_31);
        }
        ByteBuffer byteBuffer3 = iVar.b;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.b.put(byteBuffer3);
        }
        this.n = iVar.d;
        return true;
    }
}
