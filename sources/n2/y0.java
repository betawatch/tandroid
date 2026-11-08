package n2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class y0 extends f2.o {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void m(int i7, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i7 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // f2.n
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer l10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i10 = this.b.c;
        if (i10 == 2) {
            l10 = l(i7 * 2);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), l10);
                position += 2;
            }
        } else if (i10 == 1342177280) {
            l10 = l((i7 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l10);
                position += 3;
            }
        } else if (i10 == 1610612736) {
            l10 = l(i7);
            while (position < limit) {
                m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l10);
                position += 4;
            }
        } else if (i10 == 1879048192) {
            l10 = l(i7 / 2);
            while (position < limit) {
                l10.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        } else if (i10 == 21) {
            l10 = l((i7 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l10);
                position += 3;
            }
        } else {
            if (i10 != 22) {
                throw new IllegalStateException();
            }
            l10 = l(i7);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l10);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l10.flip();
    }

    @Override // f2.o
    public final f2.k h(f2.k kVar) {
        int i7 = kVar.c;
        if (h2.m0.L(i7) || i7 == 2) {
            return i7 != 4 ? new f2.k(kVar.a, kVar.b, 4) : f2.k.e;
        }
        throw new f2.m(kVar);
    }
}
