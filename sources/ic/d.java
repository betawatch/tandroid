package ic;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends b {
    public static final Logger m = Logger.getLogger(d.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public a j;
    public ArrayList k;
    public byte[] l;

    @Override // ic.b
    public final void b(ByteBuffer byteBuffer) {
        this.d = g5.b.a(byteBuffer.get());
        int a10 = g5.b.a(byteBuffer.get());
        this.e = a10 >>> 2;
        this.f = (a10 >> 1) & 1;
        this.g = g5.b.a(byteBuffer.get()) + (g5.b.h(byteBuffer) << 8);
        this.h = g5.b.i(byteBuffer);
        this.i = g5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            b a11 = k.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a11 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a11.a()));
            int a12 = a11.a();
            if (position2 < a12) {
                byte[] bArr = new byte[a12 - position2];
                this.l = bArr;
                byteBuffer.get(bArr);
            }
            if (a11 instanceof a) {
                this.j = (a) a11;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            b a13 = k.a(this.d, byteBuffer);
            logger.finer(a13 + " - DecoderConfigDescr2 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a13.a()));
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb2.append(this.d);
        sb2.append(", streamType=");
        sb2.append(this.e);
        sb2.append(", upStream=");
        sb2.append(this.f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.g);
        sb2.append(", maxBitRate=");
        sb2.append(this.h);
        sb2.append(", avgBitRate=");
        sb2.append(this.i);
        sb2.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb2.append(this.j);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(g5.b.c(0, bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.k;
        sb2.append(arrayList == null ? "null" : Arrays.asList(arrayList).toString());
        sb2.append('}');
        return sb2.toString();
    }
}
