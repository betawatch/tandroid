package mc;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    @Override // mc.b
    public final void b(ByteBuffer byteBuffer) {
        this.d = e5.b.a(byteBuffer.get());
        int a2 = e5.b.a(byteBuffer.get());
        this.e = a2 >>> 2;
        this.f = (a2 >> 1) & 1;
        this.g = e5.b.a(byteBuffer.get()) + (e5.b.h(byteBuffer) << 8);
        this.h = e5.b.i(byteBuffer);
        this.i = e5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining();
        Logger logger = m;
        if (remaining > 2) {
            int position = byteBuffer.position();
            b a10 = k.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            logger.finer(a10 + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a10.a()));
            int a11 = a10.a();
            if (position2 < a11) {
                byte[] bArr = new byte[a11 - position2];
                this.l = bArr;
                byteBuffer.get(bArr);
            }
            if (a10 instanceof a) {
                this.j = (a) a10;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            b a12 = k.a(this.d, byteBuffer);
            logger.finer(a12 + " - DecoderConfigDescr2 read: " + (byteBuffer.position() - position3) + ", size: " + Integer.valueOf(a12.a()));
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
        sb2.append(e5.b.c(0, bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        ArrayList arrayList = this.k;
        sb2.append(arrayList == null ? BuildConfig.BETA_URL : Arrays.asList(arrayList).toString());
        sb2.append('}');
        return sb2.toString();
    }
}
