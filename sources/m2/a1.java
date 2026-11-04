package m2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a1 extends e2.n {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void m(int i3, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i3 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // e2.m
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer l10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i10 = this.b.c;
        if (i10 == 2) {
            l10 = l(i3 * 2);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), l10);
                position += 2;
            }
        } else if (i10 == 1342177280) {
            l10 = l((i3 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l10);
                position += 3;
            }
        } else if (i10 == 1610612736) {
            l10 = l(i3);
            while (position < limit) {
                m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l10);
                position += 4;
            }
        } else if (i10 == 1879048192) {
            l10 = l(i3 / 2);
            while (position < limit) {
                l10.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        } else if (i10 == 21) {
            l10 = l((i3 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l10);
                position += 3;
            }
        } else {
            if (i10 != 22) {
                throw new IllegalStateException();
            }
            l10 = l(i3);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l10);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l10.flip();
    }

    @Override // e2.n
    public final e2.j h(e2.j jVar) {
        int i3 = jVar.c;
        if (g2.n0.L(i3) || i3 == 2) {
            return i3 != 4 ? new e2.j(jVar.a, jVar.b, 4) : e2.j.e;
        }
        throw new e2.l(jVar);
    }
}
