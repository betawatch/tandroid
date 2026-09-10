package k2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class t extends c2.i {
    public int[] i;
    public int[] j;

    @Override // c2.h
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j3 = j(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i10 : iArr) {
                int t10 = (e2.d0.t(this.b.c) * i10) + position;
                int i11 = this.b.c;
                if (i11 != 2) {
                    if (i11 == 3) {
                        j3.put(byteBuffer.get(t10));
                    } else if (i11 != 4) {
                        if (i11 != 21) {
                            if (i11 != 22) {
                                if (i11 != 268435456) {
                                    if (i11 != 1342177280) {
                                        if (i11 != 1610612736) {
                                            throw new IllegalStateException("Unexpected encoding: " + this.b.c);
                                        }
                                    }
                                }
                            }
                            j3.putInt(byteBuffer.getInt(t10));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b10 = byteBuffer.get(order == byteOrder ? t10 : t10 + 2);
                        byte b11 = byteBuffer.get(t10 + 1);
                        if (byteBuffer.order() == byteOrder) {
                            t10 += 2;
                        }
                        int i12 = ((((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680)) | ((byteBuffer.get(t10) << 8) & 65280)) >> 8;
                        e2.d.a("Value out of range of 24-bit integer: " + Integer.toHexString(i12), (i12 & (-16777216)) == 0 || (i12 & (-8388608)) == -8388608);
                        e2.d.b(j3.remaining() >= 3);
                        j3.put((byte) (j3.order() == byteOrder ? (i12 & 16711680) >> 16 : i12 & 255)).put((byte) ((i12 & 65280) >> 8)).put((byte) (j3.order() == byteOrder ? i12 & 255 : (i12 & 16711680) >> 16));
                    } else {
                        j3.putFloat(byteBuffer.getFloat(t10));
                    }
                }
                j3.putShort(byteBuffer.getShort(t10));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        j3.flip();
    }

    @Override // c2.i
    public final c2.f f(c2.f fVar) {
        int i10 = fVar.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return c2.f.e;
        }
        int i11 = fVar.b;
        if (!e2.d0.K(i10)) {
            throw new c2.g(fVar);
        }
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new c2.g("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", fVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        return z10 ? new c2.f(fVar.a, iArr.length, i10) : c2.f.e;
    }

    @Override // c2.i
    public final void g() {
        this.j = this.i;
    }

    @Override // c2.i
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
