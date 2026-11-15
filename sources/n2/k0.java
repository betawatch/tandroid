package n2;

import a8.ja;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class k0 extends f2.n {
    public int[] i;
    public int[] j;

    @Override // f2.m
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i7 : iArr) {
                int u10 = (h2.l0.u(this.b.c) * i7) + position;
                int i10 = this.b.c;
                if (i10 != 2) {
                    if (i10 == 3) {
                        l10.put(byteBuffer.get(u10));
                    } else if (i10 != 4) {
                        if (i10 != 21) {
                            if (i10 != 22) {
                                if (i10 != 268435456) {
                                    if (i10 != 1342177280) {
                                        if (i10 != 1610612736) {
                                            if (i10 != 1879048192) {
                                                throw new IllegalStateException("Unexpected encoding: " + this.b.c);
                                            }
                                            l10.putDouble(byteBuffer.getDouble(u10));
                                        }
                                    }
                                }
                            }
                            l10.putInt(byteBuffer.getInt(u10));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b10 = byteBuffer.get(order == byteOrder ? u10 : u10 + 2);
                        byte b11 = byteBuffer.get(u10 + 1);
                        if (byteBuffer.order() == byteOrder) {
                            u10 += 2;
                        }
                        int i11 = ((((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680)) | ((byteBuffer.get(u10) << 8) & 65280)) >> 8;
                        ja.h((i11 & (-16777216)) == 0 || (i11 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i11));
                        ja.f(l10.remaining() >= 3);
                        l10.put((byte) (l10.order() == byteOrder ? (i11 & 16711680) >> 16 : i11 & ns.e4)).put((byte) ((i11 & 65280) >> 8)).put((byte) (l10.order() == byteOrder ? i11 & ns.e4 : (i11 & 16711680) >> 16));
                    } else {
                        l10.putFloat(byteBuffer.getFloat(u10));
                    }
                }
                l10.putShort(byteBuffer.getShort(u10));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    @Override // f2.n
    public final f2.j h(f2.j jVar) {
        int i7 = jVar.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return f2.j.e;
        }
        int i10 = jVar.b;
        if (!h2.l0.M(i7)) {
            throw new f2.l(jVar);
        }
        boolean z10 = i10 != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= i10) {
                throw new f2.l("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", jVar);
            }
            z10 |= i12 != i11;
            i11++;
        }
        return z10 ? new f2.j(jVar.a, iArr.length, i7) : f2.j.e;
    }

    @Override // f2.n
    public final void i() {
        this.j = this.i;
    }

    @Override // f2.n
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
