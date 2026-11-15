package n2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class z0 extends f2.n {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void m(int i7, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i7 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // f2.m
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

    @Override // f2.n
    public final f2.j h(f2.j jVar) {
        int i7 = jVar.c;
        if (h2.l0.L(i7) || i7 == 2) {
            return i7 != 4 ? new f2.j(jVar.a, jVar.b, 4) : f2.j.e;
        }
        throw new f2.l(jVar);
    }
}
