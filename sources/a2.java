// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class a2 extends yh0 implements pz0 {
    public yh0 d;
    public final String e;

    public a2(String str) {
        this.a = null;
        this.b = new ArrayList();
        this.e = str;
    }

    public final ByteBuffer d() {
        ByteBuffer wrap;
        long size = getSize();
        String str = this.e;
        if (size >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = str.getBytes()[0];
            bArr[5] = str.getBytes()[1];
            bArr[6] = str.getBytes()[2];
            bArr[7] = str.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            wrap.position(8);
            wrap.putLong(getSize());
        } else {
            wrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, str.getBytes()[0], str.getBytes()[1], str.getBytes()[2], str.getBytes()[3]});
            wrap.putInt((int) getSize());
        }
        wrap.rewind();
        return wrap;
    }

    @Override // pz0
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        c(writableByteChannel);
    }

    @Override // pz0
    public final gw2 getParent() {
        return this.d;
    }

    @Override // pz0
    public long getSize() {
        long b = b();
        return b + (8 + b >= 4294967296L ? 16 : 8);
    }

    @Override // pz0
    public final String getType() {
        return this.e;
    }

    @Override // pz0
    public final void setParent(gw2 gw2Var) {
        this.d = (yh0) gw2Var;
    }
}
