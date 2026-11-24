// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ha3 extends rg0 {
    public static final Logger m = Logger.getLogger(ha3.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public y40 j;
    public ArrayList k;
    public byte[] l;

    @Override // rg0
    public final void b(ByteBuffer byteBuffer) {
        this.d = jne.a(byteBuffer.get());
        int a = jne.a(byteBuffer.get());
        this.e = a >>> 2;
        this.f = (a >> 1) & 1;
        this.g = jne.a(byteBuffer.get()) + (jne.f(byteBuffer) << 8);
        this.h = jne.g(byteBuffer);
        this.i = jne.g(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            rg0 a2 = bq7.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a2 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a2.a()));
            int a3 = a2.a();
            if (position2 < a3) {
                byte[] bArr = new byte[a3 - position2];
                this.l = bArr;
                byteBuffer.get(bArr);
            }
            if (a2 instanceof y40) {
                this.j = (y40) a2;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            rg0 a4 = bq7.a(this.d, byteBuffer);
            logger.finer(a4 + " - DecoderConfigDescr2 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a4.a()));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb.append(this.d);
        sb.append(", streamType=");
        sb.append(this.e);
        sb.append(", upStream=");
        sb.append(this.f);
        sb.append(", bufferSizeDB=");
        sb.append(this.g);
        sb.append(", maxBitRate=");
        sb.append(this.h);
        sb.append(", avgBitRate=");
        sb.append(this.i);
        sb.append(", decoderSpecificInfo=null, audioSpecificInfo=");
        sb.append(this.j);
        sb.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append(gcd.a(0, bArr));
        sb.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.k;
        sb.append(arrayList == null ? "null" : Arrays.asList(arrayList).toString());
        sb.append('}');
        return sb.toString();
    }
}
