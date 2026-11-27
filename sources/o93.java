// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class o93 extends tf0 {
    public static final Logger m = Logger.getLogger(o93.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public z30 j;
    public ArrayList k;
    public byte[] l;

    @Override // tf0
    public final void b(ByteBuffer byteBuffer) {
        this.d = zpe.a(byteBuffer.get());
        int a = zpe.a(byteBuffer.get());
        this.e = a >>> 2;
        this.f = (a >> 1) & 1;
        this.g = zpe.a(byteBuffer.get()) + (zpe.f(byteBuffer) << 8);
        this.h = zpe.g(byteBuffer);
        this.i = zpe.g(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            tf0 a2 = yq7.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a2 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a2.a()));
            int a3 = a2.a();
            if (position2 < a3) {
                byte[] bArr = new byte[a3 - position2];
                this.l = bArr;
                byteBuffer.get(bArr);
            }
            if (a2 instanceof z30) {
                this.j = (z30) a2;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            tf0 a4 = yq7.a(this.d, byteBuffer);
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
        sb.append(xed.a(0, bArr));
        sb.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.k;
        sb.append(arrayList == null ? "null" : Arrays.asList(arrayList).toString());
        sb.append('}');
        return sb.toString();
    }
}
