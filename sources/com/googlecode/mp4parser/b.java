package com.googlecode.mp4parser;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b extends e implements q2.b {
    public e d;
    public final String e;

    public b(String str) {
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

    @Override // q2.b
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        c(writableByteChannel);
    }

    @Override // q2.b
    public final q2.f getParent() {
        return this.d;
    }

    @Override // q2.b
    public long getSize() {
        long b10 = b();
        return b10 + (8 + b10 >= 4294967296L ? 16 : 8);
    }

    @Override // q2.b
    public final String getType() {
        return this.e;
    }

    @Override // q2.b
    public final void setParent(q2.f fVar) {
        this.d = (e) fVar;
    }
}
