package k2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class m0 extends c2.o {
    public int[] i;
    public int[] j;

    @Override // c2.n
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l4 = l(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i10 : iArr) {
                int u10 = (e2.m0.u(this.b.c) * i10) + position;
                int i11 = this.b.c;
                if (i11 != 2) {
                    if (i11 == 3) {
                        l4.put(byteBuffer.get(u10));
                    } else if (i11 != 4) {
                        if (i11 != 21) {
                            if (i11 != 22) {
                                if (i11 != 268435456) {
                                    if (i11 != 1342177280) {
                                        if (i11 != 1610612736) {
                                            if (i11 != 1879048192) {
                                                throw new IllegalStateException("Unexpected encoding: " + this.b.c);
                                            }
                                            l4.putDouble(byteBuffer.getDouble(u10));
                                        }
                                    }
                                }
                            }
                            l4.putInt(byteBuffer.getInt(u10));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b10 = byteBuffer.get(order == byteOrder ? u10 : u10 + 2);
                        byte b11 = byteBuffer.get(u10 + 1);
                        if (byteBuffer.order() == byteOrder) {
                            u10 += 2;
                        }
                        int i12 = ((((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680)) | ((byteBuffer.get(u10) << 8) & 65280)) >> 8;
                        u6.h((i12 & (-16777216)) == 0 || (i12 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i12));
                        u6.g(l4.remaining() >= 3);
                        l4.put((byte) (l4.order() == byteOrder ? (i12 & 16711680) >> 16 : i12 & 255)).put((byte) ((i12 & 65280) >> 8)).put((byte) (l4.order() == byteOrder ? i12 & 255 : (i12 & 16711680) >> 16));
                    } else {
                        l4.putFloat(byteBuffer.getFloat(u10));
                    }
                }
                l4.putShort(byteBuffer.getShort(u10));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        l4.flip();
    }

    @Override // c2.o
    public final c2.k h(c2.k kVar) {
        int i10 = kVar.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return c2.k.e;
        }
        int i11 = kVar.b;
        if (!e2.m0.M(i10)) {
            throw new c2.m(kVar);
        }
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new c2.m("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", kVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        return z10 ? new c2.k(kVar.a, iArr.length, i10) : c2.k.e;
    }

    @Override // c2.o
    public final void i() {
        this.j = this.i;
    }

    @Override // c2.o
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
