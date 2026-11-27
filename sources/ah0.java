// default package

import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ah0 extends s93 {
    public long r;
    public int s;
    public byte w;

    @Override // s93, w01
    public final void clear() {
        super.clear();
        this.s = 0;
    }

    public final boolean e(s93 s93Var) {
        ByteBuffer byteBuffer;
        yve.f(!s93Var.getFlag(TLObject.FLAG_30));
        yve.f(!s93Var.hasSupplementalData());
        yve.f(!s93Var.isEndOfStream());
        if (f()) {
            if (this.s >= this.w) {
                return false;
            }
            ByteBuffer byteBuffer2 = s93Var.c;
            if (byteBuffer2 != null && (byteBuffer = this.c) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.s;
        this.s = i + 1;
        if (i == 0) {
            this.e = s93Var.e;
            if (s93Var.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = s93Var.c;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.c.put(byteBuffer3);
        }
        this.r = s93Var.e;
        return true;
    }

    public final boolean f() {
        return this.s > 0;
    }
}
