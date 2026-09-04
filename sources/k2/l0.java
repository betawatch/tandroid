package k2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class l0 extends c2.i {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void k(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // c2.h
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer j3;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.b.c;
        if (i11 == 21) {
            j3 = j((i10 / 3) * 4);
            while (position < limit) {
                k(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), j3);
                position += 3;
            }
        } else if (i11 == 22) {
            j3 = j(i10);
            while (position < limit) {
                k((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), j3);
                position += 4;
            }
        } else if (i11 == 1342177280) {
            j3 = j((i10 / 3) * 4);
            while (position < limit) {
                k(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j3);
                position += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            j3 = j(i10);
            while (position < limit) {
                k((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j3);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j3.flip();
    }

    @Override // c2.i
    public final c2.f f(c2.f fVar) {
        int i10 = fVar.c;
        if (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return i10 != 4 ? new c2.f(fVar.a, fVar.b, 4) : c2.f.e;
        }
        throw new c2.g(fVar);
    }
}
