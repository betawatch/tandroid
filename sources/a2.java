// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class a2 extends yg0 implements iy0 {
    public yg0 d;
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

    @Override // iy0
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        c(writableByteChannel);
    }

    @Override // iy0
    public final wu2 getParent() {
        return this.d;
    }

    @Override // iy0
    public long getSize() {
        long b = b();
        return b + (8 + b >= 4294967296L ? 16 : 8);
    }

    @Override // iy0
    public final String getType() {
        return this.e;
    }

    @Override // iy0
    public final void setParent(wu2 wu2Var) {
        this.d = (yg0) wu2Var;
    }
}
