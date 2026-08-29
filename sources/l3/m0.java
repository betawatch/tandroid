package l3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m0 extends y {
    public static final int i = Float.floatToIntBits(Float.NaN);

    @Override // l3.j
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

    @Override // l3.y
    public final h f(h hVar) {
        int i10 = hVar.c;
        if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 4 ? new h(hVar.a, hVar.b, 4) : h.e;
        }
        throw new i(hVar);
    }
}
