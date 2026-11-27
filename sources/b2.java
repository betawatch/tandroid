// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class b2 extends zg0 implements qy0 {
    public zg0 d;
    public final String e;

    public b2(String str) {
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

    @Override // qy0
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        c(writableByteChannel);
    }

    @Override // qy0
    public final qv2 getParent() {
        return this.d;
    }

    @Override // qy0
    public long getSize() {
        long b = b();
        return b + (8 + b >= 4294967296L ? 16 : 8);
    }

    @Override // qy0
    public final String getType() {
        return this.e;
    }

    @Override // qy0
    public final void setParent(qv2 qv2Var) {
        this.d = (zg0) qv2Var;
    }
}
