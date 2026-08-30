package l3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u0 extends a0 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    @Override // l3.n
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer j10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.b.c;
        int i12 = i;
        if (i11 == 536870912) {
            j10 = j((i10 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits == i12) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                j10.putInt(floatToIntBits);
                position += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            j10 = j(i10);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i12) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                j10.putInt(floatToIntBits2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j10.flip();
    }

    @Override // l3.a0
    public final l f(l lVar) {
        int i10 = lVar.c;
        if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 4 ? new l(lVar.a, lVar.b, 4) : l.e;
        }
        throw new m(lVar);
    }
}
