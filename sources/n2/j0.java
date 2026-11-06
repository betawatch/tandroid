package n2;

import a8.ia;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class j0 extends f2.o {
    public int[] i;
    public int[] j;

    @Override // f2.n
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i7 : iArr) {
                int u10 = (h2.m0.u(this.b.c) * i7) + position;
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
                        ia.h((i11 & (-16777216)) == 0 || (i11 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i11));
                        ia.f(l10.remaining() >= 3);
                        l10.put((byte) (l10.order() == byteOrder ? (i11 & 16711680) >> 16 : i11 & qs.e4)).put((byte) ((i11 & 65280) >> 8)).put((byte) (l10.order() == byteOrder ? i11 & qs.e4 : (i11 & 16711680) >> 16));
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

    @Override // f2.o
    public final f2.k h(f2.k kVar) {
        int i7 = kVar.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return f2.k.e;
        }
        int i10 = kVar.b;
        if (!h2.m0.M(i7)) {
            throw new f2.m(kVar);
        }
        boolean z9 = i10 != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= i10) {
                throw new f2.m("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", kVar);
            }
            z9 |= i12 != i11;
            i11++;
        }
        return z9 ? new f2.k(kVar.a, iArr.length, i7) : f2.k.e;
    }

    @Override // f2.o
    public final void i() {
        this.j = this.i;
    }

    @Override // f2.o
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
