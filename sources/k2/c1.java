package k2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c1 extends c2.p {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // c2.o
    public final void b(ByteBuffer byteBuffer) {
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

    @Override // c2.p
    public final c2.l h(c2.l lVar) {
        int i10 = lVar.c;
        if (e2.n0.L(i10) || i10 == 2) {
            return i10 != 4 ? new c2.l(lVar.a, lVar.b, 4) : c2.l.e;
        }
        throw new c2.n(lVar);
    }
}
