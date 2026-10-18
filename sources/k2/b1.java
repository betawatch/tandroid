package k2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class b1 extends c2.o {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // c2.n
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer l4;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.b.c;
        if (i11 == 2) {
            l4 = l(i10 * 2);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), l4);
                position += 2;
            }
        } else if (i11 == 1342177280) {
            l4 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l4);
                position += 3;
            }
        } else if (i11 == 1610612736) {
            l4 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l4);
                position += 4;
            }
        } else if (i11 == 1879048192) {
            l4 = l(i10 / 2);
            while (position < limit) {
                l4.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        } else if (i11 == 21) {
            l4 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l4);
                position += 3;
            }
        } else {
            if (i11 != 22) {
                throw new IllegalStateException();
            }
            l4 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l4);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l4.flip();
    }

    @Override // c2.o
    public final c2.k h(c2.k kVar) {
        int i10 = kVar.c;
        if (e2.m0.L(i10) || i10 == 2) {
            return i10 != 4 ? new c2.k(kVar.a, kVar.b, 4) : c2.k.e;
        }
        throw new c2.m(kVar);
    }
}
